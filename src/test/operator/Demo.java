package test.operator;

public class Demo {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
//        System.out.println(1==2);
//        System.out.println(a);
//        int i = 1;
//        System.out.println(i = 3);
//        System.out.println(a = (1==2));
        boolean res = (a = (2 == 2)) && (b = (1 == 2));
        System.out.println(a);
        System.out.println(b);
        System.out.println(res);
    }
}
