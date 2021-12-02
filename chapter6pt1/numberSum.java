package chapter6pt1;
/**
 * @author Jayden Randhawa
 * 01/12/2021
 * This program prompts the user for a number then prints all number from 1 to that number.
 */

import java.util.Scanner;

public class numberSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        int sum = 0;
    
        for(int i=1;i<num+1;i++){
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }
}