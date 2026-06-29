package Phase0.p16ToString;

public class Main {

    //Name: Ahmad Mustafa
    //Scope: Check out the toString method. New concept, let's try it
    //Output: toString is basically an overridden method when set you can print the object directly and see it's
    //        contents rather than a hashcode.

    public static void main(String[] args) {


        // 2 car objects initiated
        Car car = new Car("Taycan", "Porsche®", 2026, "Red");
        Car car2 = new Car("Land Cruiser", "Toyota", 2026, "White");

        // Cars put in an array of object
        Car[] cars = {car, car2};

        //System.out.println(car);
        //System.out.println(car2);

        // toString method override works
        System.out.println(cars[0]);
        System.out.println(cars[1]);
    }
}
