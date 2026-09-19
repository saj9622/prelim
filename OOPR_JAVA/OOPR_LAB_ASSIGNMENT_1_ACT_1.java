// OOPR211
// BSCS 2-Y1-1
// ZAPANTA JOHN LLOYD B.

// ACTIVITY 1

// • Problem Solving(Complete this activity using [1]- if else statement and [2]-switch case statement):
// 1)Your Professor is busy grading other students in her CS Department. She needs your help to grade her students in the Programming section that she teaches by creating a program in Java. Determine the grades of her students by following the rules below:
// 1) Grade her student ‘A’ if their average score is between 90 and 100.
// 2) Grade her student ‘B’ if their average score is between 80 and 89.
// 3) Grade her student ‘C’ if their average score is between 75 and 79.
// 4) Grade her student ‘F’ if their average score is below 74.
// • Input Instruction:
// 1) Take input of the student’s Java Programming score.
// 2) Take input of the student’s C Programming score.
// 3) Take input of the student’s Database Handling score.
// • Output Instruction:
// Get the average of the three subjects and grade the student.
// Sample 1:
// Input:
// Java Score:
// 78
// C Score:
// 87
// Database Handling score:
// 77
// Output:
// B
// Explanation:
// The average of the student is 80.666, so the student’s grade is B.
// Do you want to continue : YES / NO

// If user will submit YES the program will redirect. If userz will submit NO then program will terminated.

import java.util.Scanner; 

public class OOPR_LAB_ASSIGNMENT_1_ACT_1 { 
    public static void main(String[] args) { 
        
        double jvscore, cscore, dbscore;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input"); 
        
        System.out.println("Java Score: "); 
        jvscore = scanner.nextDouble();
        
        System.out.println("C Score: "); 
        cscore = scanner.nextDouble();
        
        System.out.println("Database Handling score: "); 
        dbscore = scanner.nextDouble();
        
        double avg = (jvscore + cscore + dbscore) / 3.0;
        char grade;
        
        if (avg >= 90) {
            grade = 'A';              
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Output:");
        System.out.println(grade);
        System.out.println("Explaination:");
        System.out.printf("The average of the students is %.3f, so the student's grade is %c.%n", avg, grade);
        
        System.out.println("Do you want to continue : YES / NO");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("YES")) {
            main(args);
        } else {
            System.out.println("TERMINATED.");
        }
    
        scanner.close();
        }
    }
}
