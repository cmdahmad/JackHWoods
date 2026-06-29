package Phase0.P28NPS8_1;

//Name: Ahmad Mustafa
//Scope: Create a verification lock using OOP

import java.util.Scanner;

public class P28NPS6_1 {

    static void success() { //Method for when credentials are correct
        System.out.println("*The Vault Bolts Open*");
        System.exit(401);
    }

    static void failure(){ //Method for when credentials are incorrect.
        System.out.println("You entered incorrect credentials. Please wait for the receptionist to return.");
    }
    static Guest[] data(){
        Guest guest1 = new Guest("Jamie", 803);
        Guest guest2 = new Guest("Suzie", 804);
        Guest guest3 = new Guest("Miley", 805);
        Guest guest4 = new Guest("Bill", 209);

        Guest[] guests = {guest1, guest2, guest3, guest4}; //How to automatically add new objects?
        return guests;
    }

    static void driver2() { //Driver method
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the given name: "); // Step 1 Ask for Name
        String name = input.nextLine();
        System.out.println("Enter the resident's unit number: "); //Step 2 Ask for Unit
        int unit = input.nextInt();

        Guest[] guests = data(); // Retrive information from the database (Data method, returns an array of objects)

        for(int i = 0; i < guests.length; i++) { //loop to go through all objects
            if(name.equalsIgnoreCase(guests[i].name)){
                if(unit == guests[i].unit){
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

// How does the user create objects?
// How does the programmer create objects?
// Well, the programmer does is say Guest guest5 = new Guest("Name",unit);
// Can the user do this on their phone?
// If the user is asked hey set your secret key
// Then they are asked set your unit number
// These two things will be final and done. Let's set this up first.

//Next, store data in a separate method. done
// How to automatically add new objects to the guests array after the objects initialise?
// How to make .equals case insensitive so I don't have to make the same guest twice? == .equalsIgnoreCase
// New project or is there anything else we can do with this.
// Implement this at the site. There is a screen that asks user and unit number to access the dropbox.
// It's there. You get a call from Reed. He says he's dropping a cheque for his father to pick up.
// His father's name is Bill. Reed's unit is 209.
// What do you do?
// I open the code and I enter Bill's name and unit number based on Reed's text, and now bill has access. (True)
// OR I can send an option to Mr. Reed for him to set the user and password himself.
// If reed wants to set a user and unit number himself, how would he do it
// He would open the app, put in his unit number and secret code (Bill) and it would say that your secret code is set.
// Enter Secret code, enter unit number. Now this information must be stored in an object, then that object added to the data() array.
// First step is easy, second step might be a bit more difficult, you would have to increase array size and then add guest4 to it.
// Do step1 first.
// Alternatively, you can make all text all caps or no caps before control statementing it.
