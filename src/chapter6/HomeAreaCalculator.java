package chapter6;


// Chapter 6b - Instantiating Objects
// Write a class that creates instances of the Rectangle class to
// find the total area of as many rooms in a house as a user wants to measure

import java.util.Scanner;

public class HomeAreaCalculator {

    static Scanner scanner = new Scanner(System.in);
    static double totalArea = 0;

    public static void main(String [] args){

        System.out.println("I'm the Home Area Calculator.  How many rooms would you like to measure?");
        double numberOfRooms = scanner.nextDouble();

        for(int counter = 0; counter < numberOfRooms; counter++){

            int roomNumber = counter + 1;
            System.out.println("What is the length of room " + roomNumber);
            double roomLength = scanner.nextDouble();

            System.out.println("What is the width of room " + roomNumber);
            double roomWidth = scanner.nextDouble();

            Rectangle room = new Rectangle(roomLength,roomWidth);
            double roomArea = room.calculateArea();
            System.out.println("Room " + roomNumber + " is " + room.getLength() + "ft in length, and " + room.getWidth() + "ft wide");

            totalArea = totalArea + roomArea;
            System.out.println("The total area is currently " + totalArea + "sq ft");
        }
        System.out.println("The total area of the " + numberOfRooms + " rooms is " + totalArea);
    }
}
