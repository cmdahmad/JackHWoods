package Phase0.p11Inheritance;

//Name: Ahmad Mustafa
//Scope: Set up an inheritance chain
/* Learned:
When the left and right type is the child class, the child methods override.
The left can't be the child of the right.
The right can be the child of the left.
This is downcasting i think.

Next: Cast a new variable done. left is parent of right. and run a .intro() see whose method runs. child or parent. I'm guessing child.
Iteration1: Left parent (Animal). Right Child (Dog). Dog method runs. (right)

Retry super


 */

public class Main {

    public static void main(String[] args) {

        Organism cell = new Organism();
        Animal animal = new Animal();
        Plant plant = new Plant();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal dog1 = new Dog();
        Organism dog2 = new Dog();

        // Plant plant2 = new Organism(); upcasting is not working with plant organism.


        cell.life();
        animal.life();
        plant.life();
        cat.life();
        dog.life();

        cell.intro();
        animal.intro();
        plant.intro();
        cat.intro();
        dog.intro();

        //Left animal right dog. Dog method runs. Downcasting.
        dog1.life();
        dog1.intro();
        //Left organism right dog. Dog method runs. Downcasting.
        dog2.life();
        dog2.intro();
        //Trying upcasting,
        //plant2.life(); doesnt work

    }
}
