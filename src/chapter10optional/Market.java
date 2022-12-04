package chapter10optional;

public class Market {

    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit banana = new Banana();
        System.out.println("This apple has " + apple.getCalories() + " calories");
        System.out.println("This banana has " + banana.getCalories() + " calories");
        banana.makeJuice();
        ((Apple) apple).removeSeeds();
        ((Banana) banana).peel();
    }
}
