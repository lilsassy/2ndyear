import java.util.*;
public class Enrollment{
    public static void main (String arge[]){
        Scanner haha = new Scanner (System.in);
        String a,b,c,d,f,g,h,i,j,k,l,m;
        int e;
        System.out.println("------------------------------------");
        System.out.println("-    Welcome to online Enrollment  -");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println();

        System.out.print("Enter firstname : ");
        a = haha.nextLine();
        System.out.print("Enter lastname : ");
        b = haha.nextLine();
        System.out.print("Enter middlename : ");
        c = haha.nextLine();
        System.out.print("Enter Birth day : ");
        d = haha.nextLine();
        System.out.print("Enter age : ");
        e = haha.nextInt();
        System.out.print("Enter address : ");
        f = haha.nextLine();
        System.out.print("Enter elementary : ");
        g = haha.nextLine();
        System.out.print("Enter Highschool : ");
        h = haha.nextLine();
        System.out.print("Enter Senior High School : ");
        i = haha.nextLine();
        System.out.print("Enter Mother's name : ");
        j = haha.nextLine();
        System.out.print("Enter Father's : ");
        k = haha.nextLine();
        System.out.print("Enter course : ");
        l = haha.nextLine();
        System.out.print("Enter year : ");
        m = haha.nextLine();

        enroll hu = new enroll(a,b,c,d,e,f,g,h,i,j,k,l,m);


    }
}
class enroll{
    Scanner haha = new Scanner(System.in);
    private String fname, lname, mname, bd;
    private int age;
    private String address, Elem, Hs, Shs;
    private String parentm, parentf;
    private String course, year;

    public enroll(String fname, String lname, String mname,String bd, int age, String address, String Elem, String Hs, String Shs, String parentm, String parentf, String course, String year){
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.age = age;
        this.bd = bd;
        this.address = address;
        this.Elem = Elem;
        this.Hs = Hs;
        this.Shs = Shs;
        this.parentm = parentm;
        this.parentf = parentf;
        this.course = course;
        this.year = year;
    }
    void Login(){
        print("------------------------------");
        print("-   Welcome to Log in Page   -");
        print("------------------------------");
        
        print("Enter your Username : ");
        String aa = haha.nextLine();
        print("Enter your Password : ");
        String bb = haha.nextLine();
    }
    void call(){
        print("Welcome Mr/Mrs. "+ lname);
    }
    static void print(String word){
        System.out.println(word);
    }
}