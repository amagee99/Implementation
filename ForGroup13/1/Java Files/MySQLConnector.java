import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnector {

    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/lms_system";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Cronan103!";

    private static Connection connection;

    static {
        try {
            Class.forName(DRIVER_CLASS);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Implement methods for specific database interactions as needed
    // (e.g., getDocument, createDocument, updateDocument, deleteDocument)
    // These methods should utilize the connection object and appropriate SQL statements
    // to interact with the database.

    // ... (implement methods for database interactions)
}
