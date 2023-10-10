import java.util.Scanner;
public class StudentEnrollment {

    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student Full Name: ");
        String name = in.nextLine();

        System.out.print("Enter Student Age: ");
        int age = in.nextInt();

        System.out.print("Enter Student Number: ");
        int number = in.nextInt();

        System.out.println("\nStudent Type: \nH- HK Scholar Student \nR - Regular Student");
        System.out.print("Enter Student Type: ");
        String type = in.nextLine();
        if(type.compareToIgnoreCase("H") == 0){
        HkStudent student = new HkStudent(name);

        System.out.print("\nEnter HK Scholarship Discount: " );
        int HkDiscount = Integer.parseInt(type, in.nextInt());
        student.setHkDiscount(HkDiscount);

        System.out.print("\nEnter Student Course: ");
        student.setCourse(in.nextLine());

        System.out.print(student);
        }else if (type.compareToIgnoreCase("R") == 0){
            RegularStudent student = new RegularStudent(name);

            System.out.print("\nEnter Student Course: ");
            student.setCourse(in.nextLine());

            System.out.print(student);
        }else {
            System.out.print("Error:Invalid Student Type!");
        }
    }
}

abstract class Student{
    private static final int number = 0;
    private String name;
    private int age;

    public Student(String name){
        setName(name);
    }
    public void setName(String name){
    this.name = name;
    }
    public String getName(){
        return name;
    }
    public Student(byte age){
        setAge(age);
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public Student(long number){
        setNumber(number);
    }
    private void setNumber(long number) {
        this.setNumber(number);
    }
    public long getNumber(){
        return number;
    }
}

final class HkStudent extends Student{
    private static int HkDiscount;
    private static String Course;

    public HkStudent(String name){
        super(name);
    }

    public void setCourse(String nextLine) {
    }

    public void setHkDiscount(int hkDiscount) {
        HkDiscount = HkDiscount;
        Course = Course;
    }
    public static 

    public int getHkDiscount(){
        return HkDiscount;
    }
    public String toString(){
        return"\nStudent Name: " + getName() + "\nHKDiscount : " + getHkDiscount() + "%";
    }
}

