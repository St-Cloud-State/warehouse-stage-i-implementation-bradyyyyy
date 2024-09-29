public class ProductTest {
    public static void main(String[] args) {

        Product product = new Product("P001", "Decent Product", 9.99, 100);

        //Testing displayProduct()
        product.displayProduct("P001");
        System.out.println();

        // Test updating the stock
        product.updateStock(50); // Adding 50 units to stock
        System.out.println("After Adding 50 Units:");
        System.out.println("Quantity in Stock: " + product.getQuantityInStock());
        System.out.println();

        product.updateStock(-30); // Removing 30 units from stock
        System.out.println("After Removing 30 Units:");
        System.out.println("Quantity in Stock: " + product.getQuantityInStock());
        System.out.println();

        // Updating the name and sale price
        product.setName("Amazing Product");
        product.setSalePrice(12.99);

        //Testing get methods
        System.out.println("Updated Product Details:");
        System.out.println("Product ID: " + product.getProductID());
        System.out.println("Name: " + product.getName());
        System.out.println("Sale Price: $" + product.getSalePrice());
        System.out.println("Quantity in Stock: " + product.getQuantityInStock());
    }
}