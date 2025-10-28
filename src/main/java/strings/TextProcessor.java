package strings;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("Hey! My name is Ernest");
        reverseString("Hello World");
        countVowels("Hey! My name is Ernest");
        isPalindrome("racecar");
        longestWord("Hello world, from the fundamentals project");
        charFrequency("Hello World");
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

    /**
     * Counts the number of vowels in a given string and prints the count.
     * @param s The string to be analyzed
     */
    private static void countVowels(String s) {
        int count = 0; // Initialize a counter for vowels
        for (int i = 0; i < s.length(); i++) { // Iterate through each character in the string
            char c = Character.toLowerCase(s.charAt(i)); // Convert character to lowercase for uniformity
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++; // Increment the counter if a vowel is found
            }
        }
        System.out.println("Number of vowels: " + count); // Print the total count of vowels
    }

    /**
     * Checks if a given string is a palindrome and prints the result.
     * @param s The string to be checked
     */
    private static void isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString(); // Reverse the string using StringBuilder
        boolean isPalindrome = s.equals(reversed); // Check if the original string is equal to the reversed string
        System.out.println("Is palindrome: " + isPalindrome); // Print the result 
    }

    /**
     * Finds and prints the longest word in a given string.
     * @param s The string to be analyzed
     */
    private static void longestWord(String s) {
        String[] words = s.split(" "); // Split the string into words based on spaces
        String longest = ""; // Initialize a variable to hold the longest word

        for (String word : words) { // Iterate through each word in the array
            if (word.length() > longest.length()) { // Check if the current word is longer than the longest found so far
                longest = word; // Update the longest word if the current word is longer
            }
        }
        System.out.println("Longest word: " + longest); // Print the longest word found
    }

    /**
     * Calculates and prints the frequency of each character in a given string.
     * @param s The string to be analyzed
     */
    private static void charFrequency(String s) {
        int[] charCount = new int[256]; // Initialize an array to store character frequencies
        for (int i = 0; i < s.length(); i++) { // Iterate through each character in the string
            char c = s.charAt(i); // Get the current character
            charCount[c]++; // Increment the count for this character
        }
        System.out.println("Character frequencies:"); // Print header
        for (int i = 0; i < charCount.length; i++) { // Iterate through each character
            if (charCount[i] > 0) { // Check if the character appeared in the string
                System.out.println((char) i + ": " + charCount[i]); // Print the character and its frequency
            }
        }
    }

}
