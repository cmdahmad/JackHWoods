import java.util.Scanner;
public class p32 {

    //Name: Ahmad Mustafa
    //Scope: Fitness GPT. Make working out easier and trackable. Workout tracker

    public static void driver() {
        Scanner input = new Scanner(System.in);

        int exercise; //Num of exercises
        String name; // Name of exercise
        int sets, set1, set2, set3; //Num of sets for the exercise. Assume 3.
        int reps, reps1, reps2, reps3; //Reps assigned to each set. E.g. set1 has 12 reps.
        int weight, w1 , w2, w3; //Weight assigned to each set. E.g. set1 has 20kg
        //displayInfo(): You did Lat pulldowns for 12, 9, 8 reps at 25, 22.5, 20 kg

        System.out.println("What's the name of the exercise?");
        name = input.nextLine();

        System.out.println("How many sets did you do?");
        sets = input.nextInt();

        System.out.println("What was the weight of set1?");
        w1 = input.nextInt();

        System.out.println("What was the weight of set2?");
        w2 = input.nextInt();

        System.out.println("What was the weight of set3?");
        w3 = input.nextInt();

        System.out.println("What was the reps of set1?");
        reps1 = input.nextInt();

        System.out.println("What was the reps of set2?");
        reps2 = input.nextInt();

        System.out.println("What was the reps of set3?");
        reps3 = input.nextInt();

        System.out.println(""+ name +": for (" + reps1 + ", " + reps2 + ", " + reps3 +" reps) at ("+ w1 + ", " + w2 + ", " + w3 + "kg)");

        //NextUP: Assign all of these to an object

    }
    public static void main(String [] args) {

        driver();

        //Problem: Inconsistency with working out. Confused what to do.
        // Solution: Ask about number or Exercises. Then name of exercise. Then number of sets. Then reps of sets. then wright of sets.
        // Now we have tracked a whole workout.
    }
}
