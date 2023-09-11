/*<Name: Baquero, Christian Vince>
  <Course & Section: BSIT-2B>
  <Date: 9/11/23>
  <Owner of the Code: ChatGPT>
*/
import java.util.Scanner;
import java.util.Arrays;

public class ArrayBasedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null; // Initialize an array to hold user data
        boolean exit = false;

        while (!exit) {
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. Populate array elements");
            System.out.println("2. Print array elements");
            System.out.println("3. Insert new element");
            System.out.println("4. Delete an element");
            System.out.println("5. Search an element");
            System.out.println("6. Sort array elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();  // Read the user's choice

            switch (choice) {
                case 1:
                    // Populate array elements
                    System.out.print("Enter the number of elements: ");
                    int n = scanner.nextInt();
                    array = new int[n];   // Initialize the array with the specified size
                    System.out.println("Enter " + n + " numbers:");
                    for (int i = 0; i < n; i++) {
                        array[i] = scanner.nextInt();   // Read and store user input in the array
                    }
                    break;

                case 2:
                    // Print array elements
                    if (array != null) {
                        System.out.println("Array elements:");
                        for (int num : array) {
                            System.out.print(num + " ");   // Print each element in the array
                        }
                        System.out.println();
                    } else {
                        System.out.println("Array is empty.");
                    }
                    break;

                case 3:
                    // Insert new element
                    if (array != null) {
                        System.out.print("Enter the new element: ");
                        int newItem = scanner.nextInt();
                        System.out.print("Enter the location to insert (0 to " + (array.length - 1) + "): ");
                        int location = scanner.nextInt();

                        if (location >= 0 && location <= array.length) {
                            int[] newArray = new int[array.length + 1];
                            for (int i = 0, j = 0; i < newArray.length; i++) {
                                if (i == location) {
                                    newArray[i] = newItem;   // Insert the new element at the specified location  
                                } else {
                                    newArray[i] = array[j];   // Copy elements from the old array
                                    j++;
                                }
                            }
                            array = newArray;   // Update the array reference
                            System.out.println("Element inserted successfully.");
                        } else {
                            System.out.println("Invalid location. Insertion failed.");
                        }
                    } else {
                        System.out.println("Array is empty. Please populate it first.");
                    }
                    break;

                case 4:
                    // Delete an element
                    if (array != null && array.length > 0) {
                        System.out.print("Enter the index of the element to delete (0 to " + (array.length - 1) + "): ");
                        int indexToDelete = scanner.nextInt();

                        if (indexToDelete >= 0 && indexToDelete < array.length) {
                            int[] newArray = new int[array.length - 1];
                            for (int i = 0, j = 0; i < array.length; i++) {
                                if (i != indexToDelete) {
                                    newArray[j] = array[i];  // Copy elements except the one to delete
                                    j++;
                                }
                            }
                            array = newArray;   // Update the array reference
                            System.out.println("Element deleted successfully.");
                        } else {
                            System.out.println("Invalid index. Deletion failed.");
                        }
                    } else {
                        System.out.println("Array is empty.");
                    }
                    break;

                case 5:
                    // Search an element
                    if (array != null && array.length > 0) {
                        System.out.print("Enter the element to search: ");
                        int searchItem = scanner.nextInt();
                        boolean found = false;

                        for (int i = 0; i < array.length; i++) {
                            if (array[i] == searchItem) {
                                System.out.println("Element found at index " + i + ".");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Element not found in the array.");
                        }
                    } else {
                        System.out.println("Array is empty.");
                    }
                    break;

                case 6:
                    // Sort array elements
                    if (array != null) {
                        Arrays.sort(array);  // Sort the array in ascending order
                        System.out.println("Array sorted successfully.");
                    } else {
                        System.out.println("Array is empty.");
                    }
                    break;

                case 7:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        scanner.close();   // Close the scanner when done
    }
}
