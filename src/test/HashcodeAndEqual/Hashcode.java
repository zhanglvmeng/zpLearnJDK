package test.HashcodeAndEqual;

public class Hashcode {

    public static void main(String[] args) {
        int hash = 0;
        String s = "ok";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());  // 3548 1639705018

        String t = new String("ok");
        StringBuilder sb2 = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + sb2.hashCode()); // 3548 1627674070
    }
}
