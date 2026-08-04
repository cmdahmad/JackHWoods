package Phase1.p8;

import java.util.Scanner;

/**
 *  Name: Ahmad Mustafa
 *  Date: 08/04/2026
 *  Purpose: The purpose behind this program is to track daily water intake.
 *
 *
 * */

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static double oz, ml;

    public static double oz() {
        System.out.println("Enter oz");
        oz = input.nextDouble();

        ml = oz * 29.5735; // formula oz to ml

        System.out.printf("%.3f/2000ml", ml);
        return ml;
    }

    public static double ml() {
        System.out.println("Enter ml");
        ml = input.nextDouble();

        oz = ml / 29.5735; // formula ml to oz

        System.out.printf("%.3f/68oz", oz);
        return oz;
    }

    public static void dailyWater() {
        System.out.println("Your daily water intake is 2L or 68 Oz");
    }

    public static void driver() {
        int choice;
        System.out.println("1 for oz 2 for ml");
        choice = input.nextInt();

        if (choice == 1) {
            oz();
        } else {
            ml();
        }

    }

    public static void main(String[] args) {
        driver();
    }
}

