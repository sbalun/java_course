package chapter3;
/*
Chapter 3d: IF - ELSE - IF Statements
Who? A Student
What? translate a number grade into it's corresponding letter grade
Why? so they may know the letter grade they will get on their report card
 */
import java.util.Scanner;

public class TestResults {

    public static void main(String[] args){

        // Get the test score
        System.out.println("Yo, what's your test score?");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();
        scanner.close();

        // Determine the letter grade
        char grade;

        if (testScore < 60) {
            grade = 'F';
        }
        else if (testScore < 70) {
            grade = 'D';
        }
        else if (testScore < 80) {
            grade = 'C';
        }
        else if (testScore < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your score of " + testScore + " resulted in a grade of " + grade);
    }
}
