import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }
        System.out.print("\nEnter the number to search: ");
        int target = input.nextInt();
        int[] foundIndexes = new int[10];
        int foundCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndexes[foundCount] = i;
                foundCount++;
            }
        }
        if (foundCount == 0) {
            System.out.println("The number " + target + " was not found in the array.");
        } else {
            System.out.println("The number " + target + " was found at index/indices:");
            for (int i = 0; i < foundCount; i++) {
                System.out.print(foundIndexes[i] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
