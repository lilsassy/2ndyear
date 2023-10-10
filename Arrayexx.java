public class Arrayexx {
    public static void main(String[] args){
        int[] ars = {2,3,-2,-5,6};

        System.out.println("The indices are " + ars.length);
        int  sum = 0;
        for(int number : ars){
           sum += number;

        }
        
        System.out.println("The values are ");
        System.out.println(ars[0]);
        System.out.println(ars[1]);
        System.out.println(ars[2]);
        System.out.println(ars[3]);
        System.out.println(ars[4]);
       
        
        System.out.println("Sum is :" + sum);
     

    }
}
