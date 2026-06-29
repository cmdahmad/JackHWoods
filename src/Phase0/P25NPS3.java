package Phase0;

import java.util.Scanner;

public class P25NPS3 {

    /* Create 2 new characters
    Jamie, 803
    Suzie, 804
    Miley, 805
    Code works, but there is an issue
    Suzie, can enter Jamie's apartment number and receive the key
    The issue with this is if a perpetrator enters the correct name but an incorrect unit they can still enter.
    How do we counter this issue?
    One way would be to have some sort of mechanism to match the 2.
    Is there another solution instead of matching? No matching sounds right.
    Okay.
    One way to match the 2 would be to have 3 seperate if statements.
    Another one is a farr stretch, which is outside the scope of the program, which is to store data in objects and verify objects.
    Let's try separate if statements first and see if we can make a better solution from there.
    Separate if statements work. Check. These are nested if statements.
    I tried doing it as else if. It still works.
    Now the name and apartment number are paired together in the nested if statement.
    What we want to verify is if there is another way of pairing them together before jumping to creating objects.
    An object would consist of Credentials. Attributes would be name and unit number.
    Create a doc called problem solving this is golden information. Just keep fighting the problem. Take any solution that comes and apply it. keep re iterating.
    Next: Create an array of names and an array of integers. Verify them one by one, then try creating a loop.
    * */
    static void success() {
        System.out.println("*The Vault Bolts Open*");
        System.exit(401);
    }
    static void failure(){
        System.out.println("You entered incorrect credentials. Please wait for the receptionist to return.");
    }

    static void driver() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the given name: ");
        String name = input.nextLine();
        System.out.println("Enter the resident's unit number: ");
        int unit = input.nextInt();

        //Verify:
        if(     name.equals("Jamie") || name.equals("jamie")
        ){
            if(unit == 803) {
                success();
            }
        }
        else if(     name.equals("Suzie") || name.equals("suzie")
        ){
            if(unit == 804) {
                success();
            }
        }
        else if(     name.equals("Miley") || name.equals("miley")
        ){
            if(unit == 805) {
                success();
            }
        }
        failure();
    }
    public static void main(String[] args) {
        driver();
    }
}