package Phase0;

//Name: NPS Log
//Scope: Solve one problem I faced today at NPS.
//Notes: Did the CSC exam yesterday, huge burden lifted. Now my goal is to start working towards making a portfolio. I will start by writing
// random code and solving random problems until I find a purposeful project. My previous project was Alhamdulillah a success. Huge one.
// This new beginning must clear out new priorities, new set of skills. It's like day one once again. Do not despair, start over. This time
// with a stronger base. You need to start from ground zero because you are playing a different game now. There are 2 choice you can make from here
// one is to start with csc215 and 2 is to start with csc101. CSC101 sounds more fun because it challenges me to solve problems instead of learn code.
// CSC 215 is a mystery I should read. What I can do for today is just compile all the assignments in one place and read them.
// Let's see. Today, We will code nps log these are all ideas for tomorrow
// TLDR; save all csc215 asmts in one place and glance over them. See if it is something you want to do or not. Okay. understood.
// 57 lines to 54. Success. Changed repeated codes into methods.

import java.util.Scanner;
public class p23NPS1 {

    static void success() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the resident's apartment no.: ");
        int unit = input.nextInt();

        if (unit == 803) {
            System.out.println("Opening the vault now...");
            System.out.println("*The vault turns open.*");
            System.exit(404); // Code being repeated. What do you do when code is being repeated? You create a method. Easy solution.
        }
    }
    static void failure() {
        System.out.println("You entered the incorrect information. Please wait until the receptionist returns.");
        System.exit(404);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // you code so much faster when you have low responsibility lol... let's call farmers as well later.
        // Scenario. A resident comes to you, drops a key. Your job is to give the key to the resident's friend, who is coming while you will be on break.
        // Consider you have access to a system which will open the safe considering you enter the correct credentials.
        // Code a solution where the resident's friend can enter their details and access the key.

        System.out.println("Please enter your given name: "); //ok
        String name = input.nextLine(); //ok

        if (name.equals("Jamie")) {
            success();// Code being repeated. What do you do when code is being repeated? You create a method. Easy solution.
        }
        else if (name.equals("jamie")) {
            success();
        }
        failure();
    }
}
// Project Success. It works. barebones data. The only thing next I want to do is to reduce one line of code. Find more efficient ways, this would be beneficial to you as a coder.
// Next up: Try Asking name and unit number in succession. Then verify the details. Like user and pass. Then do the filtering.