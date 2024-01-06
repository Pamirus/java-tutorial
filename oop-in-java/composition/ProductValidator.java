public class ProductValidator {
    public ProductValidator() {
        System.out.println("Constructor called.");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }
}
