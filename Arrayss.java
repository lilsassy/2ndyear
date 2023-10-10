 public class Arrayss{
    public static void main(String[] args) {
        // Define the array
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};

        // Calculate the sum using foreach
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        //take the average
        double average = (double) sum / numbers.length;

        // Display the results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
  

