package chapter3;

import java.util.Scanner;

/*
Chapter 3f - Relational and Logical Operators
 */
public class LogicalOperatorLoanQualifier {

    public static void main(String[] args) {
        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Get What we don't
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How long have you worked at your current employer? ");
        double yearsOfEmployment = scanner.nextDouble();
        scanner.close();

        // Make decision
        if (salary >= requiredSalary && yearsOfEmployment >= requiredYearsEmployed) {
            System.out.println("Congratulations, you have qualified for a loan");
        } else if (salary >= requiredSalary && yearsOfEmployment < requiredYearsEmployed) {
                System.out.println("Sorry you must have worked at your current job "
                        + requiredYearsEmployed + " years.");
        } else {
            System.out.println("Sorry, you must earn at least " + requiredSalary + " to get the loan.");
        }
    }
}

