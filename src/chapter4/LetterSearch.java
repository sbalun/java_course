package chapter4;

import java.util.Scanner;

/*
Chapter 4c - Loop Break
Search a String to determine if it contains the letter 'A'
 */
public class LetterSearch {

    public static void main(String [] args){

        //Get Text
        System.out.println("Enter some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        // Search for the letter A
        for (int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter =='A' || currentLetter == 'a'){
                System.out.println("Found it!");
                break;
            }
        }
    }
}
