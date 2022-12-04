package chapter10optional;

public class Banana extends Fruit{
    public Banana() {
        setCalories(233);
    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }
    public void peel(){
        System.out.println("The banana is peeled");
    }
}
