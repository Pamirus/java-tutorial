public class DatabaseHelper {
    public static class Crud {
        public static void remove() {
            System.out.println("The product was removed from the database.");
        }

        public static void update() {
            System.out.println("The database was updated.");
        }
    }
    
    public static class Connection {
        public static void createConnection() {
            System.out.println("The database connection is established.");
        }    
    }
}
