package method;

import java.util.Scanner;

// import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        // sayHello("Alice");
        // sayGoodMorning("Bob");
        // sayGoodNight("Charlie");

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = scanner.next();
        // // greetUser(name);
        // String message = getGreeting(name);
        // System.out.println(message);
        // scanner.close();

        // completeGreeting("Diana");

        // greet();
        // greet("Eve");
        // greet("Frank", "Afternoon");
        // greet("Grace", "Evening", "Wonderland");

        int length = getGreetingLength("Hello, Henry! Welcome aboard.");
        System.out.println("The length of the greeting is: " + length);

        boolean isLong = isLongGreeting("Hello, this is a very long greeting message!");
        System.out.println("Is the greeting long? " + isLong);
    }

    /** ===== SIMPLE GREETINGS ===== */

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

    /** ===== PARAMETERIZED GREETINGS ====== */

    public static void greetUser(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    // get personalized greeting that returns a string
    public static String getGreeting(String name) {
        return "Hello, " + name + "! Welcome aboard.";
    }

    /** ===== METHOD CHAINING ===== */
    // Create methods like startGreeting() and endGreeting(), and call them from another method completeGreeting().
    public static void startGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void endGreeting(String name) {
        System.out.println("Have a great day, " + name + "!");
    }
    public static void completeGreeting(String name) {
        startGreeting(name);
        endGreeting(name);
    }

    /** ===== OVERLOADED METHODS ===== */
    // Write different versions of greet
    public static void greet() {
        System.out.println("Hello, Guest!");
    }
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static void greet(String name, String timeOfDay) {
        System.out.println("Good " + timeOfDay + ", " + name + "!");
    }
    public static void greet(String name, String timeOfDay, String location) {
        System.out.println("Good " + timeOfDay + ", " + name + "!");
        System.out.println("You are welcome to " + location + ".");
    }

    // a method(getGreetingLength) that returns an int
    public static int getGreetingLength(String greeting) {
        return greeting.length();
    }

    public static boolean isLongGreeting(String greeting) {
        return greeting.length() > 20;
    }


}
