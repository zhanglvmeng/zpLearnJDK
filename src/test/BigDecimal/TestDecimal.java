package test.BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class TestDecimal {

    public static void main(String[] args) {
//        testBasicUsage();
//        getScales();
//        testArithmetic();
//        testEquals();
        testScaleAndPrecision();
    }

    public static void testScaleAndPrecision() {
        BigDecimal bigDecimal2 = new BigDecimal(new BigInteger("100"), 1);
        System.out.println(bigDecimal2);

    }

    /**
     * 比较相等的情况。 如果使用equals， 不但要求两个bigdecimal 的值相等，还要求他们的scale() 相等。 所以建议使用compareTo 方法。
     */
    public static void testEquals() {
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.10");
        System.out.println(b1.equals(b2));  // false

        System.out.println(b1.equals(b2.stripTrailingZeros()));  // b2 已经去掉了末尾的0， 所以精度上跟b1 相同，所以返回了true.

        System.out.println(b1.compareTo(b2));
    }

    /**
     * 四则运算
     */
    public static void testArithmetic() {
        BigDecimal d1 = new BigDecimal("123.456");
        BigDecimal d2 = new BigDecimal("23.456789");
        BigDecimal d4 = d1.divide(d2, 10, RoundingMode.HALF_UP);
        System.out.println(d4);
//        BigDecimal d3 = d1.divide(d2);  // 没有指定精度，所以抛异常。
//        System.out.println(d3);

        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 商
        System.out.println(dr[1]); // 余数


    }

    /**
     * 测试基本用法
     */
    public static void testBasicUsage() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        BigDecimal b = new BigDecimal("-1");
        System.out.println(b);

        // 不精确
        Double d = 0.01;
        BigDecimal bigDecimal = new BigDecimal(d);
        System.out.println(bigDecimal);

        // 精确
        BigDecimal bigDecimal1 = new BigDecimal(Double.toString(d));
        System.out.println(bigDecimal1);
    }

    /**
     * 获取精度
     */
    public static void getScales() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement stackTraceElement : stackTraceElements) {
//            System.out.println(stackTraceElement.getMethodName());
//        }
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        BigDecimal d1 = new BigDecimal("123.45");
        System.out.println(d1.scale());  // 2

        BigDecimal d2 = new BigDecimal("12300");
        System.out.println(d2.scale()); // 0
        BigDecimal d5 = d2.stripTrailingZeros();

        // 经过stripTrailingZeros 数字的值并没有改变
        System.out.println(d5.toString()); // 1.23E+4
        System.out.println(d5.scale()); // -2

        BigDecimal d3 = new BigDecimal("123.2300");
        System.out.println(d3.scale()); // 4
        BigDecimal d4 = d3.stripTrailingZeros();
        System.out.println(d4.scale()); // 2
    }

}
