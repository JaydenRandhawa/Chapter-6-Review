package chapter6Loops;

import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String revNum = inp.next();
        String numString = "";

        for(int i=revNum.length()-1;i>=0;i--){
            numString += revNum.charAt(i);
        }

        numString = "1" + numString;
        int num = Integer.parseInt(numString);

        while(num > 9){
            System.out.println(num%10);
            num /= 10;
        }
    }
}