import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeShopGUI extends JFrame {
    private JButton[] beverageButtons;
    private JButton[] pastryButtons;
    private JButton buyButton;
    private JTextArea transactionTextArea;

    private double totalSales;
    private double taxRate = 0.1;

    public CoffeeShopGUI() {
        setTitle("Ching's Coffee");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel beveragePanel = new JPanel(new GridLayout(3, 3));
        JPanel pastryPanel = new JPanel(new GridLayout(3, 3));
        JPanel controlPanel = new JPanel(new FlowLayout());
        JPanel transactionPanel = new JPanel(new BorderLayout());

        // Create beverage buttons
        beverageButtons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            beverageButtons[i] = new JButton("Beverage " + (i + 1));
            beveragePanel.add(beverageButtons[i]);
        }

        // Create pastry buttons
        pastryButtons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            pastryButtons[i] = new JButton("Pastry " + (i + 1));
            pastryPanel.add(pastryButtons[i]);
        }

        // Create buy button
        buyButton = new JButton("Buy");
        controlPanel.add(buyButton);

        // Create transaction text area
        transactionTextArea = new JTextArea();
        transactionPanel.add(new JScrollPane(transactionTextArea), BorderLayout.CENTER);

        // Add components to the main frame
        add(beveragePanel, BorderLayout.NORTH);
        add(pastryPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(transactionPanel, BorderLayout.EAST);

        // Add action listeners
        for (int i = 0; i < 9; i++) {
            final int index = i;
            beverageButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Process the selected beverage
                    String beverageName = "Beverage " + (index + 1);
                    double price = getBeveragePrice(index);
                    addToTransaction(beverageName, price);
                }
            });
            pastryButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Process the selected pastry
                    String pastryName = "Pastry " + (index + 1);
                    double price = getPastryPrice(index);
                    addToTransaction(pastryName, price);
                }
            });
        }

        buyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Process the buy button click
                double total = calculateTotal();
                double tax = total * taxRate;
                double grandTotal = total + tax;
                transactionTextArea.append("\n------------------------");
                transactionTextArea.append("\nTotal: $" + total);
                transactionTextArea.append("\nTax: $" + tax);
                transactionTextArea.append("\n------------------------");
                transactionTextArea.append("\nGrand Total: $" + grandTotal);
            }
        });
    }

    private void addToTransaction(String itemName, double price) {
        totalSales += price;
        transactionTextArea.append("\n" + itemName + ": $" + price);
    }

    private double calculateTotal() {
        return totalSales;
    }

    private double getBeveragePrice(int index) {
        // Implement your logic to retrieve the price of the selected beverage
        // This is just a placeholder
        return index * 2.5;
    }

    private double getPastryPrice(int index) {
        // Implement your logic to retrieve the price of the selected pastry
        // This is just a placeholder
        return index * 1.75;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CoffeeShopGUI coffeeShop = new CoffeeShopGUI();
                coffeeShop.setVisible(true);
            }
        });
    }
}
