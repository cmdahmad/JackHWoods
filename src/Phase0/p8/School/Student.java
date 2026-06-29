package Phase0.p8.School;

public class Student {

    String name = "Luffy";
    int age = 19;
    double gpa = 3.2;
    boolean isEnrolled = true;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gpa = 0;
    }
    Student(String name) {
        this.name = name;
        this.age = 0;
        this.gpa = 0;
    }
    Student() {
        this.name = "Guest";
        this.age = 0;
        this.gpa = 0;
    }

    void printAll() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gpa);
    }

    void fighting() {
        System.out.print (this.name + " is fighting an enemy!");
    }
// Works!. Wait no it doesn't because the name remains the one created by the object.
    void eating() {
        System.out.print(this.name + " is eating meat");
    }


}
