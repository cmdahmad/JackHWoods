package Phase0;

//Name: Ahmad Mustafa
//Scope: Solve a problem of laziness.
// Start with asking Questions:
// Do you feel problem 1? Yes
// Do you feel problem 2? Yes
// Do you feel problem 3? Yes
// In 80% of the cases according to the psychology department of SFSU, this is caused by a lack of vision.
// To solve this problem once and for all, we have created a program which helps you build and clarify your vision.
// This is the live implementation of that solution.
// -
// Step1: Identify the 10 year goal?
// Where do you see yourself in 10 years with this department? No answer no problem.
// What is the totally unreasonable big idea which would make this journey worth it?
// What is one goal which is totally unreasonable, but if you achieve it would totally change your life?
// What does the top of the mountain look like?
// What is such a big problem for you to solve that would be worth over $100bn?
// This would involve helping billionaires solve their problems?
// Write a list of muslim billionaires and ask yourself; what problems are they facing?
// It makes me very uncomfortable to write this out. Truly
// Zoom out.
// -
// Step2: What would the goal be for the first 5 years?
// Step3: What would be the goal for each year, starting with year 1?
// Step4: Establish the Why. Give me 100 reasons why this goal is worth sticking with for over 10 years.

/**Sample Case: 10 year vision of my relationship with the Quran. By the end, you must have a clear vision of
 * where you are with your quran journey. 2 aspects are memorisation and reflection. We combine that by calling
 * Quran our best friend. The 100 reasons why can all be sourced from the Quran itself.*/


import java.util.Scanner;
public class p31 {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        boolean dec;

        /* System.out.println("Does the idea of 'working' make you anxious?");
        dec = input.nextBoolean();
        System.out.println("Do you catch yourself procrastinating every time there is a problem?");
        dec = input.nextBoolean();
        System.out.println("Do you find it difficult to complete your daily tasks");
        dec = input.nextBoolean(); */

        System.out.println("If you said yes to all those, you lack vision. Here's a program that will help you create vision.");
        System.out.println("--");

        //q1
        System.out.println("What's the goal regarding (Fitness, Finance, Spirituality etc.)");
        String q1 = input.nextLine(); //This scanner not working why
        //q2
        System.out.println("What is it?");
        String q2 = input.nextLine();
        //q3
        System.out.println("What is the ultimate, unreasonable goal?");
        String q3 = input.nextLine();
        System.out.println("--- Input Complete --- Now give me 3 reasons why this goal matters to you.");

        System.out.println("Reason 1: ");
        String r0 = input.nextLine();
        System.out.println("Reason 2: ");
        String r2 = input.nextLine();
        System.out.println("Reason 3: ");
        String r3 = input.nextLine();

        System.out.println(q3);


    }
}
