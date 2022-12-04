package chapter10optional;

public class Apple extends Fruit {
    public Apple() {
        setCalories(125);
    }
    public void removeSeeds(){
        System.out.println("The seeds are gone");
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }
}
