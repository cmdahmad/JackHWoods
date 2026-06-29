
package Phase0;

import java.util.Scanner;

public class p15PercentageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double current, full, percentage;

        System.out.println("Input your marks, total marks");
        current = input.nextDouble();
        full = input.nextDouble();

        //formula: e.g. 42/50 * 100. Current / Full * 100.

        percentage = (current / full) * 100;

        System.out.println("You got " + percentage + "%");

        //96.75% for asmt 6
        //85.9% for asmt 4 7 marks less
        //85.9% for asmt 3 7 marks less
        //81.5% for asmt2 6.5 marks less

    }
}
