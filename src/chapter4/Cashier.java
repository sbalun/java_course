package chapter4;

/*
Chapter 4c - For Loop
Write a program that takes a number of items and askes the user the cost of those items.
Sum the total cost of the items.  Print the total cost to the screen.
 */
import java.util.Scanner;

public class Cashier {

    public static void main(String [] args){
        // Get number of items to scan
        System.out.println("Enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        // Create loop to iterate through all of the items and accumulate the costs
        for(int i = 0; i < quantity; i++){
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        System.out.println("Your total is $" + total);
    }
}
