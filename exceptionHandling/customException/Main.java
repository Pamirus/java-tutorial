public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Current balance: " + manager.getBalance());
        
        manager.deposit(100);
        System.out.println("Current balance: " + manager.getBalance());
        
        try {
            manager.withdraw(90);
        } catch (BalanceInsufficientException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Current balance: " + manager.getBalance());
        }
        
        try {
            manager.withdraw(20);
        } catch (BalanceInsufficientException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Current balance: " + manager.getBalance());
        }
    }
}
