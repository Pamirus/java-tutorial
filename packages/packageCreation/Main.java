// import maths.Summation;
// import maths.Substraction;
import maths.*;

public class Main {
    public static void main(String[] args) {
        Summation summation = new Summation();
        System.out.println("Summation: " + summation.sum(3, 5));

        Substraction substraction = new Substraction();
        System.out.println("Substraction: " + substraction.sub(5, 3));
    }
}
