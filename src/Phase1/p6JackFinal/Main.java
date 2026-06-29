package Phase1.p6JackFinal;

import java.util.Scanner;
public class Main {

    public static void displayM(boolean[][] month1) {// Nested loop to display each value. Display each week individually. Count total trues out of 24.
        boolean [][] month = month1;
        int c1=1, c2=1, totalC=0;

        for (int i = 0; i < month.length; i++) { //week
            System.out.println("--- Week " + c1 + ":  ---");
            c1++;
            for (int j = 0; j < month[i].length; j++) { //workout
                System.out.println("Workout " + c2 + ": "+ month1[i][j]);
                c2++;
                if(month[i][j] == true) {
                    totalC++;
                }
            }
        }
        System.out.println("You completed "+ totalC + "/24 workouts this month. Great Work!");
    }
    public static boolean[][] week(boolean [][] month, int c) {
        Scanner input = new Scanner(System.in);
        boolean [][] month1 = month;
        c++;
        // Might need to import the month array then export the month array.
        // Function is to ask for the whole weeks workouts and store in the month array.
        // Repeatable things are:
        // Print statement(did you complete workout 1-6?) x6
        // monthArray = input.nextBoolean(); x6

        //month1 is the data for current instance. this.month
        //month is the final static month record.
        System.out.println("Week 1: ");
        System.out.println("Did you complete workout 1?");
        month1[c][0] = input.nextBoolean();
        System.out.println("Did you complete workout 2?");
        month1[c][1] = input.nextBoolean();
        System.out.println("Did you complete workout 3?");
        month1[c][2] = input.nextBoolean();
        System.out.println("Did you complete workout 4?");
        month1[c][3] = input.nextBoolean();
        System.out.println("Did you complete workout 5?");
        month1[c][4] = input.nextBoolean();
        System.out.println("Did you complete workout 6?");
        month1[c][5] = input.nextBoolean();

        month = month1;

        return month;
    }

    public static boolean[][] storeM () { //Create 2d array. Weeks * workouts. Ask for input and assign boolean value.
        Scanner input = new Scanner(System.in);
        boolean [][] month1 = new boolean[4][6];

        //I want this method to look like this:
         // week (1)
         // week (2)
         // week (3)
         // week (4)

        System.out.println("Week 1: ");
        System.out.println("Did you complete workout 1?");
        month1[0][0] = input.nextBoolean();
        System.out.println("Did you complete workout 2?");
        month1[0][1] = input.nextBoolean();
        System.out.println("Did you complete workout 3?");
        month1[0][2] = input.nextBoolean();
        System.out.println("Did you complete workout 4?");
        month1[0][3] = input.nextBoolean();
        System.out.println("Did you complete workout 5?");
        month1[0][4] = input.nextBoolean();
        System.out.println("Did you complete workout 6?");
        month1[0][5] = input.nextBoolean();

        System.out.println("Week 2: ");
        System.out.println("Did you complete workout 1?");
        month1[1][0] = input.nextBoolean();
        System.out.println("Did you complete workout 2?");
        month1[1][1] = input.nextBoolean();
        System.out.println("Did you complete workout 3?");
        month1[1][2] = input.nextBoolean();
        System.out.println("Did you complete workout 4?");
        month1[1][3] = input.nextBoolean();
        System.out.println("Did you complete workout 5?");
        month1[1][4] = input.nextBoolean();
        System.out.println("Did you complete workout 6?");
        month1[1][5] = input.nextBoolean();

        System.out.println("Week 3: ");
        System.out.println("Did you complete workout 1?");
        month1[2][0] = input.nextBoolean();
        System.out.println("Did you complete workout 2?");
        month1[2][1] = input.nextBoolean();
        System.out.println("Did you complete workout 3?");
        month1[2][2] = input.nextBoolean();
        System.out.println("Did you complete workout 4?");
        month1[2][3] = input.nextBoolean();
        System.out.println("Did you complete workout 5?");
        month1[2][4] = input.nextBoolean();
        System.out.println("Did you complete workout 6?");
        month1[2][5] = input.nextBoolean();

        System.out.println("Week 4: ");
        System.out.println("Did you complete workout 1?");
        month1[3][0] = input.nextBoolean();
        System.out.println("Did you complete workout 2?");
        month1[3][1] = input.nextBoolean();
        System.out.println("Did you complete workout 3?");
        month1[3][2] = input.nextBoolean();
        System.out.println("Did you complete workout 4?");
        month1[3][3] = input.nextBoolean();
        System.out.println("Did you complete workout 5?");
        month1[3][4] = input.nextBoolean();
        System.out.println("Did you complete workout 6?");
        month1[3][5] = input.nextBoolean();

        return month1;
    }

    public static void main(String[] args) { //1 statement. displayM(StoreM)
        displayM(storeM());
    }
}
