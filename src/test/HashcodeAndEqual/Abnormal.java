package test.HashcodeAndEqual;

import java.util.ArrayList;
import java.util.List;

public class Abnormal {

    public static void main(String[] args) {
        String a = "张鹏a测试一下aaa";
        System.out.println(a.length());
        System.out.println(a.substring(0, 200));
//
//        List<A> list = new ArrayList<A>();
//        A a = new A();
//        B b = new B();
//        list.add(a);
//        System.out.println("list.contains(a)->" + list.contains(a));
//        System.out.println("list.contains(b)->" + list.contains(b));    // 在重写1 的情况下返回false.  在重写2 的情况下返回true.
//        list.clear();
//        list.add(b);
//        System.out.println("list.contains(a)->" + list.contains(a));   // 在重写1 的情况下返回true.   在重写2 的情况下返回true.
//        System.out.println("list.contains(b)->" + list.contains(b));
    }
    static class A {
        @Override
        public boolean equals(Object obj) {
            return obj instanceof A;
        }
    }
    static class B extends A {
        @Override
        /**  重写1
         * 返回结果
         * list.contains(a)->true   可以理解
         * list.contains(b)->false    这一行  跟  下面一行的结果，都不存在，为什么结果还不一样呢？
         * list.contains(a)->true
         * list.contains(b)->true  可以理解
         */
        public boolean equals(Object obj) {
            boolean b = obj.getClass() == B.class;
            return obj instanceof B;

        }

        /** 重写2
         * 返回结果
         * list.contains(a)->true
         * list.contains(b)->true
         * list.contains(a)->true
         * list.contains(b)->true
         */
//        public boolean equals(Object obj) {
//            if(obj instanceof B){
//                return true;
//            }
//            return super.equals(obj);
//        }


    }
}
