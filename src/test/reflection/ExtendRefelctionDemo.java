package test.reflection;

public class ExtendRefelctionDemo {

    public static void main(String[] args) {
        getInterface();
    }

    /**
     * 获取interface
     */
    public static void getInterface() {
        Class cls = Integer.class.getSuperclass();
        Class[] is = cls.getInterfaces();
        for (Class c : is) {
            System.out.println(c);
        }
    }

    /**
     * 获取父类
     */
    public static void getSuper() {
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n);
        Class o = n.getSuperclass();
        System.out.println(o);
        System.out.println(o.getSuperclass());
    }
}
