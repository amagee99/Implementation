import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrainingRecordViewer {

    private static final String URL = "jdbc:mysql://localhost:3306/lms_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Cronan103!";

    public void viewTrainingRecord(String employeeId) throws SQLException {
        try (Connection conn = getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT e.first_name, e.last_name, t.course_title, t.has_exam " +
                            "FROM employeedata e " +
                            "INNER JOIN employee_training et ON e.employee_id = et.employee_id " +
                            "INNER JOIN training_courses t ON et.course_id = t.course_id " +
                            "WHERE e.employee_id = ?");
            stmt.setString(1, employeeId);
            ResultSet rs = stmt.executeQuery();

            System.out.println("Employee Name: " + employeeId);
            System.out.println("Assigned Training Courses:");
            while (rs.next()) {
                String courseTitle = rs.getString(3);
                boolean hasExam = rs.getBoolean(4);
                System.out.println("- " + courseTitle);
                if (hasExam) {
                    checkExamResult(employeeId, courseTitle);
                }
            }
        }
    }

    public String checkExamResult(String employeeId, String courseTitle, int score) throws SQLException {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Invalid exam score: " + score);
        }

        // Use the provided score instead of prompting for input
        String result = score >= 80 ? "Training Passed" : "Training Failed";
        System.out.println(result);
        return result;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}

/*Tester's comments - test was already implemented by team. Minor changes made due to class interaction with external database. 
  Sql query modified to retrieve employee data
*/