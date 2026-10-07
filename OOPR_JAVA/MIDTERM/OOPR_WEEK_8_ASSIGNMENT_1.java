// Create a program that input a name and prints it 5 times. Do three programs of this using while loop, do-while loop and for loop.
// Example:
// Enter your name: Cyler
// Cyler
// Cyler
// Cyler
// Cyler
// Cyler

import java.util.Scanner;

public class OOPR_WEEK_8_ASSIGNMENT_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
             char continueChoice;
        do {
            System.out.println("Choose the program you want to run");
            System.out.println("Number 1 While Loop");
            System.out.println("Number 2 Do-while Loop");
            System.out.println("Number 3 For Loop");

            System.out.print("Enter (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    runProg1();
                    break;

                case 2:
                    runProg2();
                    break;

                case 3:
                    runProg3();
                    break;

                default:
                    System.out.println("INVALID");
            }

            System.out.print("\nDo you want to continue? Y/N: ");
            continueChoice = scanner.next().toUpperCase().charAt(0);

            System.out.println();

        } while (continueChoice == 'Y');

        System.out.println("Program terminated. Goodbye!");

        scanner.close();
    }
    
    // PROGRAM 1
    public static void runProg1() {
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int i = 1;
        while (i < 5) {
            System.out.println(name);
            i++;
            }
    }
    
    // PROGRAM 2
    public static void runProg2() {
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int i = 1;
            do {
                System.out.println(name);
                i++;
            } while (i < 5);

    }

    // PROGRAM 3
    public static void runProg3() {
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        for(int i = 1; i < 5; i++) {
            System.out.println(name);
        }
            
    }

}