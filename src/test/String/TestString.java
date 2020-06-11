package test.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestString {

    public static void main(String[] args) {
        String s = "1,2，3 , 4";
        System.out.println(getRealtimePoolInfo(s).toString());
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
