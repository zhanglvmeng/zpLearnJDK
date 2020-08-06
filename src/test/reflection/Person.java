package test.reflection;

public class Person {
    private String name;

    Person (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("person hello");
    }
}