package test.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        testAdd();
    }

    public static void testAdd() {
        List<String> l = new ArrayList(2);
        l.add("a");
        l.add("b");
        l.add("c");

        l.add(2, "d");
        l.forEach(x -> System.out.println(x));

//        List<String> l2 = new ArrayList<>();
//        l2.add("2-a");

//        l.addAll(l2);
//        l.forEach(x -> System.out.println(x));

//        List<String> l3 = new ArrayList<>();
//        l3.add("3-a");
//        l3.add("3-b");
//        l.addAll(1, l3);
//        l.forEach(x -> System.out.println(x));

//        l.get(5);

        List<String> l2 = Arrays.asList("d", "a");


        l.addAll(l2);
        l.forEach(x -> System.out.println(x));

    }

    public static void testRemove() {
        List<String> l = new ArrayList(2);
        l.add("a");
        l.add("b");
        l.add("c");

        l.add(2, "d");
        l.forEach(x -> System.out.println(x));

        List<String> l2 = Arrays.asList("d", "a");


        l.removeAll(l2);
        l.forEach(x -> System.out.println(x));
    }

    public static void testListClass() {
        Father[] fathers = new Son[]{};
        System.out.println(fathers.getClass()); // class [Ltest.Collection.List.Son;

        List<String> strList = new MyList();
        System.out.println(strList.toArray().getClass());
    }
}


class Father {
}

class Son extends Father {
}

class MyList extends ArrayList<String> {
    @Override
    public String[] toArray() {
        return new String[]{"1", "2", "3"};
    }
}
