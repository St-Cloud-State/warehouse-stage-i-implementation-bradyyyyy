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

    public void displayProduct(String id) {
        if (this.productID.equals(id)) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + name);
            System.out.printf("Sale Price: $%.2f%n", salePrice);
            System.out.println("Quantity in Stock: " + quantityInStock);
        } 
        
        else {
            System.out.println("No product found with Product ID: " + id);
        }
    }
}
