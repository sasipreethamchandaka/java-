import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double percentage = (double) totalMarks / 5;

      
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}

