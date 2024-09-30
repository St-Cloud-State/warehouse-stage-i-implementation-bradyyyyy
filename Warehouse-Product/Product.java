public class Product {
    private String productID;
    private String name;
    private double salePrice;
    private int quantityInStock;

    public Product(String productID, String name, double salePrice, int initialQuantity) {
        this.productID = productID;
        this.name = name;
        this.salePrice = salePrice;
        this.quantityInStock = initialQuantity;
    }

    public void updateStock(int quantity) {
        this.quantityInStock += quantity;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public String toString() {
        return "Product{" +
                "Product ID: '" + productID + '\'' +
                ", Name: '" + name + '\'' +
                ", Sale Price: $" + String.format("%.2f", salePrice) +
                ", Quantity in Stock: " + quantityInStock +
                '}';
    }
}
