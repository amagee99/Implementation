import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OnboardingTrainingAssigner {

    private static final String URL = "jdbc:mysql://localhost:3306/lms_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Cronan103!";

    public static void assignOnboardingTraining(String department, String employeeId) throws SQLException {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT department_id FROM department_data WHERE department = ? AND has_assign_access = true")) {
            stmt.setString(1, department);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int departmentId = rs.getInt(1);
                    assignTraining(departmentId, employeeId);
                } else {
                    System.out.println("Department does not have access to assign training.");
                }
            }
        }
    }

    private static void assignTraining(int departmentId, String employeeId) throws SQLException {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT course_id FROM training_courses WHERE applicable_department = ?")) {
            stmt.setInt(1, departmentId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int courseId = rs.getInt(1);
                    assignNewHireTraining(employeeId, courseId);
                }
            }
        }
    }

    private static void assignNewHireTraining(String employeeId, int courseId) throws SQLException {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO employee_training (employee_id, course_id) " +
                             "SELECT ?, ? FROM employeedata WHERE employee_id = ? AND new_hire = true")) {
            stmt.setString(1, employeeId);
            stmt.setInt(2, courseId);
            stmt.setString(3, employeeId);
            stmt.executeUpdate();
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
