package Phase0.p12SuperClass;

public class Student extends Person{

    String name = "Ahmad";
    int age = 22;
    double gpa = 4.0;

     Student() {
        this.name = super.name;
        this.age = super.age;
        this.gpa = 4.0;
    }
    Student (String name) {
         super.name = name; // Assign name to the parent class
         this.name = super.name; // Assign current object name to parent class name.
         this.age = super.age;
         this.gpa = 4.0;
         // Prints the constructor name (GolaJee).
    }

}
