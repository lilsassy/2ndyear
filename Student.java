public class Student {
    int id;
    String name;
}
class Test{
    public static void main(String args[]){
        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Juan Cruz";
        System.out.println(s1.id +" "+ s1.name);
    }
}
