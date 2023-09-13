import java.util.*;
class ScoresArrayOperation
{
   Scanner sc = new Scanner(System.in);
   int [] array;
   
   public ScoresArrayOperation(int size){
   int [] array = new int[size];
   } 
   public void populate(double myArray[], int size)
   {
      System.out.println("Please enter "+size+" integers.");
      for(int i = 0; i < size; i++)
         myArray[i] = sc.nextDouble();
         }
      
      public void print(double [] myArray, int size, double sum)
      {
         System.out.println("Total Sums of Scores: ");
         for(int i = 0; i < size; i++){
         sum = myArray[i] + sum;
         }
         System.out.println(""+ sum);
         
         System.out.println("Scores Inputted: ");
            System.out.println(""+ sum/size);
            
         System.out.println("\nMinimum score: " + myArray[0]);
            System.out.println("Maximum score: " + myArray[size - 1]);
            
         System.out.println("Total Scores: ");
         System.out.println(""+ size);
         
         System.out.println("Scores Inputted: ");
         for(int i = 0; i < size; i++){
         System.out.println("  "+ myArray[i]);   
      }
      
}
}
