package ProjectsHub.Project2;

/**********************************************************************************************
 *
 * File: [GardeningPlanner_AhmadMustafa.java]
 * By: [Ahmad Mustafa]
 * Date: [07/30/2026]
 *
 * Description: The purpose of this code is to track the growth of a plant.
 *
 * ***********************************************************************************************/

import java.util.Scanner;
public class GardeningPlanner_AhmadMustafa {

    public static Scanner input = new Scanner(System.in);
    public static int minTemp, maxTemp, minRain;
    public static String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] plantGrowth = new int[12];
    public static int[] plantHeight = new int[12];
    public static int[] avgTemp = {46, 48, 49, 50, 51, 53, 54, 55, 56, 55, 51, 47};
    public static int[] avgRain = {5, 3, 3, 1, 1, 0, 0, 0, 0, 1, 3, 4};

    public static final String RESET = "\u001B[0m";
    public static final String BG = "\u001B[43m";

    public static void welcome() {
        dash(95);
        System.out.println("Welcome to the CSC 215 Gardening Planner!");
        dash(95);
    }

    public static void dash(int count) {
        int i = 0;
        while (i < count) {
            System.out.print("-");
            i++;
        }
        System.out.println();
    }

    public static void inputs() {
        System.out.print("- Enter minimum temperature for plant: ");
        minTemp = input.nextInt();
        System.out.print("- Enter maximum temperature for plant: ");
        maxTemp = input.nextInt();
        System.out.print("- Enter minimum rainfall for plant: ");
        minRain = input.nextInt();
        dash(95);
        System.out.println();
    }

    public static void formula() {
        int temp=0;

        //Calculating and storing plantGrowth and plantHeight into 1d arrays of int.
        for(int i = 0; i < 12; i++ ) {
            if (avgTemp[i] >= minTemp && avgTemp[i] <= maxTemp) { //if it is within temp range
                plantGrowth[i] = avgRain[i] - minRain;
                plantHeight[i] = temp + plantGrowth[i];

            } else { //if it doesnt grow
                plantGrowth[i] = -1;
                plantHeight[i] = temp + plantGrowth[i];
            }
            if (plantHeight[i] < 0) {
                plantHeight[i] = 0;
            }
            temp = plantHeight[i];
        }
    }
    public static Object[][] data1() {

        // Compiling data from all 1d arrays into a singular 2d array
        Object[][] arr = new Object[14][6];
        String[] line2 = {"INDEX", "MONTH", "TEMPERATURE", "RAINFALL", "PLANT GROWTH", "PLANT HEIGHT", };
        int k = -2;

        // find maxHeight
        int max = 0;
        for (int i = 2; i < plantHeight.length; i++) {
            if (max <= plantHeight[i])
                max = plantHeight[i];
        }

        //Store data in the 2d array
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if (i == 0) { // What happens at row 1
                    arr[i][j] = "---------------";
                } else if (i == 1) { // What happens at row 2
                    arr[i][j] = line2[j];
                } else { // What happens at row 3-12
                    if (j == 0) { // What happens at col 1
                        arr[i][j] = k;
                    } else if (j == 1) { // What happens at col 2
                        arr[i][j] = month[k];
                    } else if (j == 2) { // What happens at col 3
                        arr[i][j] = avgTemp[k];
                    } else if (j == 3) { // What happens at col 4
                        arr[i][j] = avgRain[k];
                    } else if (j == 4) { // What happens at col 5
                            arr[i][j] = plantGrowth[k];
                    } else {// What happens at col 6
                        if (max == plantHeight[k]) {
                            arr[i][j] = plantHeight[k] + "   " + BG + "MAX" + RESET;
                        } else {
                            arr[i][j] = plantHeight[k];
                        }
                    }

                }
            }
            k++;
        }
        return arr;
    }

    public static void print(Object[][] arr) {
        // Print the 2d array pt.2
        for (int i = 0; i < arr.length; i++) {
            if ( i < 2 ) { //Row 1 and 2
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.printf("%-15S ", arr[i][j]);
                }
            }
            else { // Row 2 onwards
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == 4) {
                        System.out.printf("%+-15d ", arr[i][j]);
                    } else {
                        System.out.printf("%-15s ", arr[i][j]);
                    }
                }
            }
            System.out.println();
        }

        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[0][j] + " ");
        }
    }
    public static void driver(){
        welcome();
        inputs();
        formula();
        print(data1());
    }
    public static void main(String[] args) {
        driver();
    }
}
//Debrief:
// Index is i
// Month array done
// avgTemp array done
// avgRain array done
// Plant Growth array done
// Plant Height array done
// NextUp: Compile all of these in a 2d array
// Object[][] arr --> Architecture
// 14 rows, 6 Columns
// Row 0: dashes
// Row 1: Names of columns
// Row 2-13: Index, month, avgTemp, avgRain, plantGrowth, plantHeight
//
// .
//
// .