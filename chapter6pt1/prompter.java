package chapter6pt1;
/**
 * @author Jayden Randhawa
 * 01/12/2021
 * This program prompts the user for a lower limit and higher limit number then asks for a user to enter a number until the number they enter is between the lower and higher limit.
 */

 import java.util.Scanner;

 public class Prompter{
     public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);

         System.out.print("Please enter a lower bound: ");
         int lb = inp.nextInt();
         System.out.print("\nPlease enter an upper bound: ");
         int ub = inp.nextInt();

         System.out.print("\nPlease enter a number between ");
         System.out.print(lb);
         System.out.print(" and ");
         System.out.print(ub);
         System.out.print(": ");

         int num = inp.nextInt();

         while(!(num > lb && num <ub)){
            System.out.print("\nPlease enter a number between ");
            System.out.print(lb);
            System.out.print(" and ");
            System.out.print(ub);
            System.out.print(": ");
   
            num = inp.nextInt();
         }
     }
 }