package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog pepper = new Dog();
        pepper.makeSound();
        pepper.fetch();

        Cat garfield = new Cat();
        garfield.makeSound();
        garfield.scratch();

        Animal lance = new Dog();
        lance.makeSound();

        Animal snoopy = new Dog();
        snoopy.makeSound();
        snoopy = new Cat();
        snoopy.makeSound();
        ((Cat) snoopy).scratch();
    }
}
