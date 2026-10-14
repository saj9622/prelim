import java.util.Scanner;

public class OOP_MIDTERM_Class_Acitivy_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome!");

        System.out.print("How many pages does the book have?: ");
        int totalPages = input.nextInt();

        System.out.print("How many pages have you read?: ");
        int pagesRead = input.nextInt();

        System.out.print("How many days you have been reading: ");
        int daysReading = input.nextInt();

        System.out.print("How many total days allotted for borrowing: ");
        int allottedDays = input.nextInt();

        double percentageRead = ((double) pagesRead / totalPages) * 100;

        int daysRemaining = allottedDays - daysReading;

        int pagesLeft = totalPages - pagesRead;
        double pagesPerDay = (double) pagesLeft / daysRemaining;

        System.out.println("\n");
        System.out.println("1. Percentage read: " + percentageRead + "%");
        System.out.println("2. Days remaining to return: " + daysRemaining + " day(s)");
        System.out.println("3. Pages to read every day: " + pagesPerDay + " pages/day");

        if (daysRemaining < 0) {
          System.out.println("OVERDUE!");
        } else if (daysRemaining == 0) {
          System.out.println("RETURN THE BOOKS!");
        } else if (daysRemaining > 0) {
          System.out.println("KEEP READING!");
        }
        input.close();
    }
}
