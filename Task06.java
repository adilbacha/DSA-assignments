import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }
        System.out.print("\nEnter the index to delete: ");
        int deleteIndex = input.nextInt();
        if (deleteIndex < 0 || deleteIndex >= numbers.length) {
            System.out.println("Invalid index. Please choose an index between 0 and " + (numbers.length - 1) + ".");
            return;
        }
        int[] updatedArray = new int[numbers.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            updatedArray[i] = numbers[i];
        }
        for (int i = deleteIndex + 1; i < numbers.length; i++) {
            updatedArray[i - 1] = numbers[i];
        }
        System.out.println("\nUpdated array after deletion:");
        for (int i = 0; i < updatedArray.length; i++) {
            System.out.print(updatedArray[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
