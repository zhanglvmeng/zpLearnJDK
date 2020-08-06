package test.reflection;

public class Student extends Person{
    public int getScore(String type) {
        return 99;
    }
    private int getGrade(int year) {
        return 1;
    }

    Student() {
        super("");
    }

    public void hello() {
        System.out.println("student hello");
    }
}
