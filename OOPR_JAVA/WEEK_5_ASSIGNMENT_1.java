import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WEEK_5_ASSIGNMENT_1 {
    public static void main(String[] args) {

    // BUFFERED READER

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word1 = "";
        
        try {
            System.out.print("Enter first word: ");
            word1 = reader.readLine().trim();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }

        // SCANNER

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter second word: ");
        String word2 = scanner.next();

        System.out.print("Enter third word: ");
        String word3 = scanner.next();

        System.out.println(word1 + " " + word2 + " " + word3);
        
        scanner.close();
    }
}