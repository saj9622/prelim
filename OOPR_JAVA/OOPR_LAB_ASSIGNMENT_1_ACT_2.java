// OOPR211
// BSCS 2-Y1-1
// ZAPANTA JOHN LLOYD B.

// ACTIVITY 2

// Write a java Program to perform the following Arithmetic Operations :
// Addition, 2)Subtraction, 3)Multiplication, 4)Division, 5)Modulus, 6)Increment, 6)Decrement
// NOTE: The user will submit two values

// • Output Instruction:
// Variable values:
// x = 13
// y = 9
// result = 0.0

// Arithmetic Operation:
// Addition: x + y = 22.0
// Subtraction: x - y = 4.0
// Multiplication: x * y = 117.0
// Division: x / y = 1.0
// Modulus: x % y = 4.0
// Increment: x++ = 14.0
// // Decrement: x-- = 12.0

import java.util.Scanner;

public class OOPR_LAB_ASSIGNMENT_1_ACT_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String goAgain;

        do {
            System.out.print("\nEnter the value for x: ");
            double x = scanner.nextDouble();
            
            System.out.print("Enter the value for y: ");
            double y = scanner.nextDouble();
            
            System.out.println("\nArithmetic Operation");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Modulus");
            System.out.println("6) Increment");
            System.out.println("7) Decrement");
            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            double result = 0.0;

            System.out.println("\nVariable values:");
            System.out.println("x = " + (int)x);
            System.out.println("y = " + (int)y);
            System.out.println("result = " + result);

            System.out.println("\nArithmetic Operation:");

            if (choice == 1) {
                result = x + y;
                System.out.println("Addition: x + y = " + result);
            } else if (choice == 2) {
                result = x - y;
                System.out.println("Subtraction: x - y = " + result);
            } else if (choice == 3) {
                result = x * y;
                System.out.println("Multiplication: x * y = " + result);
            } else if (choice == 4) {
                if (y == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = (int)x / (int)y;
                    System.out.println("Division: x / y = " + result);
                }
            } else if (choice == 5) {
                if (y == 0) {
                    System.out.println("Error: Modulus by zero is not allowed.");
                } else {
                    result = x % y;
                    System.out.println("Modulus: x % y = " + result);
                }
            } else if (choice == 6) {
                double tempInc = x;
                tempInc++;
                result = tempInc;
                System.out.println("Increment: x++ = " + result);
            } else if (choice == 7) {
                double tempDec = x;
                tempDec--;
                result = tempDec;
                System.out.println("Decrement: x-- = " + result);
            } else {
                System.out.println("Invalid choice! Please select an option between 1 and 7.");
            }

            scanner.nextLine(); 

            System.out.print("\nDo you want to go back and perform another operation? (yes/no): ");
            goAgain = scanner.nextLine().trim().toLowerCase();

        } while (goAgain.equals("yes") || goAgain.equals("y"));

        System.out.println("TERMINATED");
        scanner.close();
    }
}
