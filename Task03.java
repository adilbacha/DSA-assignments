import java.util.Scanner; // Lets the program read values typed by the user.

public class Task03 { // Starts the class for the third array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] numbers = new int[10]; // Makes an array that holds 10 integers.

        System.out.println("Enter 10 integer values:"); // Asks for the array values.
        for (int i = 0; i < numbers.length; i++) { // Visits each array position.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            numbers[i] = input.nextInt(); // Stores the entered value at this position.
        }

        int sum = 0; // Starts the total at zero.
        for (int i = 0; i < numbers.length; i++) { // Visits each array value.
            sum += numbers[i]; // Adds the current value to the total.
        }
        double average = sum / (double) numbers.length; // Divides the total by the number of values.

        int countGreaterThanAverage = 0; // Counts values greater than the average.
        for (int i = 0; i < numbers.length; i++) { // Checks each array value.
            if (numbers[i] > average) { // Tests whether the value is above average.
                countGreaterThanAverage++; // Adds one to the count.
            }
        }

        System.out.println("\nSum of all elements: " + sum); // Shows the total.
        System.out.println("Average of the elements: " + average); // Shows the average.
        System.out.println("Number of elements greater than average: " + countGreaterThanAverage); // Shows the count above average.
    } // Ends the main method.
} // Ends the Task03 class.
