public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        customerManager.baseDatabaseManager.getData();

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.baseDatabaseManager = new SqlServerDatabaseManager();
        customerManager2.baseDatabaseManager.getData();
    }
}
