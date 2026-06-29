package Phase1.p5jack4;

//Name: Ahmad Mustafa
//Scope: Make the program actually useful now.
// Add counter, (You completed x amount of workouts this month)
// Add compareTo method, (You completed x more workouts compared to last month)
// NextUP: Rewrite the code to make it more cleaner. Make it realistic, check current month and week. Take weekly input.
// Possible solution: Check current date. Done. Based on this date, Make a control strucutre. (if)
// If date ranges between 0-7, Store in month1[0][]
// If date ranges between 7-14, Store in month1[1][]
// If date ranges between 14-21, Store in month1[2][]
// If date ranges 21+, Store in month1[3][]
// Alternatively, all data can be stored in a year array.
// Let's write down number of methods, function for each method and rewrite the code in a more efficient manner.
// 2 methods. Display method and main method.
// NextUP. 3 methods, display method, storage method, main method.
// DisplayM. StoreM. Main


import java.util.Scanner;
public class Main {

    public static void displayM(boolean[][] month1) {
        boolean [][] month = month1;
        int count1 = 1; //Week counter
        int count3 = 0; //Total workout counter for the month

        System.out.println("Final results for *This Month*"); // Results introduction line. Replace with current month.

        for (int i = 0; i < month1.length; i++) { //Array columns (Weeks)

            System.out.println("=== This is for Week " + count1 + ":  ===");
            count1++;
            int count2 = 1; //Weekly Workout counter

            for (int j = 0; j < month1[i].length; j++) { //Array rows (workouts)

                System.out.println(" Workout " + count2 + ": " + month[i][j]); //
                count2++;

                if (month1[i][j] == true) { //Workout counter
                    count3++;
                }
            }
        }
        System.out.println("You completed " + count3 + "/24 workouts this month. Great work!"); //Total workouts

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

