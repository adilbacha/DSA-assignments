import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }
        int smallest = numbers[0];
        int secondSmallest = numbers[0];
        int smallestIndex = 0;
        int secondIndex = 0;
        boolean secondFound = false;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                secondIndex = smallestIndex;
                smallest = numbers[i];
                smallestIndex = i;
                secondFound = true;
            } else if (!secondFound || numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
                secondIndex = i;
                secondFound = true;
            }
        }
        System.out.println("\nSmallest value: " + smallest + " at index " + smallestIndex);
        System.out.println("Second smallest value: " + secondSmallest + " at index " + secondIndex);
        input.close();
    }
}
