import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Inventory_App {
    public static void main(String [] args){

        // Create a queue to store inventory
        //Rhadjel Kent A. Ching
        //FC1-BSIT2-2
        Queue<String> inventory = new LinkedList<>();

        //Create a scanner  to read input from theuser
        Scanner scanner = new Scanner(System.in);

        while(true){
            display("*******************************************");
            System.out.println("1. Add item to inventory");
            System.out.println("2. Remove item from inventory");
            System.out.println("3.Print inventory");                                    
            System.out.println("4. Quit");
            System.out.print("Enter your choice:");
             display("*******************************************");
             int ask;
             ask = scanner.nextInt();
             switch (ask){
               case 1:
               display("Enter  item name: ");
                    String Item=scanner.next();
                    inventory.add(Item);
                    break;
                case 2:
                    String removedItem;
                    removedItem = inventory.poll();
                    if(removedItem != null){
                        display("Removed Item: " + removedItem);
                    }else{
                        display("Inventory is empty");
                    }
                    break;
                case 3:
                    display("Inventory: " + inventory);
                    break;
                case 4 :
                    display("Thank you for using this Queue Midget Inventory app");
                    System.exit(0);
              

             }
        }

    }
        
            
        static void display(String x){
             System.out.println(x);
    }
}

