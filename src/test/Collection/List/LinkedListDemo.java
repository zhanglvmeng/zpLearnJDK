package test.Collection.List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        testBasic();
    }

    public static void testBasic() {
        LinkedList<String> l = new LinkedList<>();
        l.add("a");
        l.forEach(x -> System.out.println(x));

        List<String> l2 = Arrays.asList("a", "b");
        LinkedList<String> l3 = new LinkedList(l2);

    }
}
