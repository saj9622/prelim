// OOPR211
// BSCS 2-Y1-1
// ZAPANTA JOHN LLOYD B.

// //Write a program that outputs the number with the greatest value among the three input values.

// Example:

// Enter first number: 10

// Enter second number: 23

// Enter third number: 5

// The highest number is  23

import java.util.Scanner;

public class WEEK_5_ASSIGNMENT_2 {
    public static void main(String[] Ono) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter third number: ");
        int third = scanner.nextInt();

        int highest = first;

        if (second > highest) {
            highest = second;
        }
        if (third > highest) {
            highest = third;
        }

        System.out.println("The highest number is " + highest);

        scanner.close();
    }
}
