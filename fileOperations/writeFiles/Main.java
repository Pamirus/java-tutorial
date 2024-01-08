import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\pamir\\Desktop\\java-tutorial\\fileOperations\\files\\students.txt");

        // createFile(file);
        // getFileInfo(file);
        // removeFile(file);

        readFile(file);
        writeFile(file);
        readFile(file);
    }

    public static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File is created.");
            } else {
                System.out.println("The file is already existing.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(File file) {
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File writable: " + file.canWrite());
            System.out.println("File is readable: " + file.canRead());
            System.out.println("File size: " + file.length());
        } else {
            System.out.println("The file does not exist");
        }
    }

    public static void removeFile(File file) {
        try {
            if (file.delete()) {
                System.out.println("File is removed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readFile(File file) {
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File file) {
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true));
            fileWriter.newLine();
            fileWriter.write("test");
            System.out.println("Wrote to the file.");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
