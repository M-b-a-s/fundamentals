package oop;

public class Banana extends Fruit{

    // constructor
    public Banana() {
        super("100 calories");
    }

    public void peel() {
        System.out.println("Banana is peeled");
    }


    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }

}
