package Phase0.p13MethodOverride;

public class Animal {

    String name = "Luffy";
    int age = 16;

    Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void move() {
        System.out.println("This animal is running!");
    }
}
