import java.util.Scanner;

public class AirplaneSeatingss{
    private static final int NUM_ROWS = 13;
    private static final int SEATS_PER_ROW = 6;
    private static boolean[][] seats = new boolean[NUM_ROWS][SEATS_PER_ROW];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Airplane Seating Program!\n");

        while (true) {
            // Prompt user to enter ticket type
            System.out.print("Please enter your ticket type (first class, business class, or economy class): ");
            String ticketType = scanner.nextLine().toLowerCase();

            // Check if the input is valid
            if (!ticketType.equals("first class") && !ticketType.equals("business class") && !ticketType.equals("economy class")) {
                System.out.println("Invalid ticket type. Please try again.\n");
                continue;
            }

            // Prompt user to enter desired seat
            System.out.print("Please enter your desired seat (in the format of 'row seat', e.g. '1A'): ");
            String desiredSeat = scanner.nextLine().toUpperCase();
            int row = desiredSeat.charAt(0) - '0';
            int seat = desiredSeat.charAt(1) - 'A';

            // Check if the input is valid
            if (row < 1 || row > NUM_ROWS || seat < 0 || seat >= SEATS_PER_ROW) {
                System.out.println("Invalid seat. Please try again.\n");
                continue;
            }

            // Assign the seat if it's available
            if (ticketType.equals("first class") && (row == 1 || row == 2) && !seats[row-1][seat]) {
                seats[row-1][seat] = true;
                System.out.println("Seat " + desiredSeat + " has been assigned.");
                break;
            } else if (ticketType.equals("business class") && (row >= 3 && row <= 7) && !seats[row-1][seat]) {
                seats[row-1][seat] = true;
                System.out.println("Seat " + desiredSeat + " has been assigned.");
                break;
            } else if (ticketType.equals("economy class") && (row >= 8 && row <= NUM_ROWS) && !seats[row-1][seat]) {
                seats[row-1][seat] = true;
                System.out.println("Seat " + desiredSeat + " has been assigned.");
                break;
            } else {
                System.out.println("Seat " + desiredSeat + " is not available for " + ticketType + ".");
                System.out.println("Please choose another seat or ticket type.\n");
            }
        }

        // Print the seat plan
        System.out.println("\nHere is the updated seat plan:");
        System.out.print("    ");
        for (char c = 'A'; c < 'A' + SEATS_PER_ROW; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int i = 0; i < NUM_ROWS; i++) {
            System.out.printf("%2d ", i+1);
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                if (seats[i][j]) {
                    System.out.print("\nX ");
                } else {
                    System.out.print("_ ");
                }
                }
                }
}
}
