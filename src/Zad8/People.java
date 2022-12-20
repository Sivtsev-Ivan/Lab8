package Zad8;

public class People {
    protected String name;
    protected String lastname;
    protected int age;

    People() {
        name = "Ivan";
        lastname = "Sivtsev";
        age = 19;
    }

    public People(String name, String lastname, int age) {
        this.name = name;
        this.lastname = name;
        this.age = age;
    }

    void walk() {
            System.out.println("walk");
    }

    void voice() {
            System.out.println("voice");
    }

    void run() {
            System.out.println("run");
    }
}