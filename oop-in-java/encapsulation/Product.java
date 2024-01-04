public class Product {
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _colour;
    private String _code;

    // getter
    public int getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public double getPrice() {
        return _price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public String getColour() {
        return _colour;
    }

    public String getCode() {
        return this._name.substring(0, 1) + _id;
    }

    // setter
    public void setId(int id) {
        _id = id;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public void setColour(String colour) {
        _colour = colour;
    }
}
