package Phase0.p10carArray2;

/* Name: Ahmad Mustafa
 * Scope: Create an array of objects, then run using an enhanced loop.
 * New: Learned static int. Learned static method. Static is data that belongs to a class, remains consistent for all objects.
 */

public class Main {

    static void servant() {

        //Sample object works
        Car car1 = new Car("Prado", "White");

        /*
        //Drive method works
        car1.drive();
        */

        //Array of cars
        Car[] cars = {car1,
                new Car("Sportage", "Blue"),
                new Car("Corolla", "White"),
                new Car( "Maybach", "Black"),
                new Car("McLaren", "Orange"),
                new Car("GMC","Black")
        };

        /*
        //Enhanced for loop with the drive method combined. - works
        for (Car car : cars) {
            car.drive();
        }
         */

        //Owned cars
        for (int i = 0; i < 3; i++) {
            cars[i].gratitude();
        }
        System.out.println();
        //Want the cars
        for (int i = 3; i < cars.length; i++) {
            cars[i].dua();
        }

        System.out.println();
        //Print numofcars method, first static method that belongs to a class and gets stored there instead as an object
        Car.NumOfCars();

    }
    public static void main(String[] args) {
        servant();
    }
}
