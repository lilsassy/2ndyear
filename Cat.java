public class Cat {
    public String say;
    public String arf;
    public int no;

    public Cat(String say, String arf, int no){
    this.say = say;
    this.arf = arf;
    this.no = no;
    }

void SaySomething(){
    System.out.print(this.say);
}

void giveArf(){
    System.out.print(this.arf);
}

void numNo(){
    System.out.print(this.no);
}

public static void main(String args[]){
    Cat kuring = new Cat("Mwwehehehhe ","\nArfff! Arff!" + "\nNumber of Animals: ",2);
    kuring.SaySomething();
    kuring.giveArf();
    kuring.numNo();
}
}



