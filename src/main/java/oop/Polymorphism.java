package oop;
/**
 * Polymorphism is the ability of an object to take on many forms.
 * Polymorphism in Java is a feature that allows objects of different classes to be treated as objects of a common superclass.
 * This allows for greater flexibility and reusability of code.
 */ 

public class Polymorphism {
    public static void main(String[] args) {
        // Apple apple = new Apple();
        // apple.removeSeeds();
        // apple.makeJuice();

        Fruit fruit = new Banana();
        fruit.makeJuice();
        
        fruit = new Apple();
        fruit.makeJuice();
        ((Apple) fruit).removeSeeds();
    }
}
