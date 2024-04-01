import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class TrainingRecordViewerTest {

    private TrainingRecordViewer viewer;

    @BeforeEach
    public void setUp() {
        viewer = new TrainingRecordViewer();
    }

    @Test
    public void testViewTrainingRecord_validEmployeeId_multipleCourses() throws SQLException {
        String employeeId = "EMP123";

        // Capture the output stream to verify printed messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        viewer.viewTrainingRecord(employeeId);

        // Assert expected output based on the test case scenario
        String expectedOutput = "... (contains expected output for multiple courses)";
        assertEquals(expectedOutput, outContent.toString());

        // Reset the output stream
        System.setOut(System.out);
    }

    @ParameterizedTest
    @ValueSource(strings = {"INVALID_ID", "EMP456"})
    public void testViewTrainingRecord_invalidEmployeeIdOrNoCourses(String employeeId) throws SQLException {
        // Capture the output stream to verify printed messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        viewer.viewTrainingRecord(employeeId);

        // Assert expected output based on the test case scenario
        String expectedOutput = "... (contains expected output for invalid ID or no courses)";
        assertEquals(expectedOutput, outContent.toString());

        // Reset the output stream
        System.setOut(System.out);
    }

    @Test //checks exam results with passing score
    public void testCheckExamResult_passingScore() {
        String employeeId = "EMP123";
        String courseTitle = "Course 1";
        int score = 95;

        try {
            String result = viewer.checkExamResult(employeeId, courseTitle, score);
            assertEquals("Training Passed", result);
        } catch (SQLException e) {
            fail("An unexpected SQLException occurred: " + e.getMessage());
        }
    }

    @Test  //checks exam results with failing score
    public void testCheckExamResult_failingScore() throws SQLException {
        String employeeId = "EMP123";
        String courseTitle = "Course 1";
        int score = 65;

        String result = viewer.checkExamResult(employeeId, courseTitle, score);
        assertEquals("Training Failed", result);
    }

    @Test  //checks whether an exam result is invalid
    public void testCheckExamResult_invalidScore() {
        String employeeId = "EMP123";
        String courseTitle = "Course 1";
        int score = 150;

        assertThrows(IllegalArgumentException.class, () -> viewer.checkExamResult(employeeId, courseTitle, score));
    }
}


