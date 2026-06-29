package Phase1.p4jack3;

//Name: Ahmad Mustafa
//Scope: Store in a more efficient way. One solution i can think of right now is to tackle the problem in a 2d array
// and store directly instead of making individual weeks.
//NextUp: Make the data entry repeatable?
// Make the display useful. Find Shilajit. Charge apple watch.

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
        int count1 = 1;

        for (int i = 0; i < month1.length; i++) {
            System.out.println("=== This is for Week " + count1 + ":  ===");
            count1++;
            int count2 = 1;
            for (int j = 0; j < month1[i].length; j++) {
                System.out.println(" Workout " + count2 + ": " + month[i][j]);
                count2++;
            }
        }

    }

    public static void main(String[] args) { //Store data for 1 week.
        Scanner input = new Scanner(System.in);

        boolean [][] month1 = new boolean[4][6];

        System.out.println("=== This is for Week 1:  ===");

        boolean [] week1 = new boolean[6];

        System.out.println("Did you do workout1?");
        month1[0][0] = input.nextBoolean();
        System.out.println("Did you do workout2?");
        month1[0][1] = input.nextBoolean();
        System.out.println("Did you do workout3?");
        month1[0][2] = input.nextBoolean();
        System.out.println("Did you do workout4?");
        month1[0][3] = input.nextBoolean();
        System.out.println("Did you do workout5?");
        month1[0][4] = input.nextBoolean();
        System.out.println("Did you do workout6?");
        month1[0][5] = input.nextBoolean();

        System.out.println("=== This is for Week 2:  ===");

        boolean [] week2 = new boolean[6];

        System.out.println("Did you do workout1?");
        month1[1][0] = input.nextBoolean();
        System.out.println("Did you do workout2?");
        month1[1][1] = input.nextBoolean();
        System.out.println("Did you do workout3?");
        month1[1][2] = input.nextBoolean();
        System.out.println("Did you do workout4?");
        month1[1][3] = input.nextBoolean();
        System.out.println("Did you do workout5?");
        month1[1][4] = input.nextBoolean();
        System.out.println("Did you do workout6?");
        month1[1][5] = input.nextBoolean();

        System.out.println("=== This is for Week 3: ===");

        boolean[] week3 = new boolean[6];

        System.out.println("Did you do workout 1?");
        month1[2][0] = input.nextBoolean();
        System.out.println("Did you do workout 2?");
        month1[2][1] = input.nextBoolean();
        System.out.println("Did you do workout 3?");
        month1 [2][2] = input.nextBoolean();
        System.out.println("Did you do workout 4?");
        month1 [2][3] = input.nextBoolean();
        System.out.println("Did you do workout 5?");
        month1 [2][4] = input.nextBoolean();
        System.out.println("Did you do workout 6?");
        month1 [2][5] = input.nextBoolean();

        System.out.println("=== This is for Week 4:  ===");

        boolean [] week4 = new boolean[6];

        System.out.println("Did you do workout 1?");
        month1 [3][0] = input.nextBoolean();
        System.out.println("Did you do workout 2?");
        month1 [3][1] = input.nextBoolean();
        System.out.println("Did you do workout 3?");
        month1 [3][2] = input.nextBoolean();
        System.out.println("Did you do workout 4?");
        month1 [3][3] = input.nextBoolean();
        System.out.println("Did you do workout 5?");
        month1 [3][4] = input.nextBoolean();
        System.out.println("Did you do workout 6?");
        month1 [3][5] = input.nextBoolean();

        //Basically boolean month1 stores as

        displayM(month1);
    }
}
