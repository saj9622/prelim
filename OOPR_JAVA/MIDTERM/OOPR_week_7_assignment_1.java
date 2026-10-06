// Write a program that determines if the input number is Odd or Even number.
// Example:
// Enter a number: 1325                                     Enter a number: 96
// It’s an odd number!                                        It’s an even number!
import java.util.Scanner;

public class week_7_assignment_1 {
    public static void main(String[] args) {
        int number;
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number = myObj.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("It's an even number!");
        } else {
            System.out.println("It's an odd number!");
        }
        
    }
}