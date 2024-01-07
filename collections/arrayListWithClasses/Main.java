import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer joe = new Customer(1, "Joe", "Smith");
        customers.add(joe);
        
        customers.add(new Customer(2, "Jack", "Brown"));
        customers.add(new Customer(3, "Drew", "Morris"));

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
        
        System.out.println("----o----");
        // ---

        customers.remove(joe);
        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}
