package chapter4;

import java.util.Random;
import java.util.Scanner;

/*
Chapter 4 - Optional Independent Exercise, Roll the Die Game
Objective: Travel the entire board of 20 spaces within 5 die rolls
- Roll die for the user (generate a random number between 1 and 6) and advance the user that number of spaces on game board.
- After each roll tell the user which game space they are on and how many more spaces to go to win
- Repeat this 4 additional times for 5 rolls in total
- If the user gets 20 before 5 rolls, end the game - they won
- If the user is greater than or less than 20 spaces, they lose
 */
public class RollTheDie {

    public static void main(String[] args){
        // What we Know
        int maxBoardSpaces = 20;
        int maxNumberOfRolls = 5;
        int userMovedCount = 0;
        //boolean timeToBreak = false;
        Scanner scanner = new Scanner(System.in);

        for(int rollNumber = 1; rollNumber <= maxNumberOfRolls; rollNumber++){
            // Generate a random number
            Random random = new Random();
            // Add +1 to get a random number from 1 to 6 inclusive
            int dieValue = random.nextInt(6) + 1;
            userMovedCount = userMovedCount + dieValue;
            System.out.print("Roll #" + rollNumber + ": You've rolled a " + dieValue);
            System.out.print(". You are now on space " + userMovedCount);
            if((maxBoardSpaces - userMovedCount) > 0){
                System.out.println(" and have " + (maxBoardSpaces - userMovedCount) + " more to go.");
            }
            if(userMovedCount == maxBoardSpaces){
                System.out.print('\n' + "Congratulations, you win!");
                break;
            }
        }
        if(userMovedCount != maxBoardSpaces){
        System.out.println('\n' + "Sorry, you lose!");
        }
    }
}
