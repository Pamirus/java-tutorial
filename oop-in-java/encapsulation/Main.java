public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Notebook");
        product.setDescription("Lenovo IdeaPad L340");
        product.setPrice(1234.56);
        product.setStockAmount(17);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());
    }
}
