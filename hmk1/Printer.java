import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        printNumbersInRange(num1, num2);

        scanner.close();
    }

    public static void printNumbersInRange(int start, int end) {
        // Ensure start is less than end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        // Print only odd numbers between start and end (exclusive)
        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {  // Check if odd
                System.out.println(i);
            }
        }
    }
}