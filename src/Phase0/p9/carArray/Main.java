package Phase0.p9.carArray;

// Name: Ahmad Mustafa
// Purpose: Create an array of objects.
// Round2: Created a multi- step array of objects.
// NextUp: See if you can create a new class of clients, substitute that with "Person x" (done)
// Next2: See if you can create a new array which adds both arrays

public class Main {

    public static void main(String[] args) {
        //6 cars
        Car car1 = new Car("Prado", "White");
        Car car2 = new Car("Corolla", "White");
        Car car3 = new Car("Sportage", "Blue");
        Car car4 = new Car("Taycan", "White");
        Car car5 = new Car("Supra", "White");
        Car car6 = new Car("E-tron", "White");

        //6 persons (Test success)
        Person per1 = new Person("Luffy");
        Person per2 = new Person("Zoro");
        Person per3 = new Person("Nami");
        Person per4 = new Person("Sanji");
        Person per5 = new Person("Usopp");
        Person per6 = new Person("Chopper");
        // Person array (Test success)
        Person[] persons = {per1,per2,per3,per4,per5,per6};


        //Initialise shorthand notation array:
        Car[] cars = {car1, car2, car3};
        int jonah = 1;

        //Print shorthand notation array
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Person " + jonah + " bought " + cars[i].color + " " + cars[i].name);
            jonah++;;
        }

        //Multi step approach;
        Car[] trucks = new Car[3];
        trucks[0] = car4;
        trucks[1] = car5;
        trucks[2] = car6;

        //Print multi step array
        for (int i = 0; i < trucks.length; i++) {
            System.out.println("Person " + jonah + " bought " + trucks[i].color + " " + trucks[i].name);
            jonah++;
        }

        System.out.println("\nThis is day 2 on the same file: \n");

        //Print person with cars.
        for (int i = 0; i < cars.length; i++) {
            System.out.println(persons[i].name + " bought " + cars[i].color + " " + cars[i].name);
        }

        //Print person with trucks.
        jonah = 3;
        for (int i = 0; i < trucks.length; i++) {
            System.out.println(persons[jonah].name + " bought " + trucks[i].color + " " + trucks[i].name);
            jonah++;
        }

    }

}

