package Phase0.p13MethodOverride;

//Name: Ahmad Mustafa
//Scope: Demonstrate knowledge on method overriding
//OUtput: Demonstrated knowledge on .move() method overriding. Demonstrated knowledge on using super() for constructors.
// Also: changed the theme of the outputs

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the new Theme! \n");

        Animal animal = new Animal("PapaAnimal", 35);
        Fish fish = new Fish("Nemo", 11);
        Dog dog = new Dog("Goofy", 12);
        Cat cat = new Cat("Tom", 16);

        animal.move();
        dog.move();
        cat.move();
        fish.move();


    }
}
