public class FileLogger extends BaseLogger {
    public void log(String logMessage) {
        System.out.println("Logged to the file: " + logMessage);
    }
}
