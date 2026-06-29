package Phase0;

import java.util.Scanner;

public class p2 {

    // Program name: Poopy plant
    // Author name: Ahmad Mustafa
    // Program scope: Initialise an array of poopy plants and print them. fyi plants are lovely.
    // I learned: Multi step array contain the type 2 times in the same line
    // the number in the multi step approach bracket is the length
    // the number in the multi step approach bracket is NOT the last array value
    // A string needs to be in double quotation marks to be initialised.
    // Gear 1 going well. WE are ramping up. Alhamdulillah.

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        String[] plant = new String[3];

        plant [0] = "Poopy plant 1";
        plant [1] = "Poopy plant 2";
        plant [2] = "Poopy plant 3";

        // Print all

        for (int i = 0; i < 3; i++) {
            System.out.print(plant[i]);
            System.out.println();
        }

    }
}
