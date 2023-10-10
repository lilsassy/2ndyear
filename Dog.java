public class Dog extends Animal{
       private static String text = "This text is from Dog class.";

    public static void main(String[] args){
        Dog dog = new Dog();

        System.out.println("This output is from the base class");
        System.out.println(dog.disqName());
        System.out.println(dog.dispSound());

        System.out.println("\nThis is from the dog class");
        System.out.println(text);
    }
}
