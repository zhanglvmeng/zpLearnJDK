package test.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {


    public static void main(String[] args) {
        hashMapTest();
    }

    public static void hashMapTest() {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("a", "a");

        for(Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()  + "-" + entry.getValue());
        }
        hashMap.entrySet().forEach(x -> System.out.println(x.getKey() + "-" + x.getValue()));
    }
}
