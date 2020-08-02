package test.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class HashSetDemo {

    public static void main(String[] args) {
//        Set<String> s = new HashSet<>(10);
//        s.add("1");
//        s.add("2");
//        s.forEach(x -> System.out.println(x));

        Set<String> s2 = new LinkedHashSet<>(10);
        s2.add("4");
        s2.add("3");
        s2.add("5");
        s2.forEach(x -> System.out.println(x));

        Set<String> s3 = new ConcurrentSkipListSet<>();
        s3.add("1");
        s3.add("2");
    }
}
