public class Therapy{
    public String name;
    public String condition;
    public String address;
    public int age;
    public String gender;

    Therapy(String name,String condition,String address,int age,String gender){
        this.name = name;
        this.condition = condition;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
    void PatientName(){
        System.out.print(this.name);
    }
    void PatientHealth(){
        System.out.print(this.condition);
    }
    void PatientAddress(){
        System.out.print(this.address);
    }
    void PatientAge(){
        System.out.print(this.age);
    }
    void PatiendGender(){
        System.out.print(this.gender);
    }

    public String toString(){
        return name +"" + condition + "" + address + "" + age +  " " + gender;
    }


    public static void main(String args[]){
        Therapy patient = new Therapy("Rhadjel ", "Mild  tumor ", "Lambuyao ", 19 , " Male ");
        patient.PatientName();
        patient.PatientHealth();
        patient.PatientAddress();
        patient.PatientAge();
        patient.PatiendGender();
    }
    static void display(String x){
        System.out.print(x);
    }
}