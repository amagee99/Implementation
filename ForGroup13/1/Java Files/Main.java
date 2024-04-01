import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                         "id SERIAL PRIMARY KEY," +
                         "username VARCHAR(50) NOT NULL," +
                         "email VARCHAR(100) NOT NULL)";
        } catch (SQLException e) {
            System.err.println("Error establishing database connection: " + e.getMessage());
        }
        int choice;
        do {
        System.out.println("\nMenu:");
        System.out.println("1. Assign Onboarding Training");
        System.out.println("2. View Training Record");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        try {
        switch (choice) {
        case 1:
        assignOnboardingTraining();
        break;
        case 2:
        viewTrainingRecord();
        break;
        case 3:
        System.out.println("Exiting...");
        break;
        default:
        System.out.println("Invalid choice.");
   }
        } catch (SQLException e) {
        System.out.println("An error occurred: " + e.getMessage());
   }
        } while (choice != 3);
}

    private static void assignOnboardingTraining() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();

        //OnboardingTrainingAssigner.assignOnboardingTraining(department, employeeId);
    }

    private static void viewTrainingRecord() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();

        TrainingRecordViewer viewer = new TrainingRecordViewer();
        viewer.viewTrainingRecord(employeeId);
    }

}
