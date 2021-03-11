package chapter5;

import java.util.Scanner;

// Chapter 5b - Variable Scope
// Write an Instant credit check program that approves anyone who makes more
// than $25000 and has a credit score of 700 or better. Reject all others.

public class InstantCreditCheck {
    // Initialize what we know as global variables so the other methods can use them
    // Note this includes the scanner object.
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    // The main class should control program flow
    // It should not conduct any business logic
    public static void main(String[] args){

        // Get what we don't know
        double salary = getUserSalary();
        int creditScore = getUserCreditScore();
        scanner.close();

        // Check if user is qualified for a loan
        boolean isQualified = isUserQualified(salary, creditScore);

        // Notify User
        notifyUser(isQualified);
    }

    // A method can only return one value
    // This method get's the users salary and returns it to the main method
    public static double getUserSalary(){
        System.out.println("What is your salary?");
        double salary = scanner.nextDouble();
        return salary;
    }
    // This method get's the user credit score and returns it to the main method
    public static int getUserCreditScore(){
        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    // This method determines is the user is qualified.  We must pass it a salary and a credit score
    // It returns a true or false value for if the user is qualified.
    public static boolean isUserQualified(double salary, int creditScore){
        if(salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        } else {
            return false;
        }
    }

    // This method prints the user notification message
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats, you are qualified");
        } else{
            System.out.println("Sorry, you are not qualified");
        }
    }
}
