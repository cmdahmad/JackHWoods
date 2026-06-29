package Phase0;

public class p5 {

    //Name: Ahmad Mustafa
    //Scope: make an array using shorthand notation and print it
    //Learning: a method needs the static word to be called in the same class.
    // We created a method called poop count which created an array using shorthand
    // The array had 7 values 1,7.
    // We created a separate method called poopcount
    // in the main method, we only called poop count.
    // Success.
    // Next up: Create object called Car1 and using a separate class, call the object.

    private static void PoopCount() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            System.out.print("poop number: ");
            System.out.print(arr[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PoopCount();
    }
        //System.out.println(arr)
}
