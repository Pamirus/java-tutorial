public class MySqlCustomerDal implements ICustomerDal, IRepository{
    public void add() {
        System.out.println("The data was added to MySQL");
    }
}
