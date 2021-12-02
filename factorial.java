/**
 * @author Jayden Randhawa
 * 01/12/2021
 * This program prompts the user for a number and then prints the factorial of that number.
 */

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int num = inp.nextInt();
        int product = 1;

        for(int i=num;i>0;i--){
            product = product*i;
        }

        System.out.println(product);
    }
}