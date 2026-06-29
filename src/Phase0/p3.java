package Phase0;

import java.util.Scanner;
public class p3 {

    //Name: Ahmad Mustafa
    //Scope: Create a coffee price calculator for Peet's coffee
    //Conclusion: Learned size.contains technique for string if statements.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for coffee size
        System.out.print("Welcome to Peet's! Coffee");
        System.out.println();
        System.out.print("What's the size of your coffee? (S | M | L): ");
        String size = input.next();

        // Calculate price from size
        int price = 0;
        if (size.contains("S")) {
            price = 5;
        } else if (size.contains("M")) {
            price = 6;
        } else if (size.contains("L")) {
            price = 7;
        }
        //Print the total bill and greeting!
        System.out.println();
        System.out.print("Thank you for ordering at Peet's! Your total is $" + price);
    }
}
