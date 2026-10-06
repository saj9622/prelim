// Write a program that determines if the input character is a vowel or consonant. It should be able to handle uppercase and lowercase letters.
// Example:
// Enter a letter:    A                             Enter a letter: z
// It’s a vowel!                                       It’s a consonant!

import java.util.Scanner;

public class week_7_assignment_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        
        char lowerLetter = Character.toLowerCase(letter);
        
        if (Character.isLetter(lowerLetter)) {
            if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' || lowerLetter == 'o' || lowerLetter == 'u') {
                System.out.println("It’s a vowel!");
            } else {
                System.out.println("It’s a consonant!");
            }
        } else {
            System.out.println("INVALID");
        }
    }
}