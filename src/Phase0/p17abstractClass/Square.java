package Phase0.p17abstractClass;

public class Square extends Shape{

    //attribute; length
    double length;

    // Constructor with an argument for length
    Square (double length) {
        this.length = length;
    }
    // Calculate area of square
    double CalculateArea() {
        return length * length;
    }

    //to string
    public String toString() {
        return "I am a square with an area of " + CalculateArea();
    }
}
