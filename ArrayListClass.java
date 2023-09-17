import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Create an ArrayList to store Integers
        ArrayList<Integer> numberList = new ArrayList<>();

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add String");
            System.out.println("2. Add Number");
            System.out.println("3. Access Element");
            System.out.println("4. Update Element");
            System.out.println("5. Check if Element Exists");
            System.out.println("6. Get Size");
            System.out.println("7. Remove Element");
            System.out.println("8. Check if List is Empty");
            System.out.println("9. Print List");
            System.out.println("10. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a String: ");
                    String str = scanner.nextLine();
                    stringList.add(str);
                    break;
                case 2:
                    System.out.print("Enter a Number: ");
                    int num = scanner.nextInt();
                    numberList.add(num);
                    break;
                case 3:
                    System.out.print("Enter index to access: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (index >= 0 && index < stringList.size()) {
                        String accessedString = stringList.get(index);
                        System.out.println("Element at index " + index + ": " + accessedString);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.print("Enter index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (updateIndex >= 0 && updateIndex < stringList.size()) {
                        System.out.print("Enter new String: ");
                        String newStr = scanner.nextLine();
                        stringList.set(updateIndex, newStr);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.print("Enter element to check: ");
                    String checkStr = scanner.nextLine();
                    boolean exists = stringList.contains(checkStr);
                    System.out.println("Element exists in the list: " + exists);
                    break;
                case 6:
                    int size = stringList.size();
                    System.out.println("Size of the list: " + size);
                    break;
                case 7:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (removeIndex >= 0 && removeIndex < stringList.size()) {
                        stringList.remove(removeIndex);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 8:
                    boolean isEmpty = stringList.isEmpty();
                    System.out.println("Is the list empty? " + isEmpty);
                    break;
                case 9:
                    System.out.println("Elements in the list:");
                    for (String element : stringList) {
                        System.out.println(element);
                    }
                    break;
                case 10:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
 }
}
