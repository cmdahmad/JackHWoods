package Phase2.p3;

//Name: Ahmad Mustafa
//Program: This program's purpose is to ask appropriate questions to figure out which project I want to do.

import java.util.ArrayList;
import java.util.Scanner;
public class p3 {

    public static Scanner input = new Scanner(System.in);
    public static void driver() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Good morning!");


        //Idea 1:
        System.out.println("Idea 1: ");
        System.out.println("What is your primary purpose for a project?");
        arr.add(input.nextLine());

        System.out.println("Based on what you wrote, what comes to mind?");
        arr.add(input.nextLine());

        System.out.println("How does this answer connect to the primary purpose?");
        arr.add(input.nextLine());

        int count = 0;
        for (int i = 2; i > count; i++) {
            System.out.println("Do you want to add another idea? 1 for Yes 0 for No");
            int k = input.nextInt();
            if (k == 0) {
                count = i+1;
            } else if (k == 1) {
                //Idea i:
                System.out.println("Idea " + i + ": ");
                System.out.println("What is your primary purpose for a project?");
                arr.add(input.nextLine());

                System.out.println("Based on what you wrote, what comes to mind?");
                arr.add(input.nextLine());

                System.out.println("How does this answer connect to the primary purpose?");
                arr.add(input.nextLine());
            }


        }

        arr.add("Good Night!");
        System.out.println(arr);

    }
    public static void main (String[] args) {
        driver();

    }

}

//Sample output
// [Good morning!,
// Make money,
// Making a project for my resume,
// This would open a door for me to apply for roles. Also would open the door for me to post on linkedin. Also would
// open the door for me to showcase my github]
// This is part of ideation. I am helping a client. The client is me. The client would have a better life after this.
//
// Sample Output 02:
// [Good morning!, Generate Revenue, What comes to mind is another question. What is the shortest path to generating
// lots and lots of revenue? Seriously. Tutoring is one idea. Another idea is to organise my projects and put them onto
// a resume. Another one is learning how to ship a project and start shippping projects. All of them are separate doors
// i can take. They all lead to a path which would talk time so let's start chipping towards all. Because why not ,
// Shortest path to generating revenue would be building a SaaS. This involves learning how to research a market and
// build a project and ship it quick. PaceTracker is one., Good Night!]
//
// .