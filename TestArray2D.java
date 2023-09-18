import java.util.*;
class TestArray2D
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int rows, cols;
      int numArr[][] = new int[10][10];
      System.out.println("Please enter the size of the 2D array.");
      rows = scan.nextInt();
      cols = scan.nextInt();
      OperationArray2D arr2D = new OperationArray2D(rows,cols);
      arr2D.populate(numArr);
      arr2D.print(numArr);
   }
}