package Phase0.P30NPS10;

//Name: Ahmad Mustafa
//Scope: Give reed an option to set his secret key and unit number. And create an object using that.
//NextUp: You have successfully made the process repeatable. Now make it so one user only has to set one key.
// SUccess, reed can set his unit number and secret key. What's next?
// Let's align to the main file and goal once again
//

import java.util.Scanner;
public class P30NPS10 {

    public static Guest CreateGuest(String name, String unit) { //Initialize a guest with these name and unit.
        Guest guest1 = new Guest(name, unit); //Create guest object, then set the constructor arguments as method arguments.
        return guest1; // return object
    }

    static Guest setGuest (){
        Scanner input = new Scanner(System.in);
        String name, unit;

        System.out.println("Enter the secret key: "); //Input name
        name = input.nextLine();

        System.out.println("Enter your unit number: "); //Input unit no.
        unit = input.nextLine();

        return CreateGuest(name, unit);
    }

    static Guest[] data() {
        Guest g1 = setGuest();
        Guest g2 = new Guest();
        Guest g3 = new Guest();

        Guest[] guests = {g1, g2, g3};
        return guests;
    }

    public static void main(String[] args) {

        Guest[] guests = data();

        for (int i = 0; i < 3; i++) {
            System.out.println(guests[i]);
        }
    }
}
