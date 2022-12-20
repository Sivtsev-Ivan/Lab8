package Zad8;

public class Zad8 {
    static public void main(String[] args) {
        Student student = new Student("Vanya", "Sivtsev", 19);
        student.walk();
        student.run();
        student.voice();
        student.learn();
        Teacher teacher = new Teacher("Ivan", "Alekseevich", 30);
        teacher.walk();
        teacher.run();
        teacher.voice();
        teacher.teach();
    }
}