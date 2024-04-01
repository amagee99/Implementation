import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=dbo.employee_training";
        String username = "LAINA-PC/agmag";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
}
