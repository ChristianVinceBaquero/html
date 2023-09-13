import java.util.*;
class ScoresTestArray
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      final int MAXSIZE = 10;
      int size;
      double sum = 0;
            
      double [] myArray = new double[MAXSIZE];
      System.out.println("Note: Must be less or equal to 10: \nPlease: enter the size of the array/number of scores to manipulate: ");
      size = sc.nextInt();
      ScoresArrayOperation ar = new ScoresArrayOperation(size);
      
      ar.populate(myArray,size);
      ar.print(myArray, size,sum);
      
   }
}