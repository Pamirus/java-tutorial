public class methodsVariableArguments {
    public static void main(String[] args) {
        int mySummation = mySum(1, 3, 5, 7, 9);
        System.out.println(mySummation);
    }

    public static int mySum(int... args) {
        int summation = 0;
        for (int i : args) {
            summation += i;
        }

        return summation;
    }
}
