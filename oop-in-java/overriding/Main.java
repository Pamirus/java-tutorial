public class Main {
    public static void main(String[] args) {
        // LecturerCreditManager lecturerCreditManager = new LecturerCreditManager();
        // System.out.println(lecturerCreditManager.calculateRepaymentInterest(1000));

        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[] { new LecturerCreditManager(),
                new FarmerCreditManager(), new StudentCreditManager() };

        for (BaseCreditManager baseCreditManager : baseCreditManagers) {
            System.out.println(baseCreditManager.calculateRepaymentInterest(1000));
        }
    }    
}
