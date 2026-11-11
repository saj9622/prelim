import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("Enter number of students (1-50): ");
                n = sc.nextInt();
                if (n >= 1 && n <= 50) {
                    break;
                } else {
                    System.out.println("INVALID! Number must be between 1 and 50.");
                }
            } catch (InputMismatchException e) {
                System.out.println("INVALID! Please enter a whole number.");
                sc.next();
            }
        }

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Enter score for student " + (i + 1) + " (0-100): ");
                    int score = sc.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[i] = score;
                        break;
                    } else {
                        System.out.println("INVALID! Score must be between 0 and 100.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("INVALID! Please enter a valid integer score.");
                    sc.next();
                }
            }
        } // <-- Added missing closing brace for the input 'for' loop

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + scores[i];
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            if (scores[i] >= 75) {
                pass++;
            } else {
                fail++;
            }
        }

        double average = (double) sum / n;

        System.out.println("\nResults");
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Passing: " + pass);
        System.out.println("Failing: " + fail);

        printTopStudents(scores, highest);
        sc.close();
    }

    public static void printTopStudents(int[] scores, int highest) {
        System.out.print("Highest scorer(s): ");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == highest) {
                System.out.print("Student " + (i + 1) + " | ");
            }
        }
        System.out.println();
    }
}
