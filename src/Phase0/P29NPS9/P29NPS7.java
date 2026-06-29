package Phase0.P29NPS9;

//Name: Ahmad Mustafa
//Scope: Give reed an option to set his secret key and unit number. And create an object using that.
//NextUp: Make the process of asking name and unit repeatable. I want to ask Robert as well, but Reed has already set the name and unit.
//

import java.util.Scanner;
public class P29NPS7 {

    public static Guest CreateGuest(String name, String unit) { //Initialize a guest with these name and unit.
        Guest guest1 = new Guest(name, unit); //Create guest object, then set the constructor arguments as method arguments.
        return guest1; // return object
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the secret key: ");
        String name, unit;
        name = input.nextLine();

        System.out.println("Enter your unit number: ");
        unit = input.nextLine();

        Guest guest1 = CreateGuest(name, unit); // Object initialised from asking reed.
        Guest guest2 = new Guest("Jamie", "609"); // Object initialised in system.

        System.out.println(guest1);
        System.out.println(guest2);
        //Print statement (toString)
    }
}
