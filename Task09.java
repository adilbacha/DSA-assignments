import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }
        boolean[] checked = new boolean[10];
        int[] duplicateValues = new int[10];
        int[] duplicateCounts = new int[10];
        int duplicateCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (checked[i]) {
                continue;
            }
            int frequency = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    frequency++;
                    checked[j] = true;
                }
            }
            if (frequency > 1) {
                duplicateValues[duplicateCount] = numbers[i];
                duplicateCounts[duplicateCount] = frequency;
                duplicateCount++;
            }
            checked[i] = true;
        }
        if (duplicateCount == 0) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("\nDuplicate values and their frequencies:");
            for (int i = 0; i < duplicateCount; i++) {
                System.out.println(duplicateValues[i] + " appears " + duplicateCounts[i] + " times.");
            }
        }
        input.close();
    }
}
