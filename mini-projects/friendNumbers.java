public class friendNumbers {
    public static void main(String[] args) {
        int myInteger1 = 220;
        int myInteger2 = 284;
        int myTotal1 = 0;
        int myTotal2 = 0;

        for (int i = 1; i < myInteger1; i++) {
            if (myInteger1 % i == 0) {
                myTotal1 += i;
            }
        }

        for (int i = 1; i < myInteger2; i++) {
            if (myInteger2 % i == 0) {
                myTotal2 += i;
            }
        }

        if (myInteger1 == myTotal2 && myInteger2 == myTotal1) {
            System.out.println("Friend numbers.");
        }
        else {
            System.out.println("NOT friend numbers.");
        }
    }
}
