import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
   private String userName = "root";
   private String password = "123456";
   private String dbURL = "jdbc:mysql://localhost:3306/world";

   public DbHelper() {
   }

   public Connection getConnection() throws SQLException {
      return DriverManager.getConnection(this.dbURL, this.userName, this.password);
   }

   public void showErrorMessage(SQLException exception) {
      System.out.println("Error: " + exception.getMessage());
      System.out.println("Error code: " + exception.getErrorCode());
   }
}
