import java.util.Scanner; // Lets the program read values typed by the user.

public class Task02 { // Starts the class for the second array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes an array that holds 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        int smallest = numbers[0]; // Starts the smallest value at the first number.
        int secondSmallest = numbers[0]; // Starts the second-smallest value.
        int smallestIndex = 0; // Saves the index of the smallest value.
        int secondIndex = 0; // Saves the index of the second-smallest value.
        boolean secondFound = false; // Tracks whether a second value has been chosen.

        for (int i = 1; i < numbers.length; i++) { // Checks each value after the first.
            if (numbers[i] < smallest) { // Checks whether this value is the new smallest.
                secondSmallest = smallest; // Moves the old smallest into second place.
                secondIndex = smallestIndex; // Moves its index into second place.
                smallest = numbers[i]; // Saves the new smallest value.
                smallestIndex = i; // Saves the new smallest value's position.
                secondFound = true; // Confirms that a second value is available.
            } else if (!secondFound || numbers[i] < secondSmallest) { // Checks for a better second-smallest value.
                secondSmallest = numbers[i]; // Saves the second-smallest value.
                secondIndex = i; // Saves its position.
                secondFound = true; // Confirms that a second value is available.
            }
        }

        System.out.println("Smallest value: " + smallest + " at index " + smallestIndex); // Shows the smallest value and its index.
        System.out.println("Second smallest value: " + secondSmallest + " at index " + secondIndex); // Shows the second-smallest value and its index.
    } // Ends the main method.
} // Ends the Task02 class.
