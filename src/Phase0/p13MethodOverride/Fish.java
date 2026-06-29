package Phase0.p13MethodOverride;

public class Fish extends Animal{

    Fish(String name, int age) {
        super(name, age);
    }

    @Override
    void move() {
        System.out.println("This fish is swimming");
    }
}
