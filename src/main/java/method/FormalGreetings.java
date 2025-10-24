package method;

public class FormalGreetings extends Greetings {
    @Override
    public void greetUser(String name) {
        System.out.println("Good day, Mr/Ms " + name + "!");
    }
}
