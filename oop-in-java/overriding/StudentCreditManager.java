public class StudentCreditManager extends BaseCreditManager {
    public double calculateRepaymentInterest(double amount) {
        return amount * 1.07;
    }
}
