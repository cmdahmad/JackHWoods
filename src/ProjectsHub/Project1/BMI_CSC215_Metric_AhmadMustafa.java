package ProjectsHub.Project1;

/**********************************************************************************************
 *
 * File: [BMI_CSC215_Metric_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [07/21/2026]
 *
 * Description: The purpose of this program is to calculate BMI using Centimeters for height and KGs for weight.
 *
 * ***********************************************************************************************/

import java.util.Date;
import java.util.Scanner;

public class BMI_CSC215_Metric_AhmadMustafa {
    public static String name, status;
    public static int heightF, heightI, height;
    public static double cur, low, high, BMI;
    public static Scanner input = new Scanner(System.in);

    // ANSI background colors (Highlighting)
    public static final String BG_YELLOW = "\u001B[43m";
    // Reset code to clear formatting
    public static final String RESET = "\u001B[0m";

    public static void dash(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void welcome() {
        dash(89);
        System.out.println("-- Welcome to:");
        System.out.println("--            BODY MASS INDEX (BMI) Computation, CSC 215, Metric Version");
        System.out.println("--                                                                   by Ahmad Mustafa");
        dash(89);
        System.out.println();
    }

    public static void inputs1() {
        System.out.print("Please enter your full name: ");
        name = input.nextLine();

        System.out.print("Please enter height in centimeters for "+ name+ ": ");
        height = input.nextInt();

        System.out.print("Please enter weight in kilograms for "+ name+ ": ");
        cur = input.nextDouble();

        report1();

        System.out.print("\nPlease enter a LOW weight in pounds for "+ name+ ": ");
        low = input.nextDouble();

        System.out.print("Please enter a HIGH weight in pounds for "+ name+ ": ");
        high = input.nextDouble();
        System.out.println();
    }

    public static double bmi (int height, double weight) {
        BMI = (weight / (height * height)) * 10000;// works (BMI Formula)
        return BMI;
    }
    public static String status(double bmi) {
        status = "Underweight";
        if (bmi > 30) {
            status = "Obese";
        } else if (bmi > 25) {
            status = "Overweight";
        } else if (bmi > 18.5) {
            status = "Healthy Weight";
        }
        return status;
    }

    public static void report1() {
        Date date = new Date();

        System.out.println("\n-- SUMMARY REPORT for " + name.toUpperCase());
        System.out.printf("-- Date and Time:      %tB %<td, %<tY at %<tI:%<tM:%<tS %<Tp%n", date);
        System.out.printf("-- BMI:                %.6f (or %.1f if rounded)", bmi(height, cur),BMI); //1.
        System.out.println("\n-- Weight Status:      " + status(BMI));

    }

    public static void print(double weight) {
        // Add if statements for low, high and current.
        // Fix spacing errors
        if (weight >= 100) {
            System.out.printf("\n|  %.2f    |", weight);
        } else {
            System.out.printf("\n|   %.2f    |", weight);
        }

        if (weight == low) { // Print (LOW)
            System.out.printf(" %.2f       | %s        ", bmi(height, weight), status(bmi(height, weight)));
            System.out.print(BG_YELLOW + "(LOW)" + RESET + " |");
        } else if (weight == cur) { // Print (this)
            if (bmi(height, weight) > 30) {
                System.out.printf(" %.5f    | %s (this)             |", bmi(height, weight), status(bmi(height, weight)));
            } else if (bmi(height, weight) > 25) {
                System.out.printf(" %.4f     | %s (this)        |", bmi(height, weight), status(bmi(height, weight)));
            } else if (bmi(height, weight) > 18.5) {
                System.out.printf(" %.3f      | %s (this)    |", bmi(height, weight), status(bmi(height, weight)));
            } else {
                System.out.printf(" %.2f       | %s (this)       |", bmi(height, weight), status(bmi(height, weight)));
            }
        } else if (weight == high) { //Print (HIGH)
                System.out.printf(" %.5f    | %s             ", bmi(height, weight), status(bmi(height, weight)));
                System.out.print(BG_YELLOW + "(HIGH)" + RESET + " |");

        } else { //all OK
            if (bmi(height, weight) > 30) {
                System.out.printf(" %.5f    | %s                    |", bmi(height, weight), status(bmi(height, weight)));
            } else if (bmi(height, weight) > 25) {
                System.out.printf(" %.4f     | %s               |", bmi(height, weight), status(bmi(height, weight)));
            } else if (bmi(height, weight) > 18.5) {
                System.out.printf(" %.3f      | %s           |", bmi(height, weight), status(bmi(height, weight)));
            } else {
                System.out.printf(" %.2f       | %s              |", bmi(height, weight), status(bmi(height, weight)));
            }

        }
        // System.out.print(BG_YELLOW + "(LOW)" + RESET + " |");
    }

    public static void indexReport() {

        int count = 0;
        //1d array
        // weight, BMI, status

        dash(55);
        System.out.println("| WEIGHT     " + "| BMI         " + "| WEIGHT STATUS            |");
        System.out.print("-------------------------------------------------------");

        for (double i = low; i < high; i += 2.5) {
            if (i > cur & count < 1) { //print current when weight exceeds count. Print current only once.
                print(cur);
                count++;
            }
            //print current starting from low.
            print(i);
        }
        print(high);
        System.out.println();
        dash(55);

        //for() {
        // Basically print starting from low
        // then add 5.5 to weight and keep going until you reach weight
        // then print weight
        // then keep going until you reach high
        // then print high

        // }
    }

    public static void goodbye() {
        System.out.println("\n\nThe SFSU Mashouf Wellness Center is at 755 Font Blvd.\n");

        dash(89);
        System.out.println("-- Thank you for using my program, " + name + "!");
        if (name.contains("oofy")) {
            System.out.println("-- Woof Woof!!!");
        } else {
            System.out.println("-- Sayonara!!!");
        }
        dash(89);

    }

    public static void driver() {
        welcome();
        inputs1();
        indexReport();
        goodbye();
    }
    public static void main(String[] args) {
        driver();
    }
}

// Otto Minion
// 205
// 105.7
// 71.23
// 130.32