package chapter10;
/*
*-------------------------*
| Polymorphism Key Points |
*-------------------------*

    - Type vs Instance
    An object can have a superclass type, Animal, and a subclass instance, dog

    - Access
    Polymorphic objects can only access the methods of their type (not their instance).  Casing is
    required in order to access the method of their instance

    - Overridden Methods
    If a method is overidden by the subclass, the polymorphic object will execute the overridden method at runtime

    - InstanceOf Operator
    The instanceof operator is used to determine if an object is an instance of a certain class
 */
public class Zoo {
    public static void main(String[] args) {

        Dog pepper = new Dog();
        pepper.makeSound();
        pepper.fetch();
        feed(pepper);

        Cat garfield = new Cat();
        garfield.makeSound();
        garfield.scratch();

        // Superclass is Animal. Instantiate as Dog
        Animal lance = new Dog();
        lance.makeSound();

        Animal snoopy = new Dog();
        snoopy.makeSound();
        snoopy = new Cat();
        snoopy.makeSound();
        ((Cat)snoopy).scratch();
        feed(snoopy);
    }

    public static void feed (Animal animal){
        // Find out what the subclass is by doing a check with instaneof
        // whatever is on the left, i.e., animal, instanceof will check to see if it is of subclass, Dog
        // returns boolean value
        if(animal instanceof Dog){
            System.out.println("here is your dog food");
        }else if(animal instanceof Cat){
            System.out.println("here is your cat food");
        }
    }
}
