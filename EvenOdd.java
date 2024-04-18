import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

               if (N <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
           return;
        }

        int sumOfEven = 0;
        int sumOfOdd = 0;

       
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
               
                sumOfEven += i;
            } else {
               
                sumOfOdd += i;
            }
        }

       
        
        System.out.println("Sum of even numbers from 1 to " + N + ": " + sumOfEven);
        System.out.println("Sum of odd numbers from 1 to " + N + ": " + sumOfOdd);

        scanner.close();
    }
}
