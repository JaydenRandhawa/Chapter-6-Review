package chapter6Loops;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        for (int i = 2; i <= num/2; ++i) {
          if (num % i == 0) {
            System.out.println("NO");
            System.exit(0);
          }
        }
          System.out.println("YES");
    }
}
