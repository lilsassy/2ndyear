import java.util.Stack;


public class librarybook {
    public static void main(String[] args){
        Stack<String> Book = new Stack<>();

        System.out.println("Is stack empty? "  + Book.empty());

        Book.push("Linux");
        Book.push("Java");
        Book.push("Python");
        Book.push("HTML");
        Book.push("CSS");

        System.out.println("Search for Java " + Book.search(1));

        System.out.println(Book.remove(3));
       
        System.out.println("The top element is: " + Book.pop());

        for(int i = 0; i < Book.size(); i++){
            System.out.println(Book.get(i));
        }
        System.out.println(Book.size());



        
    }    
}
