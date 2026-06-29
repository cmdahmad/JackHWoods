package Phase0.P30NPS10;

//Name: Ahmad Mustafa
// Scope: Organise NPS project

import java.util.Scanner;

public class P31NPS10 {

    public static void pray(String output) {
        System.out.println("Ya Allah, please grant me " + output);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your ambition in life?");
        String output = input.nextLine();

        System.out.println("You answered: " + output);
        pray(output);
    }
}
