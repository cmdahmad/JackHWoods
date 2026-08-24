package Phase0;
//Name: Ahmad Mustafa
//Scope: Create a weight kg to lbs and also a temp c to f converter
// Implementation: ask the user whether he wants a weight converter or a temp converter then run that method.
// Next: Play with it a little more. Complete this project. (2) tasks below.
// Also: Find out how to use scanner baskets for chars if I want to use the == operator.
// Explore Math.round().
// Also main method contains one statement only.
// Test: TF check, tC check. WK check, WP check. Small and big letters work. check complete bare bones work.
// Next up: Loop the whole code done
// Main method contains only one statement.
// Big K and small k works. All letters work. big and small.
// Check input.nextChar == requires input.next().c.charAt(0) -- No need to memorize yet. There are alternative ways.


/* Debug log:
Created weight calc with the name of tempCalc and vice versa lol.
Corrected Weight conversion formula for 2.02 to 2.202
*
*  */
import java.util.Scanner;
public class p22WeightTempConverter {

    // WeightChoice is choice b/w Lbs and KGs.
    static void weightChoice() {

        Scanner input = new Scanner(System.in);
        System.out.print("Press 'L' to enter weight in Lbs. Or 'K' to enter weight in Kgs: ");
        String c = input.nextLine();

        if (c.contains("K")) { // If user chooses KG.
            weightCalc(); // Run the KG to LBS method.
        } else if (c.contains("k")) { //small letter.
            weightCalc();
        }
        else if (c.contains("L")) { // If user chooses LBs.
            weightCalcR(); // Run the LBS to KG method.
        } else if (c.contains("l")) {
            weightCalcR();
        }

    }
    static void weightCalc() { // asks for kgs gives pounds.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in KG's: ");
        double weightKg = input.nextDouble(); //KG input.

        double weightLbs = weightKg * 2.202;// Conversion formula
        weightLbs = Math.round(weightLbs * 100.00) / 100.00; // Round to 2 decimal places. Multiple by a 100, then divide by a hundo.
        System.out.print("Your weight in lbs is: " + weightLbs);
    }

    static void weightCalcR() { //asks for Lbs gives KG
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in Lbs: ");
        double weightLbs = input.nextDouble(); //Lbs input

        double weightKg = weightLbs / 2.202; // Conversion formula
        weightKg = Math.round(weightKg * 100.00) / 100.00;
        System.out.println("Your weight in Kgs is: " + weightKg); //Print final weight.

    }
    static void tempChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Press F to enter temp. in Fahrenheit. Or Press C to enter temp in Celsius.");
        String c = input.nextLine();

        if (c.contains("F")) {
            tempCalcR();
        } else if (c.contains("f")) {
            tempCalcR();
        }
        else if(c.contains("C")) {
            tempCalc();
        } else if(c.contains("c")) {
            tempCalc();
        }

    }
    static void tempCalcR() {
        Scanner input = new Scanner(System.in);
        double tempF, tempC;

        System.out.print("Enter the temperature in Fahrenheit(ºF) ");
        tempF = input.nextDouble();

        tempC = (tempF - 32) * 0.55555556;
                // F = C*9/5 + 35
                // F - 35 = C * 9/5
                // (F - 35) (5 / 9) = C
        tempC = Math.round(tempC * 100.00) / 100.00;
        System.out.println("Your temperature in Celsius is: " + tempC + "ºC");


    } // Ask for F and give in C.
    static void tempCalc(){ //Asks for celsius gives fahrenheit. Next: do vice versa as well

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your temperature in Celcius(ºC) ");
        double tempC = input.nextDouble(); // celsius input

        double tempF = (tempC * 9 / 5) + 32; //formula

        tempF = Math.round(tempF * 100.00) / 100.00; // round to 2 decimals.
        System.out.println("Your temperature in Fahrenheit is: " + tempF + "ªF"); //Print

    }

    public static void driver() {
        Scanner input = new Scanner(System.in);

        // Start with if statement
        // make an int that automatically runs the code part of the if statement.
        // If the user enters 0 then run the part where it exits the code.
        int j = 1; // Variable decides whether code runs or not.

            for(int i = 1; i > 0; i++ ) {
                if (j > 0) {
                    System.out.println("Welcome to the Conversion center homie."); // Run this in a loop. ask user if he wants to re-run or exit.
                    System.out.print("Press T to convert Temperature. OR Press W to convert Weight.");

                    // change to char
                    String c = input.next();

                    //Check compareTo method


                    if (c.equals("T")) { // == operator does not work with strings. Have to use .equals method which is a boolean.
                        tempChoice();
                    } else if (c.equals("t")) {
                        tempChoice();
                    }
                    else if (c.equals("W")) {
                        weightChoice(); // Choice between LB and KG method.
                    } else if (c.equals("w")) {
                        weightChoice();
                    }
                    System.out.println();
                    System.out.println("Press 0 to exit the code. Or Press 1 to measure again."); // Loop or no?
                    j = input.nextInt(); // j=0 if statement doesn't work.
                }
                System.exit(404);
        }
    }
    public static void main(String[] args) {
        driver();
    }
}
// Code runs successfully. Loops successfully. Measures successfully.