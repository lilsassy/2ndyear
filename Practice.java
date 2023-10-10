//Start the program.
//Prompt the user to enter the size of the array, n.
//Create an integer array, ratings, of size n.
//Prompt the user to enter the ratings for each survey participant and store them in the ratings array.
//Prompt the user to enter the rating to be counted, y.
//Call the countRatingFrequency function, passing the ratings array and y as arguments.
//Inside the countRatingFrequency function:
//Initialize a variable, frequency, to 0.
//Iterate through each element, rating, in the ratings array.
//If the rating is equal to y, increment the frequency by 1.
//Return the final value of frequency.
//Back in the main function, store the returned frequency in a variable.
//Display the frequency as "FREQUENCY: " followed by the value of frequency.
//End the program.



import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int[] ratings = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        int frequency = countRatingFrequency(ratings, y);
        System.out.println("FREQUENCY: " + frequency);
    }

    private static int countRatingFrequency(int[] ratings, int y) {
        int frequency = 0;
        for (int rating : ratings) {
            if (rating == y) {
                frequency++;
            }
        }
        return frequency;
    }
}
