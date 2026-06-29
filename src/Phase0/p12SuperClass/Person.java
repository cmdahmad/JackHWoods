package Phase0.p12SuperClass;

public class Person {

    String name = "John";
    int age = 18;
    static int count;

    Person() {
        this.name = "Person";
        this.age = 18;
        count++;
    }

    Person(String name) {
        this.name = name;
        this.age = 18;
        count++;
    }
}
