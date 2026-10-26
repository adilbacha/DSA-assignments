import java.util.Scanner; // Lets the program read values typed by the user.

public class Task09 { // Starts the class for the ninth array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes an array that holds 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        boolean[] checked = new boolean[10]; // Marks values already checked for duplicates.
        int[] duplicateValues = new int[10]; // Stores each duplicate value once.
        int[] duplicateCounts = new int[10]; // Stores how often each duplicate occurs.
        int duplicateCount = 0; // Counts the different duplicate values.

        for (int i = 0; i < numbers.length; i++) { // Checks each value as a possible duplicate.
            if (checked[i]) { // Checks whether this value was counted already.
                continue; // Skips values that were already checked.
            }
            int frequency = 1; // Counts the current value, starting with itself.
            for (int j = i + 1; j < numbers.length; j++) { // Looks at the values after the current one.
                if (numbers[i] == numbers[j]) { // Checks whether the later value is the same.
                    frequency++; // Adds one to this value's frequency.
                    checked[j] = true; // Marks the matching value as already counted.
                }
            }
            if (frequency > 1) { // Checks whether the current value is a duplicate.
                duplicateValues[duplicateCount] = numbers[i]; // Saves this duplicate value once.
                duplicateCounts[duplicateCount] = frequency; // Saves its total frequency.
                duplicateCount++; // Moves to the next free result position.
            }
            checked[i] = true; // Marks the current value as checked.
        }

        if (duplicateCount == 0) { // Checks whether no duplicate value was found.
            System.out.println("No duplicate values found."); // Reports that there are no duplicates.
        } else { // Runs when at least one duplicate value was found.
            System.out.println("\nDuplicate values and their frequencies:"); // Labels the duplicate results.
            for (int i = 0; i < duplicateCount; i++) { // Visits each saved duplicate.
                System.out.println(duplicateValues[i] + " appears " + duplicateCounts[i] + " times."); // Prints the value and its frequency.
            }
        }

    } // Ends the main method.
} // Ends the Task09 class.
