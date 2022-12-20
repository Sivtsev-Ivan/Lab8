package Zad8;

public class Student extends People {

    Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    void learn() {
        System.out.println("learn");
    }
}
