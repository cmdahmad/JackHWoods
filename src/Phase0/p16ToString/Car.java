package Phase0.p16ToString;

public class Car {

    String name = "Corolla";
    String company = "Toyota";
    int year = 2026;
    String color = "White";

    Car(String name, String company, int year, String color) {
        this.name = name;
        this.company = company;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.company + " " + this.name + " " + this.year + " in " + this.color;
    }
}
