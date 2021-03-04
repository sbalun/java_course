package chapter4;

import java.util.Scanner;

/*
Chapter 4b - Do While Loops
Write a program that allows a user to enter two numbers then calculate the sum of the two numbers.
The user should be able to repeat this action until they indicate they are done
 */
public class AddNumbers {

    public static void main(String[] args){

        boolean runAgain;
        do{
            System.out.println("Enter in first number:");
            Scanner scanner = new Scanner(System.in);
            double firstNumber = scanner.nextInt();
            System.out.println("Enter second number:");
            double secondNumber = scanner.nextInt();
            double sum = firstNumber + secondNumber;
            System.out.println("The sum is " + sum);
            System.out.println("Would you like to add 2 more numbers? Enter True or False");
            runAgain = scanner.nextBoolean();
        } while (runAgain);
    }
}
