import java.util.LinkedList;
import java.util.Scanner;

public class ProductTest {

    public static void storeProducts(Scanner scanner, LinkedList<Product> list) {
        System.out.println("Enter the product's information:");

        while (true) {
            System.out.print("Please enter the product's ID: ");
            String productID = scanner.nextLine();
            System.out.print("Please enter the product's name: ");
            String name = scanner.nextLine();
            System.out.print("Please enter the product's sale price: ");
            double salePrice = scanner.nextDouble();
            System.out.print("Please enter the product's quantity in stock: ");
            int quantityInStock = scanner.nextInt();
            scanner.nextLine();

            list.add(new Product(productID, name, salePrice, quantityInStock));

            System.out.print("Do you want to add another product? (yes/no): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    public static void displayProducts(LinkedList<Product> list) {
        System.out.println("Displaying all products:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Product> productList = new LinkedList<>();

        storeProducts(scanner, productList);

        displayProducts(productList);
    }
}
