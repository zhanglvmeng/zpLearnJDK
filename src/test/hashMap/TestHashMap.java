package test.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {

    public static void main(String[] args) {
        Map<String, String> h = new HashMap<>();
        h.put("1", "1");
        h.put("2", "1");
        h.put("3", "1");
        h.put("4", "1");

        Map<String, String> h2 = new ConcurrentHashMap<>();


        String s = h.put("4", "2");
        System.out.println(s);
        for (Map.Entry<String, String> entry : h.entrySet()) {
            System.out.println("key：" + entry.getKey() + " value:" + entry.getValue());
        }
    }
}
