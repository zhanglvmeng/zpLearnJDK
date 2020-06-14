package test.Number;

import java.math.BigDecimal;

public class TestFloat {

    public static void main(String[] args) {
        testHashcodeAndEqual();
    }

    private static void testHashcodeAndEqual() {
        Float f = 4.905f;
        System.out.println(f.hashCode());
        Float f2 = 4.905f;
        System.out.println(f.equals(f2));
    }

    /**
     * float 跟其他类型的转换。只有转double 是扩大，转其他类型，比如long byte int 都是缩小精度。
     */
    private static void testCastTrans() {
        Float floatNumber= 4.95f;
        Double doubleNumber= floatNumber.doubleValue();

        System.out.println(doubleNumber);

        Long longNumber = floatNumber.longValue();
        System.out.println(longNumber);

    }

    private static void testAccuracy() {
        float a = 1;
        float b = 2;
        float c = 3;
        if (c == a + b) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        float a1 = 0.1f;
        float a2 = 0.2f;
        float a3 = 0.3f;
        System.out.println(a1 + a2);
        if (a3 == a1 + a2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    /**
     * 获取浮点数的一些基础信息
     */
    private static void getBasicInfo() {
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
     * 既然0.25 可以精确（0.01）表示，为什么乘以86400 000 之后，还是有误差呢？
     * 这是因为 乘法之后，也是要经过舍入操作的。具体可以参考下 组成原理里面的数值。
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
