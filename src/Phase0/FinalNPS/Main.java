package Phase0.FinalNPS;

import java.util.Scanner;
public class Main {

    static void success() {// method if bill succeeds. Final version.
        System.out.println("*The vault bolts open!*");
        System.exit(404);
    }
    static void failure() {// method if bill fail. Final version
        System.out.println("Incorrect details, please wait for the receptionist to return.");
        System.exit(404);
    }
    static Guest setGuest() { // Ask reed for guest name and unit. Beta version
        Scanner input = new Scanner(System.in);

        String unit, name;

        System.out.println("Hi Reed, please Set the secret key: "); //Back end asking reed to set
        name = input.nextLine();

        System.out.println("Hi Reed, please Set the unit number: "); //back end asking reed to set his creddiz
        unit = input.nextLine();

        Guest guest1 = new Guest(name, unit);

        // System.out.println(guest1); // Successfully set the guest. Now assign this to guest5.
        return guest1;


    }
    static Guest[] data () { // User data storage. Beta version.

        Guest guest1 = new Guest("Jamie", "803");
        Guest guest2 = new Guest("Suzie", "804");
        Guest guest3 = new Guest("Miley", "805");
        Guest guest4 = new Guest("Celine", "806");
        Guest guest5 = setGuest();

        Guest[] guests = {guest1, guest2, guest3, guest4, guest5};
        return guests;
    }
    static void frontEnd() { // Asking user to input data. Then validating the data. 2 actions (Creates confusion). Beta version
        Scanner input = new Scanner(System.in);
        Guest[] guests = data();//import guest Data

        String name, unit;

        System.out.println("Enter secret key: "); //Front end asking to validate
        name = input.nextLine();

        System.out.println("Enter unit: "); //Front end asking Bill to validate his creddiz
        unit = input.nextLine();

        //Validate\
        for(int i = 0; i < guests.length; i++) {
            if (name.equals(guests[i].name)) {
                if (unit.equals(guests[i].unit)) {
                    success();
                }
            }
        }
        failure();

        Guest [] data = data(); //data import works
        System.out.println(data[2]);
    }
    static void driver() { // Structures all the methods. Beta version
        frontEnd();
    }

    public static void main(String[] args) { // Final version.
        driver();
    }
}
