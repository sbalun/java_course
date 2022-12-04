package chapter11b;

/*-
*-------------------------*
|  Interface Key Points |
* ------------------------*
    - Not for Instantiation
       - Interfaces can not be instantiated
    - Implement
       - Interfaces are implemented (not extended)
    - Abstract if not Implemented
       - Any class that implements an interface must implement all of its methods or it must declare itself abstract
    - Abstract Methods
       - Methods in an interface must be abstract (no explicit declaration needed) or default
 */

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

}
