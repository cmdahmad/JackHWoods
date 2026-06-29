package Phase0;

//Name: AhmadMustafa
//Scope: Workout tracker for JackHWoods.
/*Brain Storm:
* Welcome to the JackHWoods Program!
* Here we have 6 movements only.
* vPUll: one arm pull up
* vPush: Handstand
* hPull: Front Lever
* hPush: Planche
* lPull: One leg squat
* lPush: Leg curl
* Each one has a level of beginner to experienced.
* The simple goal behind each of these movements is to first find your level
* Then operate on maximum capacity
* Each movement must be done once per week only.
* The purpose of the program is to track whether you have done the movement for the week.
* This is stemmed from a common issue of missing workouts.
* Another common issue is the transition from traditional gym to jackHwoods method.
* Another common issue is lack of belief.
* 
* === Vision Board ===
* Welcome
* Ask 6 questions:
* Did you do workout 1? sethPull; boolean status
* Did you do workout 2? sethPush; boolean status
* Did you do workout 3? setvPull; boolean status
* Did you do workout 4? setvPush; boolean status
* Did you do workout 5? setlPull; boolean status
* Did you do workout 6? setlPush; boolean status
* Thank you for sharing this with me, you have successfully completed all the workouts for the week!
* Thank you for sharing this with me, you have successfully completed 5/6 workouts this week.
* For the next week, let's focus on completing workout 6 also within the week. // NEEds more brainstorming
* == Example1 ==
* 1 yes
* 2 yes
* 3 yes
* 4 yes
* 5 yes
* 6 no
* My computer will check first boolean is yes ok
* all are ok
* number 6 is not ok
* That means they need a prompt for number 6
* Let's focus on completing number 6 also
* == Example2 ==
* 1 yes
* 2 yes
* 3 yes
* 4 yes
* 5 no
* 6 no
* My computer will check first boolean is yes ok
* all are ok
* number 5 is not ok
* number 6 is not ok
* prompt for number 5: let's focus on completing number 5 also
* prompt for number 6: let's focus on completing number 6 also
* === Example3 ===
* 1 yes
* 2 yes
* 3 no
* 4 yes
* 5 no
* 6 yes
* Number 1 is ok
* number 2 is ok
* number 3 is not ok
* number 4 is ok
* number 5 is not ok
* number 6 is ok
* prompt for number 3: let's focus on completing number 3 also
* prompt for number 5: let's focus on completing number 5 also
* === Implementation ===
* Implement "yes"
* Can use c.contains 'y'
* Done.
* == Next ==
* Implement Yes condition for all questions.
* 
* 
*
* */



import java.util.Scanner;
public class p33 {

    static String choice (String c) {
        System.out.println();
        //String will take an input which will be considered choice which will contain y or yest
        // that y or yes will be taken through an if statement
        // that if statement if it contains y will make it so the boolean is true
        // if it does not contain y it will make the boolean false
        // String c;
        // If (c.contains(y)) {
        //    vPull = true;
        // } else {
        // vPull = false
        // }

        return "GGs";
    }
    static void welcome() {
        Scanner input = new Scanner(System.in);

        //Beginning prompt
        System.out.println("Welcome to the JackHWoods Program!");
        System.out.println("Press any key to begin: ");
        String any = input.nextLine();
    }
    static boolean workout1() {
        Scanner input = new Scanner (System.in);

        //Vertical
        System.out.println("Did you do your (vPull) OneArmPullUp?");
        boolean vPull = false;
        String c = input.nextLine();
        if (c.contains("y") || c.contains("Y")) {
            vPull = true;
        }

        System.out.println("Did you do your (vPush) Handstand?");
        boolean vPush = false;
        c = input.nextLine();
        if (c.contains("y") || c.contains("Y")) {
            vPush = true;
        }
        boolean v = false;

        if (vPull == true) {
            if (vPush == true) {
                v = true;
            }
        }
        return v;
        }
    static boolean workout2() {
        Scanner input = new Scanner (System.in);

        //Horizontal
        System.out.println("Did you do your (hPull) FrontLever?");
        boolean hPull = false;
        String c = input.nextLine();
        if (c.contains("y") || c.contains("Y")) {
            hPull = true;
        }
        System.out.println("Did you do your (hPush) Planche?");
        boolean hPush = false;
        c = input.nextLine();
        if (c.contains("y") || c.contains("Y")) {
            hPush = true;
        }

        boolean v = false;
        if (hPull == true) {
            if (hPush == true) {
                v = true;
            }
        }
        return v;

    }
    static boolean workout3() {
        Scanner input = new Scanner (System.in);

        //Legs
        System.out.println("Did you do your (lPull) OneLegSquat?");
        boolean lPull = false;
        String c = input.nextLine();
        if (c.contains("y") || c.contains("Y")) {
            lPull = true;
        }
        System.out.println("Did you do your (lPush) LegCurl?");
        boolean lPush = false;
        c = input.nextLine();
        if (c.contains("y") || c.contains("Y")) {
            lPush = true;
        }

        boolean v = false;
        if (lPull == true) {
            if (lPush == true) {
                v = true;
            }
        }
        return v;
    }
    static void success() {
        System.out.println("Your workout for week1 has been recorded! Check back again next monday.");
    }
    static void checkWorkouts() {
        boolean v = workout1();
        boolean h = workout2();
        boolean l = workout3();
        if (v == true) {
            System.out.println("You completed workout 1.");
        } else {
            System.out.println("You missed workout 1");
        }

        if (h == true) {
            System.out.println("You completed workout 2.");
        } else {
            System.out.println("You missed workout 2");
        }

        if (l == true) {
            System.out.println("You completed workout 3.");
        } else {
            System.out.println("You missed workout 3");
        }
    }

    static void driver() {
        welcome();
        checkWorkouts();
        success();

    }
    public static void main (String[] args) {
        driver();
    }
}

// outcome we want is to record all the data.
// Once all the data has been recorded we want the program to assign the final results to a something that stores it
// We want to store the final result somewhere that is called week1.
// We also want to print the final result right away as: You completed workout1, 2 but you missed workout 3.

// Once we have stored week1 we want to ask a check in for week2.
//