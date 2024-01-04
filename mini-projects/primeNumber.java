public class primeNumber {
    public static void main(String[] args) {
        int myInteger = 1;
        boolean isPrime = true;

        if (myInteger < 1) {
            System.out.println("Invalid input!");
            return;
        }

        for (int i = 2; i < myInteger; i++) {
            if (myInteger % i == 0 ||
                myInteger == 1) {
                isPrime = false;
            }
        }
        System.out.println("Prime number: " + isPrime);
    }
}
