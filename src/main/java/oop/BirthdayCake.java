package oop;

public class BirthdayCake extends Cake {
    private String candles;

    public BirthdayCake() {
        super();
    }
    public BirthdayCake(String flavor, String candles) {
        super(flavor);
        this.candles = candles;
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }

}