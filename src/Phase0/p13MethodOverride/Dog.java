package Phase0.p13MethodOverride;

public class Dog extends Animal{

    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void move() {
        System.out.println("This dog is running!");
    }
}
