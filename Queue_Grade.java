import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Grade {

    //Rhadjel Kent Ching
    //FC1 BSIT2-2
    /**
     * @param args
     */
    public static void main(String[] args){
        Queue <Integer> grades = new LinkedList<>();
        Scanner scanner = new Scanner (System.in);

        while(true){
            display("1. Add grade");
            display("2. Remove grade");
            display("3. Print grade");
            display("4.Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    grades.add(grade);
                    break;
                case 2:
                    Integer removedGrade = grades.poll();
                    if(removedGrade != null){
                        display("Removed Grade: " + removedGrade);
                    }else{
                        display("No grades to remove");
                    }
                    break;
                case 3:
                    display("Grades" + grades);
                    break;
                case 4:
                    System.exit(0);
            
                
            }
            
        }
    }
    static void display(String x){
        System.out.println(x);
    }

}

