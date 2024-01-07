public class BalanceInsufficientException extends Exception {
    String messageString;
    public BalanceInsufficientException(String messageString) {
        this.messageString = messageString;
    }
    
    @Override
    public String getMessage() {
        return this.messageString;
    }
}
