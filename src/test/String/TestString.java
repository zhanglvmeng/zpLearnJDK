package test.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestString {

    public static void main(String[] args) {
//        String s = "1,2，3 , 4";
        String s1 = new String("[ { \"displayName\": \"top_priority\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/realTime.png\", \"pool\": 17, \"order\": 1 , \"isReview\" :false}, { \"displayName\": \"watchit_boutique\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/watchitBoutique.png\", \"pool\": 18, \"order\": 2 , \"isReview\" :false}, { \"displayName\": \"PGC\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/pgc.png\", \"pool\": 15, \"order\": 3, \"isReview\" :false }, { \"displayName\": \"PgcStock\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/pgc.png\", \"pool\": 25, \"order\": 4, \"isReview\" :false }, { \"displayName\": \"OGC\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/ogc.png\", \"pool\": 5, \"order\": 5 , \"isReview\" :false}, { \"displayName\": \"boutique\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/boutique.png\", \"pool\": 4, \"order\": 6 , \"isReview\" :false}, { \"displayName\": \"Offline\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/offline.png\", \"pool\": 6, \"order\": 7 , \"isReview\" :false}, { \"displayName\": \"manual\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/manual.png\", \"pool\": 7, \"order\": 8 , \"isReview\" :false}, { \"displayName\": \"high_end\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/highEnd.png\", \"pool\": 8, \"order\": 9, \"isReview\" :false }, { \"displayName\": \"manualentry\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/manual_entry.png\", \"pool\": 10, \"order\": 11 , \"isReview\" :false}, { \"displayName\": \"MGC\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/mgc.png\", \"pool\": 20, \"order\": 12 , \"isReview\" :false}, { \"displayName\": \"fast\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/fast.png\", \"pool\": 14, \"order\": 102 , \"isReview\" :false}, { \"displayName\": \"appeal\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/appeal.png\", \"pool\": 16, \"order\": -1, \"isReview\" :false }, { \"displayName\": \"top review\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/manual.png\", \"pool\": 21, \"order\": -1, \"isReview\" :true }, { \"displayName\": \"hot new review\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/appeal.png\", \"pool\": 23, \"order\": -1, \"isReview\" :true }, { \"displayName\": \"excel audit\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/appeal.png\", \"pool\": 24, \"order\": -1, \"isExcel\" :true }, { \"displayName\": \"NORMANDY top review\", \"logo\": \"http://mamp.wshareit.com/file/pic/audit/mgc.png\", \"pool\": 26, \"order\": -1, \"isReview\" :true } ]\n");
        System.out.println(s1.length());
        s1.hashCode();
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
