package Phase0;

//Name: Ahmad Mustafa
//Scope: Verify Name and apartment number. Incorrect information will seize access. Correct info is Jamie from 803.
//Next up: Have an array of 3 residents. All open the code.
// There are 3 ways we can have 3 residents.
// 1 way is to create 3 residents seperately. This would be a good start considering we have already solved for 1 resident.
// 2nd way would be to although incomplete, we can create an array of 3 residents. This array contains 2 forms of data.
// 1 form of data is the name. Second form of data is their apartment number.
/* Starting with their names we can do it in 2 ways. One would be to have 2 separate arrays. 1 array of strings called
Names. then 1 array of integers called apartment numbers. Then find a way to correlate them
Talking about correlations, we can instead create objects and through those objects we run tests in a way to verify
those objects. This on paper, sounds like the best solution. But let's try all solutions and compare their differences.
I want to do a project later which has a name called: VisionDoc. Let's circle back to it later. For now, let's code
The first solution which is to have 3 separate identities like jamie. P25 NPS3
 * */

import java.util.Scanner;

public class P24NPS2 {
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
        if(name.equals("Jamie") || name.equals("jamie")){
            if(unit == 803) {
                success();
            }
        }
        failure();
    }

    public static void main(String[] args) {
        driver();
    }
}
// Success.