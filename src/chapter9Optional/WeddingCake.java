package chapter9Optional;

public class WeddingCake extends Cake{
    private int tier;

    public WeddingCake(String flavor, double price, int tier) {
        super(flavor, price);
        this.tier = tier;
    }

    public WeddingCake(String flavor) {
        super(flavor);
        tier = 99;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
