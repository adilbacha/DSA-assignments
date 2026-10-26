import java.util.Scanner; // Lets the program read values typed by the user.

public class Task11 { // Starts the class for the eleventh array task.
    public static void main(String[] args) { // Starts the program.
        Scanner input = new Scanner(System.in); // Creates input for the keyboard.
        int[] firstArray = new int[10]; // Makes the first sorted array.
        int[] secondArray = new int[10]; // Makes the second sorted array.

        System.out.println("Enter 10 values for the first sorted array:"); // Asks for the first sorted array.
        for (int i = 0; i < firstArray.length; i++) { // Visits each position in the first array.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            firstArray[i] = input.nextInt(); // Stores the entered value in the first array.
        }
        System.out.println("\nEnter 10 values for the second sorted array:"); // Asks for the second sorted array.
        for (int i = 0; i < secondArray.length; i++) { // Visits each position in the second array.
            System.out.print("Element " + i + ": "); // Shows which value to enter.
            secondArray[i] = input.nextInt(); // Stores the entered value in the second array.
        }

        int[] mergedArray = new int[firstArray.length + secondArray.length]; // Makes room for all values from both arrays.
        int i = 0, j = 0, k = 0; // Track positions in the first array, second array, and result.
        while (i < firstArray.length && j < secondArray.length) { // Continues while both arrays still have values.
            if (firstArray[i] <= secondArray[j]) { // Chooses the smaller next value from the first array.
                mergedArray[k] = firstArray[i]; // Copies that value into the result.
                i++; // Moves to the next value in the first array.
            } else { // Runs when the next value in the second array is smaller.
                mergedArray[k] = secondArray[j]; // Copies that value into the result.
                j++; // Moves to the next value in the second array.
            }
            k++; // Moves to the next free result position.
        }
        while (i < firstArray.length) { // Copies any values left in the first array.
            mergedArray[k] = firstArray[i]; // Copies the next remaining value.
            i++; // Moves forward in the first array.
            k++; // Moves forward in the result array.
        }
        while (j < secondArray.length) { // Copies any values left in the second array.
            mergedArray[k] = secondArray[j]; // Copies the next remaining value.
            j++; // Moves forward in the second array.
            k++; // Moves forward in the result array.
        }

        System.out.println("\nMerged array in sorted order:"); // Labels the sorted merged output.
        for (int index = 0; index < mergedArray.length; index++) { // Visits every value in the merged array.
            System.out.print(mergedArray[index] + " "); // Prints the current value.
        }
        System.out.println(); // Moves the cursor to a new line.
    } // Ends the main method.
} // Ends the Task11 class.
