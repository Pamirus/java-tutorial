public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Notebook", "Lenovo Ideapad L340", 1234.56, 17, "Black");

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Smart phone");
        product2.setDescription("iPhone 11");
        product2.setPrice(123.45);
        product2.setStockAmount(7);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product2);

        System.out.println(product.getCode());
        System.out.println(product2.getCode());
    }
}
