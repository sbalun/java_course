package chapter9Optional;

public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake("chocolate", 20.21);

        System.out.println("The cake flavor is " + cake.getFlavor());
        System.out.println("The cake price is " + cake.getPrice());

        Cake cake1 = new Cake("strawberry");

        System.out.println("The default price of cake1 is " + cake1.getPrice());
        System.out.println("The flavor of cake1 is " + cake1.getFlavor());
        cake1.setPrice(20.52);
        System.out.println("The price of cake1 is now " + cake1.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake("coconut", 21.12, 5);

        System.out.println("The birthday cake flavor is " + birthdayCake.getFlavor());
        System.out.println("The birthday cake price is " + birthdayCake.getPrice());
        System.out.println("The birthday cake number of candles is " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake("red velvet", 39.99, 3);
        System.out.println("The wedding cake flavor is " + weddingCake.getFlavor());
        System.out.println("The wedding cake price is " + weddingCake.getPrice());
        System.out.println("The wedding cake number of tiers is " + weddingCake.getTier());
    }

}
