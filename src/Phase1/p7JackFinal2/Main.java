package Phase1.p7JackFinal2;

//Name: Ahmad Mustafa
//Scope: Store and display weekly workouts.

import java.util.Scanner;
public class Main {

    public static void displayM(boolean[][] month1) { //This method fetches data and displays it.
        int c1=1, totalC=0;

        for (int i = 0; i < month1.length; i++) {
            System.out.println("--- Week " + c1 + ":  ---");
            c1++;
            for (int j = 0; j < month1[i].length; j++) {//workout
                int c2=1;
                System.out.println("Workout " + c2 + ": "+ month1[i][j]);
                c2++;
                if(month1[i][j] == true) {
                    totalC++;
                }
            }
        }
        System.out.println("You completed "+ totalC + "/24 workouts this month. Great Work!");
    }
    public static boolean[][] week(boolean [][] month, int c) { //This method allows user to input then store for the week.
        Scanner input = new Scanner(System.in);
        int w = c; // w is displayed week number
        c--; //c is week number in array directory.

        System.out.println("--- Week " + w + ": ---");
        System.out.println("Did you complete workout 1?");
        month[c][0] = input.nextBoolean();
        System.out.println("Did you complete workout 2?");
        month[c][1] = input.nextBoolean();
        System.out.println("Did you complete workout 3?");
        month[c][2] = input.nextBoolean();
        System.out.println("Did you complete workout 4?");
        month[c][3] = input.nextBoolean();
        System.out.println("Did you complete workout 5?");
        month[c][4] = input.nextBoolean();
        System.out.println("Did you complete workout 6?");
        month[c][5] = input.nextBoolean();

        return month;
    }

    public static boolean [][] storeN () {
        Scanner input = new Scanner(System.in);
        boolean [][] month1 = new boolean[4][6];
        week(month1, 1); // receive data for week1
        week(month1, 2); // receive data for week2
        week(month1, 3); // receive data for week3
        week(month1, 4); // receive data for week4
        return month1;
    }

    public static void main(String[] args) { //1 statement. displayM(StoreM)
        displayM(storeN());
    }
}
