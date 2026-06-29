package Phase0;

import java.util.Scanner;
public class p6 {

    //Name: Ahmad Mustafa
    //SCope: Start working towards making a calculator
    //Learnings: Whatever you make out of main, you can make it into another method and run the main method with just that method and the code is clean hehe.

    //Add the numbers
    public static int addition(int num1, int num2) {

        int num3 = num1 + num2;

        return num3;
    }

    //Collect the inputs and print
    public static void operations() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.println("Your sum is: " + addition(num1, num2));
    }

    //main method
    public static void main(String[] args) {

        operations();
    }
}
