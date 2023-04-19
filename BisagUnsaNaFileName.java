import java.util.*;
public class BisagUnsaNaFileName{

   static Scanner console = new Scanner(System.in);
   public static void main(String[] args){
   
   String Name[] = new String[5];
   int Votes[] = new int[5];
   double percentage[] = new double[5];
      
   displayName(Name);
   displayVotes(Votes);
   
   }
   
   
   public static void displayName(String[] name){
     System.out.print("Enter candidate's name: ");
     for(int i=0; i < name.length; i++){
     name[i] = console.next();
     
     }
     
     }
     

  public static void displayVotes(int [] votes){
    
    int num1, num2, num3, num4, num5, sum;
        
        System.out.println("First Candidate Votes");
        num1 = console.nextInt();
 
        System.out.println("Second Cadidate Votes");
        num2 = console.nextInt();
        
        System.out.println("Third Candidate Votes");
        num3 = console.nextInt();
        
        System.out.println("Forth Candidate Votes");
        num4 = console.nextInt();
        
        System.out.println("Fifth Cadidate Votes");
        num5 = console.nextInt();
 
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("Total Votes of " + num1 + " and " + num2 + " and " + num3 + " and " + num4 + " and " + num5 + " = " + sum);
        
        for (int i = 0; i < 5; i++){
         double percentage = (double) Votes[i] / totalVotes = 100;
         System.out.printf("%s: %d votes (%.2f%% of total votes)\n", Name[i], Votes[i], percentage);
        
        
     
     }
     
     }
     
     }
     
     
  
   
      
   
   
