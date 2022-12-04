package chapter11a;

/*-
*-------------------------*
|  Abstraction Key Points |
* ------------------------*
     - Templates
        - Abstract classes and methods are templates that are meant to be implemented by their subclasses
     - Reserved Word
        - Classes and methods are declared abstract by using the abstract key word
     - Implementation required on inheritance
        - If a subclass extends from an abstract class it must implement its abstract methods or be declared abstract itself.
     - Abstract Classes
        - Can not be instantiated
        - Only to be used as a superclass
        - If even one method in a class is abstract the class must be declared abstract
 */

public abstract class Shape {

    abstract double calculateArea();

    public void print (){
        System.out.println("I am a shape");
    }

}
