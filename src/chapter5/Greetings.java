package chapter5;

import java.util.Scanner;

// Chapter 5 Methods
// Write a method that asks a user for their name. then greets them by name.
public class Greetings {

    public static void main(String[] args){
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String userName){
        System.out.println("Hello, " + userName);
    }



}
