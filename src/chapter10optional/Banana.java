package chapter10optional;

public class Banana extends Fruit{
    public Banana(int calories) {
        super(calories);
    }
    public void peel(){
        System.out.println("The banana is peeled");
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }
}
