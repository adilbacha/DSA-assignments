import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        System.out.println("Enter 10 values for the first array in ascending order:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("Element " + i + ": ");
            firstArray[i] = input.nextInt();
        }
        System.out.println("\nEnter 10 values for the second array in ascending order:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Element " + i + ": ");
            secondArray[i] = input.nextInt();
        }
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int i = 0, j = 0, k = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] <= secondArray[j]) {
                mergedArray[k] = firstArray[i];
                i++;
            } else {
                mergedArray[k] = secondArray[j];
                j++;
            }
            k++;
        }
        while (i < firstArray.length) {
            mergedArray[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < secondArray.length) {
            mergedArray[k] = secondArray[j];
            j++;
            k++;
        }
        System.out.println("\nMerged array:");
        for (int index = 0; index < mergedArray.length; index++) {
            System.out.print(mergedArray[index] + " ");
        }
        int largest = mergedArray[0];
        for (int index = 1; index < mergedArray.length; index++) {
            if (mergedArray[index] > largest) {
                largest = mergedArray[index];
            }
        }
        System.out.println("\n\nLargest element in the merged array: " + largest);
        input.close();
    }
}
