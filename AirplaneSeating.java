import java.util.*;
public class AirplaneSeating
{
    int count = 0 ;
    public static void main(String[] args)
    {
        // two- dimensional array with 7 rows and 4 columns 
        char[][] seats = new char [13][6] ;
        for (int i = 0; i < 13; i++)
        {
            seats[i][0] = 'A' ;
            seats[i][1] = 'B' ;
            seats[i][2] = 'C' ;
            seats[i][3] = 'D' ;
            seats[i][4] = 'E' ;
            seats[i][5] = 'F' ;
            
        }

        String seatNumber = " " ; 
        int count = 0 ;
        String q = " " ;
        int numberOfSeatsAvailable = 0 ;
        int filled = 0 ;
        System.out.println("Welcome to the Airplane Seating Reservation System.") ;
        System.out.println("Please enter the seat (e.g.- 1A) you wish to reserve.") ;
        System.out.println("Enter q to exit.") ;
        Scanner keyboard = new Scanner(System.in);
        seatNumber = keyboard.nextLine() ;
        count++ ;
        if (seatNumber.equals("q"))
       {
            System.out.println("Program ended.") ;
            System.exit(0) ;
       } 
        else
       {
         //print seating pattern and put an X in the seatNumber location
         while((filled < 78) && (seatNumber.length() > 0))
         {
            int row = seatNumber.charAt(0) - '1' ;
            int col = seatNumber.charAt(1) - 'A' ;
            count ++ ;
            if (row < 0 || row > 13 || col < 0 || col > 6)
            {
                System.out.println("Input error. Enter seat to assign (e.g., '1A')," +
                    "or q to quit.");
                seatNumber = keyboard.nextLine() ;
                count++ ;
            }
            else
            {
                if (seats[row][col] != 'X')
                {
                    seats[row][col] = 'X' ;
                    filled++;
                    System.out.println(" ") ;
                    printSeats(seats);
                }
                if (filled < 78)
                {
                    System.out.println("Enter seat to assign (e.g., '1A')," +
                        "or q to quit.");
                    seatNumber = keyboard.nextLine();
                    count++ ;
                }
             }
          }         
        }
    }

    private static void printSeats(char[][] seats)
    {
        int count = 0;
        System.out.println("Row") ;
        for (int i = 0; i < seats.length; i++)
        {
            System.out.println((i + 1) + "  " + 
                seats[i][0] + " " + seats[i][1] + "  " + seats[i][2] + " " + seats[i][3] + " " + seats[i][4] + " " + seats[i][5]) ;

        }
        count++ ;
        int numberOfSeatsAvailable = 0 ;     
        numberOfSeatsAvailable = (78 - count) ;      
        System.out.println("There are " + numberOfSeatsAvailable + " seats available.") ;
    }  //end main
}  //end class