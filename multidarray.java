public class multidarray {
    public static void main(String[] args) {
        int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7}
        };

        // nested loops para sa 2d arrays
        System.out.println("Using a nested for loop:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Using a nested for-each loop
        System.out.println("\nUsing a nested for-each loop:");
        for (int[] row : a) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
