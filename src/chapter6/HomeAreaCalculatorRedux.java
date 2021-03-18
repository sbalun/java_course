package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedux {

    Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        // In order to get access to the getRoom method which is not static we
        // have to instantiate an instance of HomeAreaCalculator Class
        // Every class has a built in default constructor even if you don't implicitly define one
        HomeAreaCalculatorRedux calculator = new HomeAreaCalculatorRedux();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double totalArea = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("the total area is " + totalArea);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("What is the width?");
        double width = scanner.nextDouble();
        System.out.println("What is the length?");
        double length = scanner.nextDouble();

        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();

    }
}
