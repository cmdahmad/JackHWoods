package Phase0.p18interface;

public class Lion extends Animal implements Predator{

    @Override
    public void hunt() {
        System.out.println("Get ready, it's time to hunt!");
    }

}
