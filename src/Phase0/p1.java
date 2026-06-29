package Phase0;

// I did it!!
// I learned to start with gear 1, regardless of experience, im a beginner for a few days
// Next up: Make p2, add something to the code. Another question.

import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask and record name
        System.out.println("What's your name?");
        String name = input.nextLine();

        //Skip 2 lines
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
        // print statement
        System.out.print("No, that is not your name.");

        //Skip 3 lines
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
        System.out.print("Your name is: " + "poopy "  + name + " poopy");

        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
}