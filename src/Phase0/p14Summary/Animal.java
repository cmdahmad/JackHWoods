package Phase0.p14Summary;

public class Animal {

    String name = "Doggy";
    int age = 12;
    static int AnimalCount;

    // Reminder to keep the same name as class for the constructors.
    Animal (String name, int age) {
        this.name = name;
        this.age = age;
        AnimalCount++;
    }
    // Reminder to add void before methods.
    void PrintAll() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old. I am an animal. Rawr");
    }
}
