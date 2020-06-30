package test.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestString {

    public static void main(String[] args) {
//        String s = "1,2，3 , 4";
        String s1 = new String("aaabbbbbbbbb");
        String s2 = new String("aaabbbbbbbbb");
        System.out.println(s1 == s2);
        System.out.println(s1.intern() == s2.intern());
    }
    /**
     * 将池子信息 获取，并解析成List<Integer>
     * @return
     */
    public static List<Integer> getRealtimePoolInfo(String realtimePool) {
        List<Integer> res = Arrays.stream(realtimePool.split(",|，")).map(String::trim).map(Integer::valueOf).collect(Collectors.toList());
        return res;
    }
}
