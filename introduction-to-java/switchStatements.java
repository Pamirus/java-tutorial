public class switchStatements {
    public static void main(String[] args) {
        char myChar = 'A';

        switch (myChar) {
            case 'A':
                System.out.println("The character is A");
                break;
            case 'B':
                System.out.println("The character is B");
                break;
            case 'C':
                System.out.println("The character is C");
                break;
            case 'D':
                System.out.println("The character is D");
                break;
            default:
                System.out.println("The character is not A, B, C or D");
        }
    }
}
