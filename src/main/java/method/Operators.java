package method;

import java.util.Scanner;

/**
 * A coin counting game where users enter quantities of different coins to try to make exactly one dollar.
 * 
 * This program:
 * <ul>
 *   <li>Prompts the user to enter quantities of pennies, nickels, dimes, and quarters</li>
 *   <li>Calculates the total value of the coins in cents</li>
 *   <li>Determines if the total equals exactly one dollar ($1.00)</li>
 * </ul>
 * 
 * Coin values used:
 * <ul>
 *   <li>Penny: 1 cent ($0.01)</li>
 *   <li>Nickel: 5 cents ($0.05)</li>
 *   <li>Dime: 10 cents ($0.10)</li>
 *   <li>Quarter: 25 cents ($0.25)</li>
 * </ul>
 * 
 * Game outcomes:
 * <ul>
 *   <li>Win: Total equals exactly 100 cents ($1.00)</li>
 *   <li>Over: Total exceeds 100 cents (program shows excess amount)</li>
 *   <li>Under: Total is less than 100 cents (program shows deficit amount)</li>
 * </ul>
 * 
 * @author M-b-a-s
 * @version 1.0
 * @since 2025-11-06
 */

public class Operators {
    /**
     * The entry point of the coin counting game.
     * Handles user input and calculates whether the sum of coins equals one dollar.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int pennies, nickels, dimes, quarters, total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        pennies = scanner.nextInt();
        System.out.println("How many nickels would you like?");
        nickels = scanner.nextInt();
        System.out.println("How many dimes would you like?");
        dimes = scanner.nextInt();
        System.out.println("How many quarters would you like?");
        quarters = scanner.nextInt();
        // Convert each coin to cents
        total = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25);

        if(total == 100) {
            System.out.println("You won! That's exactly one dollar!");
        } else if(total > 100) {
            int over = total - 100;
            System.out.println("You went over by " + over + " cents. The total was $" + String.format("%.2f", total/100.0));
        } else {
            int under = 100 - total;
            System.out.println("You went under by " + under + " cents. The total was $" + String.format("%.2f", total/100.0));
        }


        scanner.close();
    }

}
