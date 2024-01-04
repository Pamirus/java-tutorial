public class arraysDemo {
    public static void main(String[] args) {
        double[] myDoubleSet = { 0.0, 1.1, 2.2, 3.3, 4.4, 5.5 };
        double myTotal = 0.0;
        double myMax = 0.0;

        for (double myDouble : myDoubleSet) {
            System.out.println(myDouble);
            myTotal += myDouble;

            if (myMax < myDouble) {
                myMax = myDouble;
            }
        }

        System.out.println("Total: " + myTotal);
        System.out.println("The maximum value in the given set is: " + myMax);
    }
}
