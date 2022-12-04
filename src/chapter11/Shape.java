package chapter11;

/*-
*--------------*
|  Abstraction |
* -------------*
     - This reserved word is a non-access modifier that can be used on classes and methods.
     - Used when you want to define a template for a class or a method, but do not intend for it to be used as is.
     - Not designed to be instantiated.  Meant to be extended.  Subclass must implement.
     - Serves as a template
*------------------*
|  Abstract Method |
* -----------------*
     - Has no body.  Only signature is defined.
     - Not to be run as is
     - Meant to be overridden by a sub class
 */

public abstract class Shape {

    abstract double calculateArea();

}
