import java.util.Stack;
public class bucketlist {
 
    public static void main(String[]args){
        Stack <String> bucketlist = new Stack<>();
//#2check if the stack is empty
        display("Checking if stack is empty..");
        boolean monitor_Record = bucketlist.empty();
        display("The stack is:" + monitor_Record);

        display("Element in the stack after pop");

            //#3 insert 5  places
        bucketlist.push("Italy");
        bucketlist.push("Japan");
        bucketlist.push("America");
        bucketlist.push("Paris");
        bucketlist.push("Hawaii");

        System.out.println("Stack" +  bucketlist);

        
       //view top element

        bucketlist.peek();
        System.out.println(bucketlist + "");
    
//remove the top element
        bucketlist.pop();
//Stack using forloop or foreach loop
        for(String element : bucketlist){
            display(element);
        }
//perform a search operation
        if(bucketlist.contains("Italy")){
            display("Italy is in the stack");
        } else{
            display("Italy is not in the Stack");
        }

    }

    static void display(String x){
        System.out.println(x);
    }
}
