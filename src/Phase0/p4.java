package Phase0;

import java.util.Scanner;
public class p4 {

    //Name: Ahmad Mustafa
    //Scope: Input email and pass. Then output email and pass but in stars.
    //Learned: pass.length() method. Previously i learned .contains() method. Nice.
    //Next up: Code a something with an array initialised using shorthand notation.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Input your email: ");
        String email = input.next();

        System.out.print("Input your password: ");
        String pass = input.next();

        System.out.println();
        System.out.println("Your email is: " + email);
        System.out.print("Your password is: ");
        for (int i = 0; i < pass.length(); i++) {
            System.out.print("*");
        }
    }


}
