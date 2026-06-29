package Phase1.p1;

import java.util.Scanner;

//Name: Ahmad Mustafa
//Scope: Learn to run terminal
// Instructions:
/* pwd to check where you are on the files
Step 1: Compile the java file. javac src/phase1/Main.java
Step2: cd src (change directory)
Step3: java phase1.Main
*
* */


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cal100, calpg, weight, total;


        System.out.println("How many calories in 100g of this item?");
        cal100 = input.nextInt();

        System.out.println("How many grams are you eating?");
        weight = input.nextInt();

        //For example. 100g of wheat has 200 calories. How many calories in 50g of wheat?
        // First, we find out how many calories per gram ( cal100 / 100 ) e.g. 200 / 100 = 2
        // then we multiply those by the number of grams we want to eat (weight) ( 2 * 50 ) = 100
        // Result = There are 100 calories in 50 grams of wheat.

        //Calculate:
        calpg = cal100 / 100;
        total = calpg * weight;

        System.out.println("The total calories you ate were: " + total);
    }


}