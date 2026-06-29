package Phase0;

public class p10_EnhancedForLoops {

    //Name: Ahmad Mustafa
    //Purpose: This code has a purpose to demonstrate for loops/ Create an array and print
    // Result: Successfully used enhanced for loops for an array of strings and an array on ints and an array of chars

    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "rat", "coyote", "elephant"};

        // Create new reference variable i, it scans through the index and gets assigned the value.
        for (String i : animals) {
            System.out.println(i);
        }

        /**
        String[] a : animals; ERROR, only works within the context of a for loop.
        System.out.println(a); See above.
         */

        //Try an array of ints - Success. i is a new variable that iterates through nums and gets assigned for the current iteration.
        int[] nums = {5,4,3,2,1};

        for (int i : nums) {
            System.out.println(i);
        }

        //Try an array of chars -- Success. i is a new variable that gets assigned to the current iteration of c.
        char[] c = {'a','b','c','d','e'};
        for (char i : c) {
            System.out.println(i);
        }

    }
}
