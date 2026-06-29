package Phase0.p14Summary;

public class Dog extends Animal {

    int NumOfLegs = 4;
    static int DogCount;

    Dog (String name, int age) {
        super(name, age);
        DogCount++;
    }
    @Override
    void PrintAll() {
        System.out.println("My name is " + this.name + ". I am " + this.age + " years old. I am a dog. Woof");
    }

}
