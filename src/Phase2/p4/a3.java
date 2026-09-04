package Phase2.p4;

//Name: Ahmad Mustafa
// Purpose: Reverse engineer getting a software internship
// Implement:
// Classes;
// 1. Skills required
// 2. Tech Required
// 3. Material required
// 4. Application habit
// 5. Ideal resume (Sho, Raymond, Raph2)
// 6. Interview Skills
// .

import java.util.ArrayList;
import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Hello I am a programmer.");
        System.out.println("List all the skills required to reverse engineer a tech internship?");
        arr.add(input.nextLine());

        System.out.println("You said: " + arr);

    }

}
// Sample output01:
// [Mathematical maturity, some common languages(you are fine with java), Knowledge of how to ship a full product.
// NextUp: Do CSC220(ASMT 02) and ship it on the web].
