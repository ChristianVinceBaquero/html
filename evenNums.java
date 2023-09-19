/* <Name:Baquero, Christian Vince>
   <Course & Section: BSIT- 2B>
   <Date: 9/6/23>
   <Owner of the Code: Ochea, James Bryle>
*/
import java.util.*;

public class evenNums{
   static int f(int n)
   {
   //Initializing the sum to 0
      int i, sum = 0;
   //This loop checks if the corresponding number is even then adds it to the sum.
      for (i = 2; i <= n; i+=2) {
         sum += i;
      }
   //returns the overall sum if it is rendered as false
      return sum;
   }
   public static void main(String argc[])
   {
      System.out.println("Enter any number: ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("Sum of all even numbers from 1 up until "+ n + " is: " + f(n));
   }
}