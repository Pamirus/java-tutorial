public class Main {
    public static void main(String[] args) {
        int integer1 = 1;
        int integer2 = 2;
        int integer3 = 3;
        CalculatorOperations calculatorOperations = new CalculatorOperations();
        int result = calculatorOperations.summation(integer1, integer2);
        System.out.println(result);
        
        int result2 = calculatorOperations.summation(integer1, integer2, integer3);
        System.out.println(result2);
    }
}
