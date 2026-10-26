import java.util.Scanner; // Lets the program read values typed by the user.

public class Task04 { // Starts the class for the fourth array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes an array that holds 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        System.out.print("\nEnter the number to search: "); // Asks which value to find.
        int target = input.nextInt(); // Saves the value to search for.
        int[] foundIndexes = new int[10]; // Holds the positions where the value is found.
        int foundCount = 0; // Counts how many matching positions are found.

        for (int i = 0; i < numbers.length; i++) { // Checks each array value in order.
            if (numbers[i] == target) { // Tests whether this value matches the search value.
                foundIndexes[foundCount] = i; // Saves the matching position.
                foundCount++; // Moves to the next free position in the index array.
            }
        }

        if (foundCount == 0) { // Checks whether there were no matches.
            System.out.println("The number " + target + " was not found in the array."); // Reports that the value is absent.
        } else { // Runs when at least one match was found.
            System.out.println("The number " + target + " was found at index/indices:"); // Labels the matching positions.
            for (int i = 0; i < foundCount; i++) { // Visits each saved matching position.
                System.out.print(foundIndexes[i] + " "); // Prints the matching position.
            }
            System.out.println(); // Moves the cursor to a new line.
        }

    } // Ends the main method.
} // Ends the Task04 class.
