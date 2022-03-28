import java.sql.Connection;
import java.sql.DriverManager;


public class experiment14 {
    public static void main(String[] args) {
        String MySQLURL = "jdbc:mysql://localhost:3306/web?useSSL=false";
        String databaseUserName = "root";
        String databasePassword = "123456";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(MySQLURL, databaseUserName, databasePassword);
            if (connection != null) {
                System.out.println("Database connection is successful !!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
