package test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldReflectionDemo {

    public static void main(String[] args) throws Exception{
        setAndGetField();
    }

    /**
     * 设置和读取字段的值
     */
    public static void setAndGetField() {
        try {
            Person p = new Person("a");
            Class c = p.getClass();
            Field f = c.getDeclaredField("name");
            f.setAccessible(true);
            Object value = f.get(p);
            System.out.println(value);
            f.set(p, "bbbb");
            System.out.println(f.get(p));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    /**
//     * 获取字段
//     * @throws Exception
//     */
//    public static void testGetField() throws Exception{
//        Class cls = Student.class;
//        // 子类的score
//        System.out.println(cls.getField("score"));
//        // 继承的name
//        System.out.println(cls.getField("name"));
//        // 子类私有的grade
//        System.out.println(cls.getDeclaredField("grade"));
//    }

//    /**
//     * 获取字段的值
//     */
//    public static void testGetFieldValue () {
//        Person p = new Person("");
//    }
//
//    /**
//     * 获取字段详情
//     * @throws Exception
//     */
//    public static void testGetFieldDetail (Class cls, String field) throws Exception {
//        Class c = cls;
////        Field f2 = c.getField(field);
//        Field f = c.getDeclaredField(field);
//        int m = f.getModifiers();
//        System.out.println("m: " + m);
//        System.out.println("isFinal: " + Modifier.isFinal(m));
//        System.out.println("isPublic: " + Modifier.isPublic(m));
//        System.out.println("isProtected: " + Modifier.isProtected(m));
//        System.out.println("isPrivate: " + Modifier.isPrivate(m));
//        System.out.println("isStatic: " + Modifier.isStatic(m));
//
//    }
//
//    class Student extends Person {
//        public int score;
//        private int grade;
//
//        Student(String name) {
//            super(name);
//        }
//    }
//
//    class Person {
//        public String name;
//
//        Person(String name) {
//            this.name = name;
//        }
//    }
}
