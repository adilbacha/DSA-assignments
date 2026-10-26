import java.util.Scanner; // Lets the program read values typed by the user.

public class Task01 { // Starts the class for the first array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes an array that holds 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        System.out.println("\nArray elements:"); // Labels the normal-order output.
        for (int i = 0; i < numbers.length; i++) { // Visits the array from start to end.
            System.out.print(numbers[i] + " "); // Prints the current value.
        }

        System.out.println("\n\nArray in reverse order:"); // Labels the reverse output.
        for (int i = numbers.length - 1; i >= 0; i--) { // Visits the array from end to start.
            System.out.print(numbers[i] + " "); // Prints the current value.
        }

        System.out.println(); // Moves the cursor to a new line.
    } // Ends the main method.
} // Ends the Task01 class.
