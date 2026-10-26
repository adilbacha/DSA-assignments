import java.util.Scanner; // Lets the program read values typed by the user.

public class Task06 { // Starts the class for the sixth array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes the original array of 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        System.out.print("\nEnter the index to delete: "); // Asks which position to remove.
        int deleteIndex = input.nextInt(); // Saves the position to delete.
        if (deleteIndex < 0 || deleteIndex >= numbers.length) { // Checks whether the position is outside the array.
            System.out.println("Invalid index. Please choose an index between 0 and " + (numbers.length - 1) + "."); // Explains the valid index range.
            return; // Stops because the deletion position is invalid.
        }

        int[] updatedArray = new int[numbers.length - 1]; // Makes an array with one fewer position.
        for (int i = 0; i < deleteIndex; i++) { // Copies the values before the deleted position.
            updatedArray[i] = numbers[i]; // Keeps each earlier value in the same position.
        }
        for (int i = deleteIndex + 1; i < numbers.length; i++) { // Copies the values after the deleted position.
            updatedArray[i - 1] = numbers[i]; // Shifts each later value one position to the left.
        }

        System.out.println("\nUpdated array after deletion:"); // Labels the changed array.
        for (int i = 0; i < updatedArray.length; i++) { // Visits every value in the new array.
            System.out.print(updatedArray[i] + " "); // Prints the current value.
        }
        System.out.println(); // Moves the cursor to a new line.
    } // Ends the main method.
} // Ends the Task06 class.
