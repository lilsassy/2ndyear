import java.util.Scanner;

class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}




// Start the program.
// Create a Scanner object to read input from the user.
// Prompt the user to enter the value of 'n'.
// Read and store the value of 'n' in a variable.
// Initialize a loop variable 'i' to 1.
// Enter a loop with the condition 'i <= n'.
// Check if 'i' is divisible by 2 (i.e., 'i' is an even number).
// If 'i' is even, print 'i'.
//Increment the value of 'i' by 1.
//Repeat step 6 as long as the condition 'i <= n' is true.
//End the loop.
//End the program.


