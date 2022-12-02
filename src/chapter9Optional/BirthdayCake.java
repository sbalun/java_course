package chapter9Optional;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(String flavor, double price, int candles) {
        super(flavor, price);
        this.candles = candles;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
