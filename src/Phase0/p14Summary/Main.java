package Phase0.p14Summary;

//Name: Ahmad Mustafa
//Scope: Make the static keyword work across all constructors. Create 2 classes only. One method override as well.
// Basically, create 2 objects, one in parent and one in child. Both must trigger the static key word and increase.
//Go: (Learn more btw.)
// The number of objects are only correct if they are dogs

public class Main {

    public static void main(String[] args) {


        Animal animal = new Animal("Spongebob", 12); //Left dad right dad.
        Dog dog1 = new Dog("Rocky", 13); // left son right son
        Animal dog2 = new Dog("Goofy", 14); // left dad right son.

        animal.PrintAll();
        dog1.PrintAll(); // method override successful
        dog2.PrintAll(); // Works the same as dog1

        System.out.println("\nThe number of animals are: " + Animal.AnimalCount);
        System.out.println("\nThe number of dogs are: " + Dog.DogCount);

        // WE have 3 animals in total. Spongebob, goofy and rocky. Animal count in the animal constructor.
        // We have 2 dogs in total. Goofy and Rocky. Dog count in the dog constructor.
        // IT WORKS!!

    }

}
