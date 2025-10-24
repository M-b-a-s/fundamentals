package method;

// import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        sayHello("Alice");
        sayGoodMorning("Bob");
        sayGoodNight("Charlie");
    }

    // say hello
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // say goodmorning
    public static void sayGoodMorning(String name) {
        System.out.println("Good Morning, " + name + "!");
    }

    // say goodnight
    public static void sayGoodNight(String name) {
        System.out.println("Good Night, " + name + "!");
    }


    
}
