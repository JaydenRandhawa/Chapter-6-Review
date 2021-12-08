/**
 * @author Jayden Randhawa
 * 7/12/2021
 * This program prints a table of the numbers 1-5 to the exponents 1-5.
 */

package chapter6Loops;

public class powersTable {
    public static void main(String[] args) {
        System.out.printf("%8s%8s%8s%8s%8s\n", "x^1", "x^2", "x^3", "x^4", "x^5");
        for(int i=1;i<=5;i++){
            System.out.printf("%8s%8s%8s%8s%8s\n", (int)Math.pow(i, 1), (int)Math.pow(i, 2), (int)Math.pow(i, 3), (int)Math.pow(i, 4), (int)Math.pow(i, 5));
        }
    }
}