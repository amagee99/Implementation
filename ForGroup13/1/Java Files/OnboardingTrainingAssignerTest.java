import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OnboardingTrainingAssignerTest {

    private static final String URL = "jdbc:oracle:thin:@localhost:4331:employee_training";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";

    @Test
    public void testAssignOnboardingTraining_ForNewHires() throws SQLException {
        // Assigns onboarding training for new hire
        OnboardingTrainingAssigner.assignOnboardingTraining("IT", "EMP123");

        // Verifies that training is correctly assigned
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM employee_training WHERE employee_id = 'EMP123'")) {
            try (ResultSet rs = stmt.executeQuery()) {
                assertTrue(rs.next());
                // Add more assertions as needed
            }
        }
    }

    @Test
    public void testAssignOnboardingTraining_DepartmentSpecific() throws SQLException {
        // Assign new training course to an employee in that department
        OnboardingTrainingAssigner.assignOnboardingTraining("IT", "EMP123");

        // Verify that training course is correctly assigned
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM employee_training WHERE employee_id = 'EMP123'")) {
            try (ResultSet rs = stmt.executeQuery()) {
                assertTrue(rs.next());
                // Add more assertions as needed
            }
        }
    }

    @Test
    public void testAssignOnboardingTraining_DepartmentAdministratorAssignment() throws SQLException {
        // Assign onboarding training for a new hire using department administrator
        OnboardingTrainingAssigner.assignOnboardingTraining("IT", "EMP123");

        // Verify that training is correctly assigned
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM employee_training WHERE employee_id = 'EMP123'")) {
            try (ResultSet rs = stmt.executeQuery()) {
                assertTrue(rs.next());
                // Add more assertions as needed
            }
        }
    }

    @Test
    public void testAssignOnboardingTraining_BasedOnDepartmentOrJobTitle() throws SQLException {
        // Assign training courses to a new hire based on their department or job title
        OnboardingTrainingAssigner.assignOnboardingTraining("IT", "EMP123");

        // Verify that training courses are correctly assigned
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM employee_training WHERE employee_id = 'EMP123'")) {
            try (ResultSet rs = stmt.executeQuery()) {
                assertTrue(rs.next());

            }
        }
    }

    }
