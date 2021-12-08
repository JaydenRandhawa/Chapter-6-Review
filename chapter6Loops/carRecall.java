/**
 * @author Jayden Randhawa
 * 7/12/2021
 * This program takes the model of a vehicle and outputs whether or not it is safe.
 */

package chapter6Loops;
import java.util.Scanner;
public class carRecall {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int model = inp.nextInt();

        if(model == 119 || model == 179 || model == 221 || model == 780 || model >= 189 && model <= 198) System.out.println("NOT Safe.");
        else System.out.println("Safe.");
    }
}