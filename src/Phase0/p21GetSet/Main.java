package Phase0.p21GetSet;

//Name: Ahmad Mustafa
//Scope: Ask the user what car they want for their vacation and repeat it to them.
//Learnings: Getter and Setter methods complete. Getter method allows you to privatize the car attributes and access them through a method. Setter method allows you to change them.
// Getter method uses a variable type method and returns it. Setter type is a void method which only assigns the arguments to the object. e.g. (Name);argument becomes the actual name of the object. (See line 21)
//Next: Problem solve whether you can print 1200000 automatically as $1.2m

import java.util.Scanner; //importing Scanner files
public class Main { //Main class

    public static void main(String[] args) { //main method
        Scanner input = new Scanner(System.in); //Assigning input variable as a basket

        String carChoice; //Variable which is set by the user later
        String colorChoice; //Color chosen by the user. later
        int priceChoice;
        Car car1 = new Car(); //Car1 object, created by the user.

        System.out.println("Which car do you want as your vacation car? "); //Imagine Allah asking you this.
        carChoice = input.nextLine(); //Scanner input for car model.

        System.out.println("What should be the color?");
        colorChoice = input.next();

        System.out.println("How much do you want to pay for the car? (alLa takhaafu)");
        priceChoice = input.nextInt();

        car1.setModel(carChoice);//Works haha. I feel so satisfied.
        car1.setColor(colorChoice);
        car1.setPrice(priceChoice);


        //Printing the get methods
        System.out.println("You asked for the " + car1.getColor() + " " + car1.getModel() + " for " + car1.getPrice());
        // I want the car1.model to be interchangeable.


    }
}
