package test.Number;

public class TestInteger {

    public static void main(String[] args) {
        // valueOf 如果 value 值介于-128 ~ 127 之间，则从cache中获取元素，超过这个范围，则new 一个元素。
//        int a = Integer.valueOf(3);
//        System.out.println(Integer.toString(a, 2));

//        int b = 2;
//        System.out.println(Integer.toUnsignedString(b, 10));

//        String c = "-21";
//        System.out.println(Integer.parseInt(c, 10));

        System.out.println(Integer.valueOf("3").byteValue());

//        System.out.println(Integer.TYPE);

//        // valueOf 如果 value 值介于-128 ~ 127 之间，则从cache中获取元素，超过这个范围，则new 一个元素。
//        long l = Long.valueOf(1);
//
//        byte b = 1;
//        Byte.valueOf(b);
    }
}
