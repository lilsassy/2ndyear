public class Array2 {
    public static void main(String args[]){
        int i = 100;
        while (i > 0){
            if(i % 2 == 1 ){
                System.out.println(i + " Odd");
            }else {
                System.out.println(i + " Even");
                i --;
            }
        }
    }
}