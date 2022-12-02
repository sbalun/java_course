package chapter9Optional;

public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public Cake(String flavor) {
        this.flavor = flavor;
        price = 99.99;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
