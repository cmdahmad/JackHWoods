package Phase0.p17abstractClass;

public class Circle extends Shape{

    //attribute length
    double radius;

    //constructor with radius as a required argument
    Circle (double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "I am a circle";
    }

    double area () {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.println("This is a circle with an area of " + this.area());
    }
}
