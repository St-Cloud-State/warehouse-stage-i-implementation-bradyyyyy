import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ProductList {

    private LinkedList<Product> products;

    public ProductList() {
        products = new LinkedList<>();
    }

    public LinkedList<Product> getList() {
        return products;
    }


    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    public void displayProducts() {
        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
