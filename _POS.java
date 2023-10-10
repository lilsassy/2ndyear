import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

class Product {
    private String name;
    private double cost;
    private int quantity;

    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public double getItemCost() {
        return cost * quantity;
    }

    @Override
    public String toString() {
        return name + " " + cost + " " + quantity;
    }
}

public class _POS {

    //Rhadjel Kent Ching 
    //FC1-BSIT2-2
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentDate + " " + currentTime);

        System.out.println("POS Prototyping 2022-23");
        System.out.println("Enter A to continue or X to exit");
        char input = scanner.next().charAt(0);

        while (input == 'A' || input == 'a') {
            scanner.nextLine(); 

            System.out.println("Enter Item Name: ");
            String name = scanner.nextLine();

            System.out.println("Enter cost: ");
            double cost = scanner.nextDouble();

            System.out.println("Enter quantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(name, cost, quantity);

            System.out.println("Details:");
            System.out.println(product);
            System.out.println("Total: " + product.getItemCost());

            System.out.println("Continue? Enter 'A' to continue or any letter to exit...");
            input = scanner.next().charAt(0);
        }

        System.out.println("End");
    }
}
