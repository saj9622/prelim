import java.util.Scanner;

public class OOP_MIDTERM_Class_Acitivy_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";

        while (true) {
            System.out.print("Please enter your name: ");
            name = input.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be BLANK\n");
            } else if (!name.matches("^[a-zA-Z ]+$")) { 
                System.out.println("Name must ONLY contain letters and spaces\n");
            } else {
                break;
            }
        }
        System.out.println("Welcome " + name + "!\n");

        int totalPages = 0;
        while (true) {
            System.out.print("How many pages does the book have?: ");
            if (input.hasNextInt()) {
                totalPages = input.nextInt();
                if (totalPages > 0) {
                    break;
                }
                System.out.println("THE BOOK MUST HAVE AT LEAST 1 PAGE.\n");
            } else {
                System.out.println("ENTER VALID WHOLE NUMBER.\n");
                input.next();
            }
        }

        int pagesRead = 0;
        while (true) {
            System.out.print("How many pages have you read?: ");
            if (input.hasNextInt()) {
                pagesRead = input.nextInt();
                if (pagesRead >= 0 && pagesRead <= totalPages) {
                    break;
                }
                System.out.println("PAGES READ CANNOT BE LESS THAN 0 OR MORE THAN " + totalPages + ".\n");
            } else {
                System.out.println("ENTER VALID WHOLE NUMBER.\n");
                input.next();
            }
        }

        int allottedDays = 0;
        while (true) {
            System.out.print("How many total days allotted for borrowing: ");
            if (input.hasNextInt()) {
                allottedDays = input.nextInt();
                if (allottedDays > 0) {
                    break;
                }
                System.out.println("ALLOTTED DAYS MUST BE AT LEAST 1 DAY.\n");
            } else {
                System.out.println("ENTER VALID WHOLE NUMBER.\n");
                input.next();
            }
        }

        int daysReading = 0;
        while (true) {
            System.out.print("How many days you have been reading: ");
            if (input.hasNextInt()) {
                daysReading = input.nextInt();
                if (daysReading >= 0) {
                    break;
                }
                System.out.println("DAYS READING CANNOT BE LESS THAN 0.\n");
            } else {
                System.out.println("ENTER VALID WHOLE NUMBER.\n");
                input.next();
            }
        }

        double percentageRead = ((double) pagesRead / totalPages) * 100;
        int daysRemaining = allottedDays - daysReading;
        int pagesLeft = totalPages - pagesRead;
        double pagesPerDay = (daysRemaining > 0) ? (double) pagesLeft / daysRemaining : 0.0;

        System.out.println();
        System.out.printf("1. Percentage read: %.2f%%\n", percentageRead);
        System.out.println("2. Days remaining to return: " + daysRemaining + " day(s)");
        System.out.printf("3. Pages to read every day: %d pages/day\n", (int) Math.ceil(pagesPerDay));
        System.out.println();

        if (daysRemaining == 0) {
            System.out.println("RETURN THE BOOKS!");
        } else if (daysRemaining < 0) {
            System.out.println("YOU'RE LATE RETURNING THE BOOKS!");
        } else {
            System.out.println("KEEP READING!");
        }

        input.close();
    }
}
