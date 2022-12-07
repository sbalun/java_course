package chapter11optional;

public class Farm {

    public static void main(String[] args) {

        Animal porky = new Pig();
        porky.makeSound();
        porky.eat();

        Animal daffy = new Duck();
        daffy.makeSound();
        daffy.eat();
    }
}
