
import java.util.Stack;
    public class RealWorldScenarioArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating object of stack
        Stack<String> bucketList = new Stack<>();
        //check if it is empty
        System.out.println("The stack is empty: "+bucketList.empty());
        //or bucketList.isempty();
        
        //insert elements to stack
        bucketList.push("Japan");
        bucketList.push("Thailand");
        bucketList.push("Switzerland");
        bucketList.push("Spain");
        bucketList.push("Amsterdam");
        
        //Display the size of the stack
        System.out.println("Size of the stack: "+bucketList.size());
        
        //view the top element
        System.out.println("The top element is "+bucketList.peek());
        
        //remove the top element
        bucketList.pop();
        
        //display all elements using for loop
        System.out.println("\nElements in the stack");
        for(int x=0; x<bucketList.size(); x++){
            System.out.println(bucketList.get(x));
        }
        // or for each
        System.out.println("\nUsing foreach loop");
        for(String i: bucketList){
            System.out.println(i);
        }
}        
}