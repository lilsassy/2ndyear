import java.util.*;

public class Arraylistsample {
    public static void main(String[] args) {

        /*RHADJEL KENT A CHING 
        FC1-BSIT2-2
        ITE 031
         */
        ArrayList<Integer> data = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            data.add(number);
        }

       
        System.out.println("Size of data: " + data.size());


        int lastNumber = data.get(data.size() - 1);
        System.out.println("Last number in data: " + lastNumber);

        data.set(2, 50);

        data.add(0, 15);

        Collections.sort(data);

        System.out.println("Sorted elements:");
        for (int number : data) {
            System.out.println(number);
        }

        scanner.close();
    }
}