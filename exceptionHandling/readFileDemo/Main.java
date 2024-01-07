import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try { 
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\pamir\\Desktop\\Java\\java-tutorial\\exceptionHandling\\readFileDemo\\myIntegers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }

            System.out.println("Total: " + total);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}
