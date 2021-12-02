package chapter6pt2;

import java.util.Scanner;

public class accountSetup {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String username = inp.nextLine();
        String pass = inp.nextLine();

        while(pass.length() < 8){
            pass = inp.nextLine();
        }

        username = username.toLowerCase();
        pass = pass.toLowerCase();

        System.out.print("Your username is ");
        System.out.print(username);
        System.out.print(" and your password is ");
        System.out.print(pass);
        System.out.println(".");
    }
}
