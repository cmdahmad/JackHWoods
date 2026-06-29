package Phase0.p9.carArray;

public class Car {

    String name = "Corolla";
    String color = "white";

    Car (String name, String color){
        this.name = name;
        this.color = color;
    }
    Car (String name) {
        this.name = name;
        this.color = "Metal";
    }
    Car () {
        this.name = "car";
        this.color = "Metal";

    }

}
