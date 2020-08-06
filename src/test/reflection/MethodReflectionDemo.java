package test.reflection;

import java.lang.reflect.Method;

public class MethodReflectionDemo {

    public static void main(String[] args) {
        try {
            invokeExtendsMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 方法详情
     * @throws Exception
     */
    public static void methodDetail () throws Exception{
        Class stdClass = Student.class;

        System.out.println(stdClass.getMethod("getScore", String.class));

        System.out.println(stdClass.getMethod("getName"));

        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }

    /**
     * 调用方法
     * @throws Exception
     */
    public static void invokedMethod() throws Exception {
        String s = "abcdefgh";

        Method m = String.class.getMethod("substring", int.class, int.class);

        String r = (String) m.invoke(s, 0, 2);

        System.out.println(r);
    }

    /**
     * 调用静态方法
     * @throws Exception
     */
    public static void invokeStaticMethod() throws Exception {
        // 获取Integer.parseInt(String)方法，参数为String:
        Method m = Integer.class.getMethod("parseInt", String.class);
        // 调用该静态方法并获取结果:
        Integer n = (Integer) m.invoke(null, "12345");
        // 打印调用结果:
        System.out.println(n);
    }

    /**
     * 调用非public方法
     * @throws Exception
     */
    public static void invokeNoPublicMethod() throws Exception {
        Person p = new Person("");
        Method m = p.getClass().getDeclaredMethod("setName", String.class);
        m.setAccessible(true);
        m.invoke(p, "Bob");
        System.out.println(p.getName());
    }

    /**
     * 多态
     * @throws Exception
     */
    public static void invokeExtendsMethod() throws Exception {
        Method h = Person.class.getMethod("hello");
        h.invoke(new Student());
    }

}
