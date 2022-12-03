package chapter10;

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
