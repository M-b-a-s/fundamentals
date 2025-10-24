package method;

public class GreetingsManager {

    /**Create a class GreetingManager that uses your Greetings class.
     * Let it handle:
     * Creating multiple greetings
     * Counting total greetings
     * Printing summary reports */

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        greetings.createGreeting("Hello");
        greetings.createGreeting("Hi");
        greetings.createGreeting("Hey");
        greetings.createGreeting("Hola");
        System.out.println("Total greetings created: " + greetings.getGreetingCount());

        //Create a subclass FormalGreetings that overrides greetPerson(String name) to say “Good day, Mr/Ms [name].
        FormalGreetings formalGreetings = new FormalGreetings();
        formalGreetings.greetUser("Smith");
}
}