package Phase0;

// Name: Ahmad Mustafa
// Scope: Create an object for porsche taycan
// Notes: Success!
// learnings: Part2: we learned about \n. We learned to run methods within the main class.
// we're getting more comfortable alhamdulillah.

public class p7_1 {

    public static void carBasics() {
        p7_0Taycan car1 = new p7_0Taycan();
        System.out.println("The car name is: " + car1.brand + " " + car1.model);
        System.out.println("The car model is " + car1.year);

        car1.engineOn();
        System.out.println("Is the car on? " + "\n" + car1.isRunning);

        System.out.println();
        car1.gas();

        System.out.println();
        car1.brake();
    }

    public static void main(String[] args) {
        carBasics();
    }

}
