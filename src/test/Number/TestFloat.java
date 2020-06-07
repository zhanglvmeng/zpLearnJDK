package test.Number;

import java.math.BigDecimal;

public class TestFloat {

    public static void main(String[] args) {
        Float max = Float.MAX_VALUE;
        System.out.println("max is " + max);
        // float to bit
        int intBits = Float.floatToIntBits(max);
        String intBitsStr = Integer.toBinaryString(intBits);
        System.out.println("max binary is " + intBitsStr);

        Float min = Float.MIN_VALUE;
        System.out.println("min is " + min);
        // float to bit
        int intBitsMin = Float.floatToIntBits(min);
        String intBitsStrMin = Integer.toBinaryString(intBitsMin);
        System.out.println("min binary is " + intBitsStrMin);

        int size = Float.SIZE;
        System.out.println("bit size is " + size);
        int byteSize = Float.SIZE / Byte.SIZE;
        System.out.println("byte size is " + byteSize);

    }

    /**
     * 既然0.25 可以精确表示，为什么乘以86400 000 之后，还是有误差呢？
     */
    private void getTimestamp () {
        Long time = 1622822402000L;
        Float f = 0.25F;
        Float f1 =  3600 * 1000 * 24 * f;
        System.out.println(time + f1);

        Double d = new Double(0.25);
        Double d1 = 3600 * 1000 * 24 * d;
//            System.out.println(f);
//        Double after = ;
        System.out.println(time + d1);

        BigDecimal b = new BigDecimal(d + "");
        BigDecimal dayMilli = new BigDecimal(3600 * 1000 * 24 );
        System.out.println(b.multiply(dayMilli).longValue() + time);
    }
}
