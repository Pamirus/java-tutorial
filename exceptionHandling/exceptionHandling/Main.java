public class Main {
    public static void main(String[] args) {
        try {
            int[] integers = new int[] { 1, 2, 3 };
            System.out.println(integers[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Logged to the database: " + exception);
        } finally {
            System.out.println("Exception handling ended.");
        }
    }
}
