import java.util.Scanner;

public class fibanoci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("enter a positive integer.");
            return; 
        }
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        int num1 = 0;
        int num2= 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

         
            int num3 = num1+ num2;
            num1 = num2;
            num2= num3;
        }
    }
}
