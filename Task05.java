import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }
        System.out.print("\nEnter the index to insert at: ");
        int insertIndex = input.nextInt();
        System.out.print("Enter the new value: ");
        int newValue = input.nextInt();
        if (insertIndex < 0 || insertIndex > numbers.length) {
            System.out.println("Invalid index. The index must be between 0 and " + numbers.length + ".");
            return;
        }
        int[] updatedArray = new int[numbers.length + 1];
        for (int i = 0; i < insertIndex; i++) {
            updatedArray[i] = numbers[i];
        }
        updatedArray[insertIndex] = newValue;
        for (int i = insertIndex; i < numbers.length; i++) {
            updatedArray[i + 1] = numbers[i];
        }
        System.out.println("\nUpdated array after insertion:");
        for (int i = 0; i < updatedArray.length; i++) {
            System.out.print(updatedArray[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
