import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] var0) {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;

        try {
            connection = helper.getConnection();
            System.out.println("Connection established.");
            
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select Code, Name, Continent, Region from country");
            ArrayList<Country> country = new ArrayList<Country>();

            while(resultSet.next()) {
                country.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(country.size());
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                connection.close();
                System.out.println("Connection closed.");
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
    }
}