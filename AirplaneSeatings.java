import java.util.Scanner;
public class AirplaneSeatings{
    
    public static void main(String[] args) {
        // Constants for number of rows and seats per row
        final int NUM_ROWS = 13;
        final int SEATS_PER_ROW = 6;

        // Create a 2D array to represent the airplane seating
        char[][] seating = new char[NUM_ROWS][SEATS_PER_ROW];

        // Initialize the seating array with empty seats
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                seating[i][j] = ' ';
            }
        }

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for ticket type and desired seat
        System.out.println("Welcome to Paradise Place Airlines!");
        System.out.println("Enter '1' for First Class, '2' for Business Class, or '3' for Economy Class:");
        int ticketType = scanner.nextInt();
        System.out.println("Enter desired seat (e.g. '3A', '10F'):");
        String desiredSeat = scanner.next();

        // Check if the desired seat is valid
        int row = Integer.parseInt(desiredSeat.substring(0, desiredSeat.length() - 1)) - 1;
        int seatIndex = getSeatIndex(desiredSeat.charAt(desiredSeat.length() - 1));
        if (row < 0 || row >= NUM_ROWS || seatIndex == -1) {
            System.out.println("Invalid seat selection. Exiting program.");
            scanner.close();
            System.exit(0);
        }

        // Assign the seat based on ticket type
        if (ticketType == 1 && (row >= 0 && row < 2)) {
            // First Class
            if (seating[row][seatIndex] == ' ') {
                seating[row][seatIndex] = 'X';
                System.out.println("Seat " + desiredSeat + " assigned in First Class.");
            } else {
                System.out.println("Seat " + desiredSeat + " already taken. Exiting program.");
            }
        } else if (ticketType == 2 && (row >= 2 && row < 7)) {
            // Business Class
            if (seating[row][seatIndex] == ' ') {
                seating[row][seatIndex] = 'X';
                System.out.println("Seat " + desiredSeat + " assigned in Business Class.");
            } else {
                System.out.println("Seat " + desiredSeat + " already taken. Exiting program.");
            }
        } else if (ticketType == 3 && (row >= 7 && row < 13)) {
            // Economy Class
            if (seating[row][seatIndex] == ' ') {
                seating[row][seatIndex] = 'X';
                System.out.println("Seat " + desiredSeat + " assigned in Economy Class.");
            } else {
                System.out.println("Seat " + desiredSeat + " already taken. Exiting program.");
            }
        } else {
            System.out.println("Invalid ticket type or seat selection. Exiting program.");
        }

        scanner.close();
    }

    // Helper method to get the index of the seat in the row
    public static int getSeatIndex(char seat) {
        String validSeats = "ABCDEF";
        return validSeats.indexOf(Character.toUpperCase(seat));
    }
}
