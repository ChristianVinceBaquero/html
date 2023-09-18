import java.util.*;
public class OperationArray2D
{
   Scanner sc = new Scanner(System.in);
   int num[][];
   int cols;
   int rows;
   
   public OperationArray2D(int rows, int cols)
   {
      int num[][] = new int[rows][cols];
      this.rows = rows;
      this.cols = cols;
   }
   public void populate(int myArray[][])
   {
      System.out.println("Please enter " +(this.rows * this.cols)+ " numbers ");
      for(int i=0; i<this.rows; i++){
         for(int j=0; j<this.cols; j++){
            myArray[i][j]=sc.nextInt();
         }
      }
   }
   public void print(int myArray[][]){
      System.out.println("Array Contents: ");
      for(int i=0; i<this.rows; i++){
         for(int j=0; j<this.cols; j++){
            System.out.print(myArray[i][j]+ "\t");
         }
         System.out.print("\n");
      } 
      }
      }