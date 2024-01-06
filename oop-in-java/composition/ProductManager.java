public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("The product was added to the database.");
        } else {
            System.out.println("Error while adding the product to the database.");
        }
    }
}
