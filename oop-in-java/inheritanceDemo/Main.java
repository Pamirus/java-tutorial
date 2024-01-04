public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new LecturerCreditManager());
        creditUI.CalculateCredit(new FarmerCreditManager());
        creditUI.CalculateCredit(new MarineCreditManager());
    }
}
