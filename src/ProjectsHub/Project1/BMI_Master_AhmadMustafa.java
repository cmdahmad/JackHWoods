package ProjectsHub.Project1;

/**********************************************************************************************
 *
 * File: [BMI_Master_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [07/21/2026]
 *
 * Description: The purpose of this program is to calculate BMI.
 *
 * ***********************************************************************************************/

import java.util.Scanner;

public class BMI_Master_AhmadMustafa {
    public static Scanner input = new Scanner(System.in);

    public static void driver() {
        String choice;

        System.out.println("My CSC 215 BMI Calculator Projects:");
        System.out.println("   1. BMI, English");
        System.out.println("   2. BMI, Metric");
        System.out.println();
        System.out.println("[ USER MANUAL ] Enter an exclamation mark ! to end.");

        for (int i = 1; i > 0; i++) { //Infinite loop
            System.out.println("Please enter the version you want to try: ");
            choice = input.nextLine().toLowerCase();

            if(choice.contains("!")){
                System.exit(404);
            } else if (choice.contains("sh")) {
                BMI_CSC215_English_AhmadMustafa.driver();
            } else {
                BMI_CSC215_Metric_AhmadMustafa.driver();
            }
        }
    }

    public static void main(String[] args) {
        driver();
    }
}
// Sample 1:
// enggg lishhh
