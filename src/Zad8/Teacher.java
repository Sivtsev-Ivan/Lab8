package Zad8;

public class Teacher extends People{

    Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    void teach() {
        System.out.println("teach");
    }
}