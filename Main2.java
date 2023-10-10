//Start the program.
//Create a Scanner object to read input from the user.
//Prompt the user to enter the first number.
//Read and store the first number.
//Prompt the user to enter the second number.
//Read and store the second number.
//Prompt the user to enter the arithmetic operator.
//Read and store the operator character.
//Initialize a variable named "result" to store the calculation result.
//Use a switch-case statement based on the operator character:
//a. If the operator is '+', add the first and second numbers and store the result.
//b. If the operator is '-', subtract the second number from the first number and store the result.
//c. If the operator is '*', multiply the first and second numbers and store the result.
//d. If the operator is '/', divide the first number by the second number and store the result.
//e. If the operator is none of the above, print an error message and set the result to -999.99.
//If the operator is valid (not an error case):
//a. Print the result with two decimal places.
//End the program.




import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, or /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Result: -999.99");
                return;
        }

        System.out.printf("Result: %.2f%n", result);
    }
}
