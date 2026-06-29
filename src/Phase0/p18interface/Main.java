package Phase0.p18interface;

public class Main {

    //Name: Ahmad Mustafa
    // Scope: Explore interfaces.
    // Next: check if you can implement AND extend a class.

    public static void main(String[] args) {

        Wolf wolf = new Wolf(); //PREY AND PREDATOR
        Deer deer = new Deer(); //PREY
        Lion lion = new Lion(); //PREDATOR

        wolf.hunt(); //ABSTRACT REQUIRED
        lion.hunt(); //ABSTRACT REQUIRED
        wolf.flee(); //ABSTRACT REQUIRED
        deer.flee(); //ABSTRACT REQUIRED

        System.out.println();

        lion.jump(); //CONCRETE METHOD FROM ABSTRACT CLASS
        wolf.jump(); //CONCRETE METHOD OVERRIDDEN
        deer.jump(); //CONCRETE METHOD OVERRIDDEN

    }
}
