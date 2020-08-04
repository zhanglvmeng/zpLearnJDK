package test.generics;

import java.util.ArrayList;

public class ClassNoGenericsButMethodHas {
    private String first;
    private String last;
    public ClassNoGenericsButMethodHas(String first, String last) {
        this.first = first;
        this.last = last;
    }
    public String getFirst() {
        return first;
    }
    public String getLast() {
        return last;
    }

    public <E extends ClassNoGenericsButMethodHas> void testGenerics(Class<E> e) {
        return;
    }

    public <E extends ArrayList> void testGenerics2(Class<E> e) {
        return;
    }

    public static void main(String[] args) {
        String s = "start testa aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatesta aaaatest";
        System.out.println(s.length());
    }
}
