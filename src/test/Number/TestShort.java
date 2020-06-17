package test.Number;

public class TestShort {

    public static void main(String[] args) {
        Short s = 1;
        System.out.println(s);

        Short s2 = 1;
        System.out.println(Short.valueOf(s2));

        // cache 的问题，所以相等
        System.out.println(s == s2);

        // cache 之外的数据，不相等。
        Short s3 = 1000;
        Short s4 = 1000;
        System.out.println(s3 == s4);
        // equals 相等。
        System.out.println(s3.equals(s4));


    }
}
