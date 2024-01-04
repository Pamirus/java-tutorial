public class perfectNumber {
    public static void main(String[] args) {
        int myInteger = 5;
        int myTotal = 0;

        for (int i = 1; i < myInteger; i++) {
            if (myInteger % i == 0) {
                myTotal += i;
            }
        }

        if (myTotal == myInteger) {
            System.out.println("Given number is a perfect number.");
        }
        else {
            System.out.println("Given number is NOT a perfect number.");
        }
    }
}
