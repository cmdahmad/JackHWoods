package Phase2.p4;

import java.sql.SQLOutput;
import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [][] arr = new String[5][3];

        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Exercise "+ k +": Find a niche" +
                    "\n\nWhat is the name of the person who you want to nichisize?");
            arr [i][0] = input.nextLine();

            System.out.println("What is their profession/hobby?");
            arr [i][1] = input.nextLine();

            System.out.println("What is their approximated income?");
            arr [i][2] = input.nextLine();
            k++;
        }


        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
