package strings;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("Hey! My name is Ernest");
        reverseString("Hello World");
    }

    /**
     * Splits a string into an array by tokenizing it.
     * Count words and prints them
     * @param text Full string to be split
     */
    private static void countWords(String text) {
        var words = text.split(" "); // Split the text into words based on spaces
        int numberOfWords = words.length; // Get the number of words

        String message = String.format("Number of words: %d", numberOfWords); // Format the message

        System.out.println(message); // Print the message

        // Print each word in the string
        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Reverses a given string and prints it.
     * @param string The string to be reversed
     */
    private static void reverseString(String string) {
        String reversed = new StringBuilder(string).reverse().toString(); // Reverse the string using StringBuilder
        System.out.println(reversed); // Print the reversed string

    }
}
