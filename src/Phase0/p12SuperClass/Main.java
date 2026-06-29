package Phase0.p12SuperClass;

//Name; Ahmad Mustafa
//Scope: Explore super. word.
//Case: Parent class has constructors. Child class has .super constructor.
//Learnings: Just like this. works. super. works also. All objects call the child class attributes and methods by default, this can be changed using .super.

// Next up: Try adding constructors and playing with them.
// Add the name and no arg constructor in the parent class and check. Then add into son class as well.
// Add one day of the week for concept review.
// Conclude this program right here.

public class Main {

    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.gpa);
        // Prints John(Student) 22(Student) 4.0(Student ofc). I made Student on the left Student on the right
        // Note there is no constructors for Student class. (No super class)

        Person stu2 = new Person();
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        //System.out.println(stu2.gpa); doesnt work, cuz person doesnt have gpa.
        // Prints Person(Person) 18(Person). I created Person on the left, person on the right.

        Person stu3 = new Student();
        System.out.println(stu3.name); // Prints person cuz of super
        System.out.println(stu3.age); // Prints 18 (Person) cuz of super
        // System.out.println(stu3.gpa); Doesn't work
        // Same result as Person ref and Person obj.

        // Creates an object in the student class, but the reference variable, the name used to to call the object, is what it would be for a person.
        // Like originally, the creature is a dog. But you call it with a human name like Joe.
        // The constructor is being used of person.

        Student stu4 = new Student("GolaJee");
        System.out.println(stu4.name); // Interesting. Prints out the super version because name is the super version.
        System.out.println(stu4.age); // Superclass output.
        System.out.println(stu4.gpa); // This class.

        System.out.println("\n" + Person.count); // Prints 4, the correct amount. Static variable check
    }
}
