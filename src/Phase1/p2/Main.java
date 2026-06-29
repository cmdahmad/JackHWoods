package Phase1.p2;

//Name: Ahmad Mustafa
//SCope: JackHWoods Program2. Store and Display.
// Take in the same information and store it in an array.
// 6 workouts hpull, hpush, vpull, vpush, lpull, l push
// Store the array then display the array.
// Take reference from the weight tracker sheet you used to build your first 6 pack abs.
// we have 6 workouts per week
// we have 4 weeks in a month.
// Store data for 1 month.
// Array Which is 2d.
// Rows = 1 (month)
// Columns = 6 (workouts)

// NextUP: Store data for 3 months


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean w1, w2, w3, w4, w5, w6;

        System.out.println("Did you do workout1?");
        w1 = input.nextBoolean();
        System.out.println("Did you do workout2?");
        w2 = input.nextBoolean();
        System.out.println("Did you do workout3?");
        w3 = input.nextBoolean();
        System.out.println("Did you do workout4?");
        w4 = input.nextBoolean();
        System.out.println("Did you do workout5?");
        w5 = input.nextBoolean();
        System.out.println("Did you do workout6?");
        w6 = input.nextBoolean();

        /* //Solution1
        System.out.print("|" + w1 + " |");
        System.out.print(w2 + " |");
        System.out.print(w3 + " |");
        System.out.print(w4 + " |");
        System.out.print(w5 + " |");
        System.out.print(w6 + " |");
        */

        //Solution2
        boolean[]  arr = {w1, w2, w3, w4, w5, w6};

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " |");
        }

        


    }
}
