import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class quEue {
    public static void main(String[] args){
        Queue<Integer> grades = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while(true){
            display("1: Add grade ");
            display("2. Remove grade");
            display("3. Print grades ");
            display("Quit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.print("Enter grade: ");
                int grade = sc.nextInt();
                grades.add(grade);
                break;

                case 2:
                Integer removedGrade = grades.poll();
                if(removedGrade != null){
                    display("Removed grade: " + removedGrade);
                }else{
                    display("No grades to remove");
                }
                break;
                case 3:
                display("Grades: " + grades);
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
