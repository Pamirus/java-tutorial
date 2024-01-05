public class EmailLogger extends BaseLogger {
    public void log(String logMessage) {
        System.out.println("Logged to the email: " + logMessage);
    }
}
