package test.Number.Byte;

public class Demo {

    public static void main(String[] args) {
        Byte b = new Byte("1");
        System.out.println(b);

        String b2 = "2";
        System.out.println(Byte.parseByte(b2));
    }
}
