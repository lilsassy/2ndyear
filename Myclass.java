import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Timer;
import java.util.*;
public class Myclass {
    public static void main(String args[]) {
      Queue<Integer> queue=new LinkedList<>();
      Scanner scan=new Scanner(System.in);
      queue.offer(1);
      queue.offer(2);
      queue.offer(3);
      queue.offer(4);
      System.out.println("Calling customer "+queue.peek());
      System.out.print("Enter customer number: ");
      int cusNum=scan.nextInt();
      try{
          if(cusNum==1){
              System.out.println("Customer "+queue.peek()+ " is on transaction");
             
            //   Timer time=new Timer();
           //   int ct=7000;
            //   time=new Timer(ct, this);
            //   time.start();
            //   time.schedule(new RemindTask(), seconds*1000);
              Thread.sleep(7000);
              System.out.println("Customer "+ queue.peek()+ " done transaction");
              queue.poll();
              Thread.sleep(7000);
              System.out.println("Next is customer "+ queue.peek());
      }else{
          System.out.println("Wrong customer. Please wait for your number to be called");
      }
      System.out.println("On queue" + queue);
      }
      catch(Exception e){
          System.out.println(e);
      }
    }
}