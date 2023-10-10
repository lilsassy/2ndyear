class Animal{
    public void animalSound(){
        System.out.println("The animal makes sound");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: ARFF ARFF1");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The cat says: Meoww meoww!");
    }
}
public class maiin {
    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal ido = new Animal();
        Animal cat = new Animal();

        myAnimal.animalSound();
        ido.animalSound();//downcasting
        cat.animalSound();
    }
}