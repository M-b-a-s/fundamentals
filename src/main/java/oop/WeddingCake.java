package oop;

public class WeddingCake extends Cake {
    private String tiers;

    public WeddingCake() {
        super();
    }

    public WeddingCake(String flavor, String tiers) {
        super(flavor);
        this.tiers = tiers;
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }


}
