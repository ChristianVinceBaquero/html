import java.util.*;

public class myBookArrayAct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        myBookAct[] books = new myBookAct[10];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the title of Fiction Book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            books[i] = new myFictionAct(title);
        }

        for (int i = 5; i < 10; i++) {
            System.out.print("Enter the title of NonFiction Book " + (i - 4) + ": ");
            String title = scanner.nextLine();
            books[i] = new myNonFictionAct(title);
        }

        System.out.println("Book Details:");
        for (myBookAct book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Price: $" + book.getPrice());
            System.out.println();
        }

        scanner.close();
    }
}
