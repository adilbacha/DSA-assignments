import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / (double) numbers.length;
        int countGreaterThanAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                countGreaterThanAverage++;
            }
        }
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Average of the elements: " + average);
        System.out.println("Number of elements greater than average: " + countGreaterThanAverage);
        input.close();
    }
}
