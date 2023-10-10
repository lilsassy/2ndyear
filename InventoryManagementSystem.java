import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[100];
        int[] quantities = new int[100];
        int itemCount = 0;

        while (true) {
            System.out.println("===== Inventory Management System =====");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the item name: ");
                    String item = scanner.nextLine();
                    System.out.print("Enter the quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    items[itemCount] = item;
                    quantities[itemCount] = quantity;
                    itemCount++;
                    System.out.println("Item added successfully!\n");
                    break;
                case 2:
                    System.out.println("\n===== Inventory =====");
                    displayInventory(items, quantities, itemCount);
                    System.out.print("Enter the item number to update (1-" + itemCount + "): ");
                    int itemNumber = Integer.parseInt(scanner.nextLine());
                    if (itemNumber >= 1 && itemNumber <= itemCount) {
                        System.out.print("Enter the new quantity: ");
                        int newQuantity = Integer.parseInt(scanner.nextLine());
                        quantities[itemNumber - 1] = newQuantity;
                        System.out.println("Item quantity updated successfully!\n");
                    } else {
                        System.out.println("Invalid item number.\n");
                    }
                    break;
                case 3:
                    System.out.println("\n===== Inventory =====");
                    displayInventory(items, quantities, itemCount);
                    break;
                case 4:
                    System.out.println("Thank you for using the Inventory Management System!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void displayInventory(String[] items, int[] quantities, int itemCount) {
        System.out.println("Item Name\tQuantity");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + items[i] + "\t" + quantities[i]);
        }
        if (itemCount == 0) {
            System.out.println("No items in the inventory.");
        }
        System.out.println();
    }
}
