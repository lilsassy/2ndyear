import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        System.out.print("Enter 1 to convert to Celsius or 2 to convert to Kelvin: ");
        int choice;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();

            double result;
            boolean isValidChoice = true;

            if (choice == 1) {
                result = (fahrenheit - 32) * 5 / 9;
                System.out.println("The temperature in Celsius is: " + formatTemperature(result));
            } else if (choice == 2) {
                result = (fahrenheit + 459.67) * 5 / 9;
                System.out.println("The temperature in Kelvin is: " + formatTemperature(result));
            } else {
                isValidChoice = false;
            }

            if (!isValidChoice) {
                System.out.println("Invalid choice!");
            }
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static String formatTemperature(double temperature) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(temperature);
    }
}




//Start the program.
//Create a new Scanner object to read user input.
//Prompt the user to enter the temperature in Fahrenheit.
//Read the user's input and store it in a double variable named fahrenheit.
//Prompt the user to enter the choice of conversion.
//Read the user's input and check if it is an integer using the hasNextInt() method.
//If the input is an integer, store it in an int variable named choice.
//Declare a double variable named result.
//Declare a boolean variable named isValidChoice and set it to true.
//If choice is equal to 1, then do the following:
//Calculate result as (fahrenheit - 32) * 5 / 9.
//Display the message "The temperature in Celsius is: " followed by the formatted value of result.
//Otherwise, if choice is equal to 2, then do the following:
//Calculate result as (fahrenheit + 459.67) * 5 / 9.
//Display the message "The temperature in Kelvin is: " followed by the formatted value of result.
//Otherwise, set isValidChoice to false.
//If isValidChoice is false, then display the message "Invalid choice!".
//End the program.