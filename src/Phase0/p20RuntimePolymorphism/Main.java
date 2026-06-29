package Phase0.p20RuntimePolymorphism;

import java.util.Scanner;

//Name: Ahmad Mustafa
//Scope: Explore polymorphism during runtime. Ask if the user wants to be a cat or a dog. Then assign the class.
//Learnings: Class must be abstract to have an abstract method. An abstract method MUST be overriden by all child classes.

public class Main { //Class name

    public static void main(String[] args) { //Main method
        Scanner input = new Scanner(System.in); //Assign input as the Scanner basket variable.

        Animal animal; // Animal Reference is set
        System.out.println("Welcome to the gulag"); // Welcome message.

        for (int i = 1; i > 0; i++) { // Loop to make it funny.

            System.out.println("Press 1. to reincarnate as a Cat"); //Option1
            System.out.println("Press 2. to reincarnate as a Dog"); //Option2
            int choice = input.nextInt(); //Scanner input.

            if (choice == 1) { //What happens if the user enters 1.
                animal = new Cat(); //animal variable will be assigned a Cat object and inherit all Cat components.
                animal.go(); //Overridden abstract method, cat version.
                System.out.println();
            } else if (choice == 2) {
                animal = new Dog(); //animal variable will be assigned a Dog object and inherit all Dog components.
                animal.go(); //Overridden abstract method, dog version.
                System.out.println();
            }
        }
    }
}
