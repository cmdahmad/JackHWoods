package Phase1.p3jack2;

//Name: Ahmad Mustafa
//Scope: Store information about how many workouts i completed in the whole month (4 weeks)
// Success.
// Extra: Run in terminal

import java.util.Scanner;
public class Main {

    public static void display(boolean[] week1) { // Method used to display the data. (Can be made more user friendly)
        boolean[] week = week1;
        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);
        }
    }

    public static void displayM(boolean[][] month1) {
        boolean [][] month = month1;
        int count = 1;

        for (int i = 0; i < month1.length; i++) {
            System.out.println("=== This is for Week " + count + ":  ===");
            count++;
            for (int j = 0; j < month1[i].length; j++) {
                System.out.println(month[i][j]);
            }
        }

    }

    public static void main(String[] args) { //Store data for 1 week.
        Scanner input = new Scanner(System.in);

        System.out.println("=== This is for Week 1:  ===");

        boolean [] week1 = new boolean[6];

        System.out.println("Did you do workout1?");
        week1[0] = input.nextBoolean();
        System.out.println("Did you do workout2?");
        week1[1] = input.nextBoolean();
        System.out.println("Did you do workout3?");
        week1[2] = input.nextBoolean();
        System.out.println("Did you do workout4?");
        week1[3] = input.nextBoolean();
        System.out.println("Did you do workout5?");
        week1[4] = input.nextBoolean();
        System.out.println("Did you do workout6?");
        week1[5] = input.nextBoolean();

        display(week1);

        System.out.println("=== This is for Week 2:  ===");

        boolean [] week2 = new boolean[6];

        System.out.println("Did you do workout1?");
        week2[0] = input.nextBoolean();
        System.out.println("Did you do workout2?");
        week2[1] = input.nextBoolean();
        System.out.println("Did you do workout3?");
        week2[2] = input.nextBoolean();
        System.out.println("Did you do workout4?");
        week2[3] = input.nextBoolean();
        System.out.println("Did you do workout5?");
        week2[4] = input.nextBoolean();
        System.out.println("Did you do workout6?");
        week2[5] = input.nextBoolean();

        display(week2);

        System.out.println("=== This is for Week 3: ===");

        boolean[] week3 = new boolean[6];

        System.out.println("Did you do workout 1?");
        week3 [0] = input.nextBoolean();
        System.out.println("Did you do workout 2?");
        week3 [1] = input.nextBoolean();
        System.out.println("Did you do workout 3?");
        week3 [2] = input.nextBoolean();
        System.out.println("Did you do workout 4?");
        week3 [3] = input.nextBoolean();
        System.out.println("Did you do workout 5?");
        week3 [4] = input.nextBoolean();
        System.out.println("Did you do workout 6?");
        week3 [5] = input.nextBoolean();

        display(week3);

        System.out.println("=== This is for Week 4:  ===");

        boolean [] week4 = new boolean[6];

        System.out.println("Did you do workout 1?");
        week4 [0] = input.nextBoolean();
        System.out.println("Did you do workout 2?");
        week4 [1] = input.nextBoolean();
        System.out.println("Did you do workout 3?");
        week4 [2] = input.nextBoolean();
        System.out.println("Did you do workout 4?");
        week4 [3] = input.nextBoolean();
        System.out.println("Did you do workout 5?");
        week4 [4] = input.nextBoolean();
        System.out.println("Did you do workout 6?");
        week4 [5] = input.nextBoolean();

        display(week4);

        boolean [][] month1 = {week1, week2, week3, week4};

        displayM(month1);
    }
}
/* Feedback:
week1
it took input for all 6 workouts
gave the prompt took input
displayed the correct results
week2 same
week3 prompt has a runtime error
week4 same as week3
Possible improvements: Display all the results together using nested loop
* */

