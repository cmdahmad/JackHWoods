package Phase0;

//Name: Ahmad Mustafa
//Scope: Create a verification lock using 2d arrays.
//Implementation: 1 2dArray

import java.util.Scanner;

public class P27NPS5 {

    static void success() { //Method for when credentials are correct
        System.out.println("*The Vault Bolts Open*");
        System.exit(401);
    }

    static void failure(){ //Method for when credentials are incorrect.
        System.out.println("You entered incorrect credentials. Please wait for the receptionist to return.");
    }

    static void driver2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the given name: ");
        String name = input.nextLine();
        System.out.println("Enter the resident's unit number: ");
        String unit = input.nextLine();

        //String[][] names2 = new String[3][2];

        String [][] names2 = { {"Jamie", "EightOThree"},
                               {"Suzie", "EightOFour"},
                               {"Miley", "EightOFive"},
                {"jamie", "EightOThree"},
                {"suzie", "EightOFour"},
                {"miley", "EightOFive"}};

        //The 2d array works although you would need to create objects now to have proper implementation. Instead of
        // passing numbers as strings.
        //Verify and match
        /* [0][0]
        [0][1]
        [1][0]
        [1][1]
        [2][0]
        [2][1]
        These are all pairs I have to match
        Maybe nested loops are required.
        Let's try now*/

        // if name and number matches success, else failure
        for(int i = 0; i < names2.length; i++) {
            if(name.equals(names2[i][0])){
                if(unit.equals(names2[i][1])){
                    success();
                }
            }
        }
        failure();

    }
    public static void main(String[] args) {
        driver2();
    }
}

//Code success with 2d arrays.
// Next up: create objects of guests
// They must have attributes such as Name, unit
// They must have these attributes upon initiation. Meaning guests cannot be entered into the system without a name and unit.