import java.util.Scanner;

public class Multi{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the limit for the multiplication table (e.g., 10): ");
        int limit = scanner.nextInt();

       
        System.out.println("Multiplication table for " + number + " up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
