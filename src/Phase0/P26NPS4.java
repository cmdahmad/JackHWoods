package Phase0;

//Starting with 45 Lines, Ending with 40
//How do we store data from 10 residents instead of 3. Are you going to make separate nested if statements for all? Surely not.
/* One way as discussed previously, let's try starting with 2 arrays and pair from there.
        // names [0] corresponds to units [0]
        // If there is a variable assigned to these values. We can create one statement that only verifies if the variable matches.
        // Only an idea for now.
        Can you Make .equals method case insensitive? Before looking at the internet, we can explore the override method.
        Let's explore the override method when we start OOP.
        Tomorrow, we go back to OOp.
        ORRRR we can store in 2d ARRAYs.
        OOP time.
        Nevermind, let's try 2d arrays first before hopping onto oop.
        2d ARRAYASSSSS
        //2d meaning one array of 2 columns and infinite rows. 3 rows for now containing miley suzie, jamie.
*/

import java.util.Scanner;

public class P26NPS4 {

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
        int unit = input.nextInt();

        String[] names = {"Jamie", "Suzie", "Miley", "jamie", "suzie", "miley"};
        int[] units = {803, 804, 805, 803, 804, 805};

        for(int i = 0; i < names.length; i++){
            if (name.equals(names[i])) {// works
                if (unit == units [i]) {
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
