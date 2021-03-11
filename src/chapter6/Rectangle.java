package chapter6;

public class Rectangle {

    // Global variables or fields
    // private - no other class outside of this class can access the private variables

    // Encapsulation says that fields should be private and the methods used to get and set those fields should be public
    private double length;
    private double width;

    // The Constructor
    // What is it? A constructor is used to assign default values to fields
    // They are for Initializing an object.  Setting it's state.
    // You can have as many constructor as you want.  But all must have same name as the class.
    // For multiple constructors, they have to have different parameters they accept.
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length; // can be set this way
        setWidth(width); // or can be set this way.  This is to demonstrate different ways to acheive this.
    }

    // Perimeter of a rectangle method
    public double calculatePerimeter(){
        return (length + width) * 2;
    }

    // Area of a rectangle method
    public double calculateArea(){
        return length * width;
    }

    // Get or set length
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    // Get and set width
    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }


}
