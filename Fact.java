import java.util.Scanner;

public class Fact{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a integer: ");
        int n = scanner.nextInt();

        // Validate input (ensure n is non-negative)
        if (n < 0) {
            System.out.println("integer");
            return;
        }

        // Calculate factorial using recursion
        long factorial = calculateFactorial(n);

        // Display the factorial of the input number
        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }

    // Method to calculate factorial using recursion (recursive approach)
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
