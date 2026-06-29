package Phase0.p10carArray2;

public class Car {
    String name = "Prado";
    String color = "White";
    static int numOfCars;

    Car(String name, String color) {
        this.name = name;
        this.color = color;
        numOfCars++;

    }
    Car(String name) {
        this.name = name;
        this.color = "Regular";
        numOfCars++;
    }

    Car() {
        this.name = "Car";
        this.color = "Regular";
        numOfCars++;
    }

    void drive() {
        System.out.println("You drive the " + this.color + " " + this.name);
    }

    void gratitude() {
        System.out.println("Ya Allah! Thank you for the " + this.color + " " + this.name + ", you have certainly been merciful towards me and my family!");
    }

    void dua() {
        System.out.println("Ya Allah! Please gift me a " + this.color + " " + this.name + " from your mercy, please Ya Rabb");
    }
    static void NumOfCars() {
        System.out.println("You have created total " + numOfCars + " car objects.");
    }

}
