import java.util.Scanner;

public class Hcf{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Validate input (ensure both numbers are positive)
       if (num1 <= 0 || num2 <= 0) {
            System.out.println("Invalid input. Please enter positive integers.");
            return;
        }

        // Calculate the HCF/GCD using the Euclidean algorithm
        int hcf = calculateHCF(num1, num2);

        // Display the HCF/GCD of the two numbers
        System.out.println("Highest Common Factor (HCF) of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    // Method to calculate HCF/GCD using the Euclidean algorithm
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
