import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("enter a integer.");
            return;
        }

        boolean isPrime = checkIfPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean checkIfPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }

        return true; 
    }
}
