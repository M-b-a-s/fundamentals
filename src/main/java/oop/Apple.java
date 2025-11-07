package oop;

public class Apple extends Fruit {

    public Apple() {
        super();
    }
    
    public void removeSeeds() {
        System.out.println("Remove seeds");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }

}
