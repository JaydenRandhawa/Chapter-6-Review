package chapter6Loops;
import java.util.Scanner;

public class necklace {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sequenceCount = inp.nextInt();

        for(int i=0; i<sequenceCount;i++){

            int num1 = inp.nextInt();
            int num2 = inp.nextInt();
            
            int pos0;
            int pos1 = num1;
            int pos2 = num2;

            System.out.print(num1 + " " + num2 + " ");

            pos0 = pos1%10;
            pos1 = pos2%10;
            pos2 = pos0 + pos1;
            System.out.print(pos2%10 + " ");

            while(!(pos1 == num1 && pos2 == num2)){
                pos0 = pos1%10;
                pos1 = pos2%10;
                pos2 = pos0 + pos1;
                System.out.print(pos2%10 + " ");
            }

        }
    }
}