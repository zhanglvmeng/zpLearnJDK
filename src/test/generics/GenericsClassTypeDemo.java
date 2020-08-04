package test.generics;

import java.util.*;

public class GenericsClassTypeDemo {

    public static void main(String[] args) {
        testGenericsTypes();
    }

    class Table {}
    class Room {}
    class House<Q> {}
    class Particle<POSITION, MOMENTUM> {}

    public static void testGenericsTypes () {
        List<Table> tableList = new ArrayList<Table>();
        Map<Room, Table> maps = new HashMap<Room, Table>();
        System.out.println(Arrays.toString(tableList.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(tableList.getClass().getTypeParameters()));

    }
}
