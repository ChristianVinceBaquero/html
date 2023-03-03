/*FastFood.java
<Written by: <Christian Vince Baquero>
<Written on: <03/01/23>
<Course Year & Section: <BSIT-1B>
*/
import javax.swing.JOptionPane;

public class FastFood{
    public static void main(String[] args) {
        final double cheeseBurger = 250.50;
        final double pepsi = 50.75;
        final double chips = 150.00;

      

        do {
            // Display menu and prompt for first choice
            int choice1 = Integer.parseInt(JOptionPane.showInputDialog("Fast Food Menu\n\n" +
                "1. Cheeseburger - $ " + cheeseBurger + "\n" +
                "2. Pepsi - $ " + pepsi + "\n" +
                "3. Chips - $ " + chips + "\n"));

            if (choice1 == 0) {
                // User quits without ordering anything
                JOptionPane.showMessageDialog(null, "Thank you for using Fast Food. Goodbye!");
                System.exit(0);
            } else {
                // Prompt for second choice
               int choice2 = Integer.parseInt(JOptionPane.showInputDialog("Fast Food Menu\n\n" +
                    "1. Cheeseburger - $ " + cheeseBurger + "\n" +
                    "2. Pepsi - $ " + pepsi + "\n" +
                    "3. Chips - $ " + chips + "\n" ));

                if (choice2 == 0) {
                    // User only ordered one item
                  double total = getPrice(choice1);
                    JOptionPane.showMessageDialog(null, "Total cost: $ " + total);
                    System.exit(0);
                } else {
                    // Prompt for third choice
                    int choice3 = Integer.parseInt(JOptionPane.showInputDialog("Fast Food Menu\n\n" +
                        "1. Cheeseburger - $ " + cheeseBurger + "\n" +
                        "2. Pepsi - $ " + pepsi + "\n" +
                        "3. Chips - $ " + chips + "\n"));

                    if (choice3 == 0) {
                        // User only ordered two items
                       double total = getPrice(choice1) + getPrice(choice2);
                        JOptionPane.showMessageDialog(null, "Total cost: $ " + total);
                        System.exit(0);
                    } else {
                        // User ordered three items
                       double total = getPrice(choice1) + getPrice(choice2) + getPrice(choice3);
                        JOptionPane.showMessageDialog(null, "Total cost: $ " + total);
                        System.exit(0);
                    }
                }
            }
        } while (true);
    }

    private static double getPrice(int Ordered) {
        switch (Ordered) {
            case 1:
                return 250.50;
            case 2:
                return 50.75;
            case 3:
                return 150.00;
            default:
                return 0.00;
        }
    }
}