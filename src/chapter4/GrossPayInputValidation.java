package chapter4;

import java.util.Scanner;
/*
Chapter 4 While Loops
Each store employee makes $15/hr.  Write a program that allows the employee
to enter the number of hours worked for a week.  Do not allow overtime (hours > 40)
or a negative number of hours.
 */
public class GrossPayInputValidation {

    public static void main(String [] args){
        //Initialize known variables
        int rate = 15;
        int maxHours = 40;
        int minimumHours = 0;

        //Get Input from unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate the input making sure hours > 0 and <= 40
        while (hoursWorked > maxHours || hoursWorked < minimumHours){
            System.out.println("Invalid entry. Total hours must be a value between 1 and 40.  Try Again.");
            System.out.println("How many hours did you work this week?");
            // This is the sentinel.  Without it this loop would run infinitely
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
    }
}
