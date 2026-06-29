package Phase0.p8.School;

public class School {

    //Name: Ahmad Mustafa
    //Scope: Create a student class with a constructor to set name, age and gpa.
    //Remarks: Successfully done. New skill learned of constructors.
    //Round 2: Woof big round! Constructors great progress.
    // Empty objects learned (no arg constructor).
    // PrintAll method.
    // this.name. Name of the object being used in this. instance.
    // Student() Example of a no argument constructor

    public static void main(String[] args) {

        //Student1 data
        System.out.println("Student01: ");
        Student student1 = new Student("Luffy", 22, 3.9);
        System.out.println(student1.name);
        System.out.println(+student1.age);
        System.out.println(student1.gpa);

        System.out.println();

        //Student2 data
        System.out.println("Student02: ");
        Student student2 = new Student("Zoro", 24, 2.2);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);

        //Print method
        System.out.println();
        System.out.println("Student03: ");
        Student stu3 = new Student("Nami", 20, 1.8);
        stu3.printAll();

        // Student without any attributes, blank
        System.out.println("\n" + "Student04: ");
        Student stu4 = new Student();
        stu4.printAll();

        //Student with only name and age
        System.out.println("\nStudent05: ");
        Student stu5 = new Student ("Black Leg Sanji", 20);
        stu5.printAll();

        //Student with name only
        System.out.println("\nStudent06: ");
        Student stu6 = new Student("Usopp");
        stu6.printAll();

        //Fightingmethod
        stu6.fighting();

        //Eating method
        System.out.println();
        student2.eating();
    }
}
