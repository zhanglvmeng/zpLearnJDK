package test.Collection.List;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        List<String> l = new CopyOnWriteArrayList<>();
        l.add("a");

        l.forEach(x -> System.out.println(x));
    }


}
