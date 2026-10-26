import java.util.Scanner; // Lets the program read values typed by the user.

public class Task05 { // Starts the class for the fifth array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes the original array of 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        System.out.print("\nEnter the index to insert at: "); // Asks where to insert the value.
        int insertIndex = input.nextInt(); // Saves the requested insertion position.
        System.out.print("Enter the new value: "); // Asks for the value to insert.
        int newValue = input.nextInt(); // Saves the new value.

        if (insertIndex < 0 || insertIndex > numbers.length) { // Checks whether the position is outside the allowed range.
            System.out.println("Invalid index. The index must be between 0 and " + numbers.length + "."); // Explains the valid position range.
            return; // Stops because the insertion position is invalid.
        }

        int[] updatedArray = new int[numbers.length + 1]; // Makes room for one extra value.
        for (int i = 0; i < insertIndex; i++) { // Copies values before the insertion position.
            updatedArray[i] = numbers[i]; // Keeps each earlier value in the same position.
        }
        updatedArray[insertIndex] = newValue; // Places the new value at the requested position.
        for (int i = insertIndex; i < numbers.length; i++) { // Copies the remaining values after the new value.
            updatedArray[i + 1] = numbers[i]; // Shifts each remaining value one position to the right.
        }

        System.out.println("\nUpdated array after insertion:"); // Labels the changed array.
        for (int i = 0; i < updatedArray.length; i++) { // Visits every value in the new array.
            System.out.print(updatedArray[i] + " "); // Prints the current value.
        }
        System.out.println(); // Moves the cursor to a new line.
    } // Ends the main method.
} // Ends the Task05 class.
