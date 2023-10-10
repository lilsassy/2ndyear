
import java.util.Scanner;

// Abstract class _Pos
abstract class _Pos {
    private String cashier;
    private double[] itemCosts;
    private int[] itemQty;
    private double vat;
    private double totalCost;

    // Constructor
    public _Pos(String cashier) {
        this.cashier = cashier;
        this.itemCosts = new double[4];
        this.itemQty = new int[4];
        this.vat = 0.0;
        this.totalCost = 0.0;
    }

    // Regular method
    public void displayCashierName() {
        System.out.println("Cashier: " + this.cashier);
    }

    // Abstract method
    public abstract void dataEntry();

    // Calculate VAT
    protected void calculateVat() {
        for (int i = 0; i < itemCosts.length; i++) {
            totalCost += itemCosts[i] * itemQty[i];
        }
        vat = totalCost * 0.12; 
        totalCost += vat;
    }

    public double getTotalCost() {
        return totalCost;
    }
}

// Interface Credit_id
interface Credit_id {
    void valid_id();
}

class MiniPos extends _Pos implements Credit_id {

    public MiniPos(String cashier) {
        super(cashier);
    }

    @Override
    public void dataEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item1 cost: ");
        getItemCosts()[0] = scanner.nextDouble();
        System.out.print("Enter item2 cost: ");
        getItemCosts()[1] = scanner.nextDouble();
        System.out.print("Enter item3 cost: ");
        getItemCosts()[2] = scanner.nextDouble();
        System.out.print("Enter item4 cost: ");
        getItemCosts()[3] = scanner.nextDouble();

        System.out.print("Enter item1 quantity: ");
        getItemQty()[0] = scanner.nextInt();
        System.out.print("Enter item2 quantity: ");
        getItemQty()[1] = scanner.nextInt();
        System.out.print("Enter item3 quantity: ");
        getItemQty()[2] = scanner.nextInt();
        System.out.print("Enter item4 quantity: ");
        getItemQty()[3] = scanner.nextInt();

        calculateVat();

        System.out.println("Total Cost with VAT: $" + getTotalCost());
    }

    private double[] getItemCosts() {
        return null;
    }

    private int[] getItemQty() {
        return null;
    }

    @Override
    public void valid_id() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID number: ");
        String id = scanner.nextLine();

        if (id.equals("0101") || id.equals("0202") || id.equals("0003")) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Gotcha!");
            }
        } else {
            System.out.println("Error");
        }
    }
}

public class POS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String cashierName;
        do {
            System.out.print("Enter cashier name (lolita, rob, tayco, catulpo): ");
            cashierName = scanner.nextLine();
        } while (!cashierName.equals("lolita") && !cashierName.equals("rob") &&
                !cashierName.equals("tayco") && !cashierName.equals("catulpo"));

   
        MiniPos miniPos = new MiniPos(cashierName);

    
        miniPos.displayCashierName();
        miniPos.dataEntry();
        miniPos.valid_id();
    }
}

