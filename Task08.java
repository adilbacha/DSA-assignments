import java.util.Scanner; // Lets the program read values typed by the user.

public class Task08 { // Starts the class for the eighth array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes an array that holds 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        for (int i = 0; i < numbers.length - 1; i++) { // Runs passes of Bubble Sort.
            for (int j = 0; j < numbers.length - 1 - i; j++) { // Checks adjacent values in this pass.
                if (numbers[j] > numbers[j + 1]) { // Tests whether this pair is out of order.
                    int temp = numbers[j]; // Temporarily saves the left value.
                    numbers[j] = numbers[j + 1]; // Moves the smaller value to the left.
                    numbers[j + 1] = temp; // Moves the saved value to the right.
                }
            }
        }

        System.out.println("\nArray sorted in ascending order:"); // Labels the ascending output.
        for (int i = 0; i < numbers.length; i++) { // Visits the sorted array from start to end.
            System.out.print(numbers[i] + " "); // Prints the current value.
        }
        System.out.println("\n\nArray in descending order:"); // Labels the descending output.
        for (int i = numbers.length - 1; i >= 0; i--) { // Visits the sorted array from end to start.
            System.out.print(numbers[i] + " "); // Prints the current value.
        }

        System.out.println(); // Moves the cursor to a new line.
    } // Ends the main method.
} // Ends the Task08 class.
