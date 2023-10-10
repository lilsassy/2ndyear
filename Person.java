public class Person{
    int rollno;
    String name;
    String city;
    
    Person(int rollno, String name, String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
    
    public String toString(){//overriding the toString() method
        return rollno +""+name+""+city;
    }
    public static void main(String[] args){
        Person stud1 = new Person(101, "Low", "Code");
        Person stud2 = new Person(102,"No","Code");
        Person stud3 = new Person(103,"High", "Code");
        
        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);
    }
}