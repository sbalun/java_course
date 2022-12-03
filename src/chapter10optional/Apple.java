package chapter10optional;

public class Apple extends Fruit {
    public Apple(int calories) {
        super(calories);
    }
    public void removeSeeds(){
        System.out.println("Seeds have been removed");
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }
}
