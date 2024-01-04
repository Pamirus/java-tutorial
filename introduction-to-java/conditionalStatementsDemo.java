public class conditionalStatementsDemo {
    public static void main(String[] args) {
        int myInt1 = 1;
        int myInt2 = 2;
        int myInt3 = 3;

        int theGreatestInt = myInt1;
        String message = "The greatest number is: ";

        if (myInt2 > theGreatestInt) {
            theGreatestInt = myInt2;
        }
        
        if (myInt3 > theGreatestInt) {
            theGreatestInt = myInt3;
        }

        System.out.println(message + theGreatestInt);
    }
}
