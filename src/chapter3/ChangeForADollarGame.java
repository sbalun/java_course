package chapter3;

import java.util.Scanner;
import static java.lang.Math.abs;

/*
Chapter 3f Optional Exercise - Change for a Dollar Game
- The objective of the game is to enter enough change to equal exactly $1.
    Create a program that asks a user to enter the quantities of pennies, nickels,
    dimes, and quarters.
- The program should add up the values of all the change.
    - If it's exactly $1, you win.
    - If it's more than $1 the program should tell the user by how much they went over.
    - If it's less than $1 the program should tell the user by how much they are under.
 */
public class ChangeForADollarGame {

    public static void main(String [] args){

        // Initialize what we know
        double dollar = 1.00;
        double pennies = .01;
        double nickels = .05;
        double dimes = .10;
        double quarters = .25;
        double totalValueOfEnteredCoins;
        double differenceAmount;
        int numberOfPennies;
        int numberOfNickels;
        int numberOfDimes;
        int numberOfQuarters;

        System.out.println("Welcome to the change for a dollar game!");

        // Get number of Pennies.  Add them to total value
        System.out.println("How many pennies do you have? ");
        Scanner scanner = new Scanner(System.in);
        numberOfPennies = scanner.nextInt();
        totalValueOfEnteredCoins = numberOfPennies * pennies;

        // Get number of Nickels.  Add them to total value
        System.out.println("How many nickels do you have? ");
        numberOfNickels = scanner.nextInt();
        totalValueOfEnteredCoins = totalValueOfEnteredCoins + (numberOfNickels * nickels);

        // Get number of Dimes.  Add them to total value
        System.out.println("How many dimes do you have? ");
        numberOfDimes = scanner.nextInt();
        totalValueOfEnteredCoins = totalValueOfEnteredCoins + (numberOfDimes * dimes);

        // Get number of Quarters.  Add them to total value
        System.out.println("How many quarters do you have? ");
        numberOfQuarters = scanner.nextInt();
        totalValueOfEnteredCoins = totalValueOfEnteredCoins + (numberOfQuarters * quarters);

        // Compare the total value to the maximum allowed value of one dollar
        if (totalValueOfEnteredCoins == dollar){
            System.out.println("Congratulations! You win!");
        }
        else if (totalValueOfEnteredCoins < dollar){
            differenceAmount = dollar - totalValueOfEnteredCoins;
            System.out.println("You entered $" + String.format("%.2f", abs(differenceAmount)) + " less than $1.00");
        }
        else if (totalValueOfEnteredCoins > dollar){
            differenceAmount = dollar - totalValueOfEnteredCoins;
            System.out.println("You entered $" + String.format("%.2f", abs(differenceAmount)) + " more than $1.00");
        }
    }
}
