import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductTest {

    public static void storeProducts(Scanner scanner, LinkedList<Product> list) {
        System.out.println("How many products would you like to add?");
        int productNum = Integer.parseInt(scanner.nextLine());


        System.out.println("Enter the product's information:");
        for (int i = 0; i < productNum; i++) {
            System.out.print("Please enter the product's ID: ");
            String productID = scanner.nextLine();
            System.out.print("Please enter the product's name: ");
            String name = scanner.nextLine();
            System.out.print("Please enter the product's sale price: ");
            double salePrice = scanner.nextDouble();
            System.out.print("Please enter the product's quantity in stock: ");
            int quantityInStock = scanner.nextInt();
            scanner.nextLine();  // Clear the newline

            list.add(new Product(productID, name, salePrice, quantityInStock));
        }
    }

    public static void displayProducts(PrintStream outputStream, LinkedList<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            outputStream.println(list.get(i).toString());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String outFileName;
        ProductList productList = new ProductList();
        Scanner keyScanner = new Scanner(System.in);

        System.out.println("Please enter the name of your output file: ");
        outFileName = keyScanner.nextLine();
        PrintStream printer = new PrintStream(outFileName);

        storeProducts(keyScanner, productList.getList());

        displayProducts(printer, productList.getList());

        productList.displayProducts();

        keyScanner.close();
    }
}
