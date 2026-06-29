package Phase0.p17abstractClass;

//Name: Ahmad Mustafa
//Scope: Practice abstract classes.
//Learn: Classes the user can't access, but they are working.
//Next: I would work a little bit more on abstract classes, learn use cases and different applications.

public class main {

    public static void main(String[] args) {

        //Circle
        Circle circle = new Circle(2);
        // Shape shape = new Shape(); doesnt work cuz abstract

        System.out.println(circle.radius);
        System.out.println(circle.area());
        circle.display();

        //Square
        Square square = new Square(2);

        System.out.println("\n" + square.length);
        System.out.println(square);

    }
}
