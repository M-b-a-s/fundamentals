package method;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreetingsTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("getGreeting should return formatted personalized greeting")
    void testGetGreeting() {
        String result = Greetings.getGreeting("Alice");
        assertEquals("Hello, Alice! Welcome aboard.", result);
    }

    @Test
    @DisplayName("getGreetingLength should return the string length")
    void testGetGreetingLength() {
        int len = Greetings.getGreetingLength("Hello, Henry! Welcome aboard.");
        assertEquals("Hello, Henry! Welcome aboard.".length(), len);
    }

    @Test
    @DisplayName("isLongGreeting should detect long strings (>20)")
    void testIsLongGreeting() {
        assertTrue(Greetings.isLongGreeting("This greeting is definitely long enough."));
        assertFalse(Greetings.isLongGreeting("Short greeting"));
    }

    @Test
    @DisplayName("getGreetingBasedOnTime should return morning/afternoon/evening")
    void testGetGreetingBasedOnTime() {
        assertEquals("Good morning", Greetings.getGreetingBasedOnTime(0));
        assertEquals("Good morning", Greetings.getGreetingBasedOnTime(11));
        assertEquals("Good afternoon", Greetings.getGreetingBasedOnTime(12));
        assertEquals("Good afternoon", Greetings.getGreetingBasedOnTime(17));
        assertEquals("Good evening", Greetings.getGreetingBasedOnTime(18));
    }

    @Test
    @DisplayName("completeGreeting should call start and end greeting in order")
    void testCompleteGreetingPrintsBothLines() {
        Greetings.completeGreeting("Bob");
        String output = outContent.toString().trim();
        String[] lines = output.split(System.lineSeparator());
        assertEquals(2, lines.length);
        assertEquals("Hello, Bob!", lines[0]);
        assertEquals("Have a great day, Bob!", lines[1]);
    }

    @Test
    @DisplayName("overloaded greet methods should print expected outputs")
    void testGreetOverloads() {
        Greetings.greet();
        Greetings.greet("Eve");
        Greetings.greet("Frank", "Afternoon");
        Greetings.greet("Grace", "Evening", "Wonderland");
        String[] lines = outContent.toString().trim().split(System.lineSeparator());
        assertEquals("Hello, Guest!", lines[0]);
        assertEquals("Hello, Eve!", lines[1]);
        assertEquals("Good Afternoon, Frank!", lines[2]);
        assertEquals("Good Evening, Grace!", lines[3]);
        assertEquals("You are welcome to Wonderland.", lines[4]);
    }

    @Test
    @DisplayName("greetGroup should greet each name in the array")
    void testGreetGroup() {
        String[] names = {"Ana", "Ben", "Cara"};
        Greetings.greetGroup(names);
        String[] lines = outContent.toString().trim().split(System.lineSeparator());
        assertArrayEquals(new String[]{
            "Hello, Ana!",
            "Hello, Ben!",
            "Hello, Cara!"
        }, lines);
    }

    @Test
    @DisplayName("greetingCount should increment and reset correctly")
    void testGreetingCountIncrementAndReset() {
        Greetings g = new Greetings();
        assertEquals(0, g.getGreetingCount());
        g.incrementGreetingCount();
        g.incrementGreetingCount();
        assertEquals(2, g.getGreetingCount());
        g.resetGreetingCount();
        assertEquals(0, g.getGreetingCount());
    }

    @Test
    @DisplayName("generalGreeting and personalGreeting should print expected outputs")
    void testGeneralAndPersonalGreeting() {
        Greetings.generalGreeting();
        Greetings g = new Greetings();
        g.personalGreeting("Zoe");
        String[] lines = outContent.toString().trim().split(System.lineSeparator());
        assertEquals("Hello, everyone!", lines[0]);
        assertEquals("Hello, Zoe!", lines[1]);
    }

    @Test
    @DisplayName("getRandomGreeting should return one of the predefined greetings and be reasonably distributed")
    void testGetRandomGreeting() {
        Greetings g = new Greetings();
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            String s = g.getRandomGreeting();
            assertNotNull(s);
            assertFalse(s.isBlank());
            seen.add(s);
        }
        // Expect to see at least 3 different greetings in 200 trials
        assertTrue(seen.size() >= 3, "Expected to see at least 3 distinct greetings but saw: " + seen.size());
    }
}
