/**
 * @author Jayden Randhawa
 * 01/12/2021
 * This program prompts the user for a list of test scores and calculates the percentage of scores that were over 70%.
 */

import java.util.Scanner;

public class percentPassing {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a score from 0 to 100(enter -1 when all scores are entered)");
        int score = inp.nextInt();

        int sc = 0;
        int psc = 0;

        while(score != -1){
            sc += 1;
            if(score > 70) psc += 1;
            System.out.print("Enter a score from 0 to 100(enter -1 when all scores are entered)");
            score = inp.nextInt();
        }

        System.out.print((int)((double)psc/sc*100+0.5));
        System.out.println("% of scores were above 70%");
    }
    
}