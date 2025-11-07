package oop;

public class Coin {

    // a field called side
    protected String side;

    // encapsulation
    public Coin() {
        side = "heads";
    }

    // constant variables for heads and tails
    public static final String HEADS = "heads";
    public static final String TAILS = "tails";

    // a method called flip that randomly chooses heads or tails and assigns the value to the side field
    public void flip() {
        int flip = (int) (Math.random() * 2);
        if (flip == 0) {
            side = HEADS;
        } else {
            side = TAILS;
        }
    }

 
}
