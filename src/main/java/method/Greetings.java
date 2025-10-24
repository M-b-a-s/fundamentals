package method;

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

        // int length = getGreetingLength("Hello, Henry! Welcome aboard.");
        // System.out.println("The length of the greeting is: " + length);

        // boolean isLong = isLongGreeting("Hello, this is a very long greeting message!");
        // System.out.println("Is the greeting long? " + isLong);

        // String timeBasedGreeting = getGreetingBasedOnTime(10);
        // System.out.println(timeBasedGreeting);

        // Greetings greeter = new Greetings();
        // System.out.println(greeter.getGreetingCount());

        Greetings greeter = new Greetings();
        System.out.println(greeter.getRandomGreeting());
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

    public void greetUser(String name) {
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

    /** ===== TIME-BASED GREETING ===== */
    // Write getGreetingBasedOnTime() that returns: “Good morning” if before 12:00 “Good afternoon” if 12–17 “Good evening” if after 17:00

    public static String getGreetingBasedOnTime(int hour) {
        if (hour < 12) {
            return "Good morning";
        } else if (hour <= 17) {
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }

    /** ===== GREETING STATISTICS ====== */
    //Add a field private int greetingCount;
    private int greetingCount = 0;
    // incrementGreetingCount()
    public void incrementGreetingCount() {
        greetingCount++;
    }

    // getGreetingCount()
    public int getGreetingCount() {
        return greetingCount;
    }

    // resetGreetingCount()
    public void resetGreetingCount() {
        greetingCount = 0;
    }


    /* ===== STATIC VS INSTANCE METHODS */
    // Static methods belong to the class and can be called without creating an instance of the class.
    // Instance methods belong to an instance of the class and require an object to be created before they can be called.

    // Make some methods static (generalGreeting()), others instance-based (personalGreeting()).
    public static void generalGreeting() {
        System.out.println("Hello, everyone!");
    }
    public void personalGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    /** ===== RANDOM GREETING GENERATOR ===== */
    // Store 5 greetings in an array or ArrayList.
    private String[] greetings = {"Hello, everyone!", "Good morning, everyone!", "Good afternoon, everyone!", "Good evening, everyone!", "Good night, everyone!"};
    // Create a method getRandomGreeting() that picks one randomly.
    public String getRandomGreeting() {
        int index = (int) (Math.random() * greetings.length);
        return greetings[index];
    }

    /** ===== GROUP SETTINGS ===== */
    // Write greetGroup(String[] names) to greet each name in a loop.
    public static void greetGroup(String[] names) {
        for (String name : names) {
            System.out.println("Hello, " + name + "!");
        }
    }

    // Create greeting method to be used in the GreetingsManager class
    public void createGreeting(String message) {
        System.out.println("Greeting created: " + message);
        incrementGreetingCount();
    }

}
