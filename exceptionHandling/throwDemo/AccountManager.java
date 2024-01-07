public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) throws Exception {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new Exception("Your balance is not sufficient to withdraw $" + amount); 
        }
    }

    public double getBalance(){
        return balance;
    }
}
