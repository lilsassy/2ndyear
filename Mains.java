//Import the Scanner class from java.util package.
//Create a public class named VowelInput.
//Inside the VowelInput class, declare the main method as public and static.
//Create a Scanner object to read user input: Scanner scanner = new Scanner(System.in);.
//Declare a char variable named input to store the user's input.
//Start a do...while loop:
//Print the message "Enter a character: ".
//Read the user's input as a String using scanner.nextLine().
//Get the first character of the input string using charAt(0) and assign it to the input variable.
//Print the value of input.
//Check if the input is not a vowel using the isVowel method:
//Convert the input character to lowercase using Character.toLowerCase(input).
//Return true if the converted character is equal to 'a', 'e', 'i', 'o', or 'u'; otherwise, return false.
//Repeat the loop if the input is not a vowel.
//Declare a private static boolean method named isVowel that takes a char parameter c:
//Convert the c character to lowercase using Character.toLowerCase(c).
//Check if the converted character is equal to 'a', 'e', 'i', 'o', or 'u'.
//Return true if it is a vowel; otherwise, return false.
//Close the do...while loop.
//End the main method and the VowelInput class.//



import java.util.Scanner;

class Mains{//Vowel input//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        do {
            System.out.print("Enter a character: ");
            input = scanner.nextLine().charAt(0);
            System.out.println(input);
        } while (!isVowel(input));
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
