package Phase0.p18interface;

public class Deer extends Animal implements Prey{

    @Override
    public void flee() {
        System.out.println("Danger danger time to run!");
    }

    @Override
    public void jump() {
        System.out.println("*The Deer jumps*");
    }
}