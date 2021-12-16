/**
 * @author Jayden Randhawa
 * 7/12/2021
 * This program generates a number between 1 and 20 then takes inputs from the user until they enter the randomly generated number.
 */

package chapter6Loops;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        long seed = inp.nextLong();
        int guess;
        
        Random rand = new Random(seed);

        int number = rand.nextInt(20)+1;

        do guess = inp.nextInt();
        while(guess != number);

        System.out.println("WINNER");
    }
}