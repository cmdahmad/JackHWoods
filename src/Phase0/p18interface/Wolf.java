package Phase0.p18interface;

public class Wolf extends Animal implements Predator, Prey{

    @Override
    public void flee() {
        System.out.println("Danger danger time to run!");
    }

    @Override
    public void hunt() {
        System.out.println("Get ready, it's time to hunt!");
    }

    @Override
    public void jump() {
        System.out.println("*The Wolf makes a jump*");
    }

}
