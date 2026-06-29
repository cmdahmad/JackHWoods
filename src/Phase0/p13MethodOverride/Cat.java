package Phase0.p13MethodOverride;

public class Cat extends Animal{

    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void move() {
        System.out.println("This cat is running!");
    }

}
