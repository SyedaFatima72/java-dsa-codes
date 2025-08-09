import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Initialize an array of size 20
        String[] myArray = new String[20];

        // Get 10 inputs from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            myArray[i] = scanner.nextLine();
        }

        // Get values and indices for the remaining 10 elements
        for (int i = 10; i < 20; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            String value = scanner.nextLine();

            System.out.print("Enter index to insert element " + (i + 1) + " (0-19): ");
            int index = Integer.parseInt(scanner.nextLine());

            // Ensure the index is within bounds
            if (index >= 0 && index <= 19) {
                // Shift elements to make space for the new element
                for (int j = 19; j > index; j--) {
                    myArray[j] = myArray[j - 1];
                }
                myArray[index] = value;
            } else {
                System.out.println("Invalid index. Element not inserted.");
            }
        }

        // Print the resulting array
        System.out.print("Final array: [");
        for (int i = 0; i < 20; i++) {
            System.out.print(myArray[i]);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}



