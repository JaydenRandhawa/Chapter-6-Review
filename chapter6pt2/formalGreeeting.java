package chapter6pt2;

import java.util.Scanner;

public class formalGreeeting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String name = inp.nextLine();
        if(name.startsWith("Mr.")){
            System.out.println("Hello, sir.");
        }
        else if(name.startsWith("Ms.") || name.startsWith("Mrs.")){
            System.out.println("Hello, Ma'am.");
        }
        else{
            System.out.print("Hello, ");
            System.out.print(name);
            System.out.println(".");
        }
    }
}