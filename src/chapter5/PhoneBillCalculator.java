package chapter5;

// Chapter 5 - Optional Exercise
// Calculate the final total of a cell phone bill.
// Allow the user to put in the plan fee and the number of overage minutes
// Charge the user 0.25 for every minute they were over their plan
// Charge 15% tax on the subtotal
// Create separate methods to calculate the tax, overage fees, and final total.
// Print the itemized bill

import java.util.Scanner;

public class PhoneBillCalculator {

    private static double overageRate = .25;
    private static double taxRate = .15;
    private static double planFee = 0.00;
    private static int overageMinutes = 0;
    public static double subTotal = 0.00;

    // Main method
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your plan fee? ");
        planFee = scanner.nextDouble();

        System.out.println("How many overage minutes do you have? ");
        overageMinutes = scanner.nextInt();
        scanner.close();
        System.out.println(printBill());
    }

    // calculateTax method
    public static double calculateTax(){
        return planFee * taxRate;
    }

    // calculateOverageFees method
    public static double calculateOverageFees(){
        return overageMinutes * overageRate;
    }

    // getBillTotal method
    public static double getTotalBill(){
        return planFee + calculateOverageFees() + calculateTax();
    }

    // printBill method
    public static String printBill(){
        return "Your total bill is $" + getTotalBill() + "\n"
        + "Your plan fee is $" + planFee  + "\n"
        + "You have " + overageMinutes + "overage minutes" + "\n"
        + "Your tax is $" + calculateTax() + "\n"
        + "Your overage fee is $" + calculateOverageFees();
    }
}
