package chapter11a;

public class ShapeTester {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12,11);
        rectangle.print();
        System.out.println("The area of the rectangle is " + rectangle.calculateArea());
    }
}
