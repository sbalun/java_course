package chapter3;

import java.util.Scanner;

/*
Using the SWITCH statement.
- Similar to if - else - if.
- The difference between the if-else-if and the switch statements is that the if-else-if
     checks the condition to be true; whereas the switch statement checks for equality.
 */
public class GradeMessage {

    public static void main(String[] args){

        // get the score
        System.out.println("Enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        // determine the letter grade
        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Try studying";
                break;
            case "D":
                message = "Try studying more";
                break;
            case "F":
                message = "Oh boy, try studying even more";
            default:
                message = "Error! Invalid grade";

        System.out.println("You had a grade of " + grade + "  " + message);
        }
    }
}
