public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.id = 1;
        product.name = "Notebook";
        product.description = "Lenovo IdeaPad L340";
        product.price = 1234.56;
        product.stockAmount = 17;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}
