public class Main {
    public static void main(String[] args) {
        FemaleGameCalculator femaleGameCalculator = new FemaleGameCalculator();
        
        femaleGameCalculator.calculate();
        femaleGameCalculator.gameOver();
        
        GameCalculator gameCalculator = new FemaleGameCalculator();
        ChildGameCalculator childGameCalculator = new ChildGameCalculator();
        childGameCalculator.calculate();
    }
}
