public class OracleCustomerDal implements ICustomerDal, IRepository{
    public void add() {
        System.out.println("The data was added to Oracle DB");
    }
}
