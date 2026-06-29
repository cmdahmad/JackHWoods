package Phase0.p21GetSet;

public class Car {

    String model = "Taycan";
    String color = "Yellow";
    int price = 30000;

    String getPrice() {
        return "$" + this.price;
        // If the car is above a certain amount add a 'K' or an 'M'.
    }
    String getColor() {
        return this.color;
    }
    String getModel() {
        return this.model;
    }
    void setModel(String model) {
        this.model = model;
    }
    void setColor(String color) {
        this.color = color;
    }
    void setPrice (int price) {
        this.price = price;
    }
}
