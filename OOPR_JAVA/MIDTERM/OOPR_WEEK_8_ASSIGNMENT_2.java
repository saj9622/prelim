// Get a number from the user, and output the number in words. The number should range from     1-10. If the number inputted is not in the range, output, “Invalid Number”.
// Use if-else statement or switch statement to solve this problem.
// Do this until the user presses N to terminate the program. Use either of the Loop statements.
 
// Example:
// Enter a number from 1-10:  5
// Five
// Again? y/n: y
// Enter a number from 1-10: 12
// Invalid Number
// Again? y/n: n
// Exiting…..

import java.util.Scanner;

public class OOPR_WEEK_8_ASSIGNMENT_2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char continueChoice;
        do {
            
            int number = 0;
            System.out.print("Enter a number from 1-10: ");
            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("One");
            } else if (number == 2) {
                System.out.println("Two");
            } else if (number == 3) {
                System.out.println("Three");
            } else if (number == 4) {
                System.out.println("Four");
            } else if (number == 5) {
                System.out.println("Five");
            } else if (number == 6) {
                System.out.println("Six");
            } else if (number == 7) {
                System.out.println("Seven");
            } else if (number == 8) {
                System.out.println("Eight");
            } else if (number == 9) {
                System.out.println("Nine");
            } else if (number == 10) {
                System.out.println("Ten");
            } else {
                System.out.println("Invalid Number");
            }

            System.out.print("Again? y/n: ");
            continueChoice = scanner.next().toLowerCase().charAt(0);
 
        } while (continueChoice == 'y');
        
        System.out.println("Exiting.....");

        scanner.close();
    }
}