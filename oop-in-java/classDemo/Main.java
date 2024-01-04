public class Main {
    public static void main(String[] args) {
        int myInteger1 = 8;
        int myInteger2 = 2;

        CalculatorOperations calculatorOperations = new CalculatorOperations();
        int summationResult = calculatorOperations.mySummation(myInteger1, myInteger2);
        int substractionResult = calculatorOperations.mySubstraction(myInteger1, myInteger2);
        int multiplicationResult = calculatorOperations.myMultiplication(myInteger1, myInteger2);
        int divisionResult = calculatorOperations.myDivision(myInteger1, myInteger2);

        System.out.println("The results are as follows regarding the inputs: ");
        System.out.println("1st Integer: " + myInteger1);
        System.out.println("2nd Integer: " + myInteger2);
        System.out.println("----o----");
        System.out.println("Result of the summation operation: " + summationResult);
        System.out.println("Result of the substraction operation: " + substractionResult);
        System.out.println("Result of the multiplication operation: " + multiplicationResult);
        System.out.println("Result of the division operation: " + divisionResult);
    }
}
