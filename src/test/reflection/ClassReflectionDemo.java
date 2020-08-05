package test.reflection;

public class ClassReflectionDemo {

    public static void main(String[] args) throws Exception {

//        String s = "a";
//        getClassDetail(s.getClass());

        int i = 1;
        getClassDetail(int.class);

    }

    /**
     * 获取class 测试
     */
    public static void getClasss()  {
        Class cls = String.class;
        System.out.println(cls.getClass());

        // 实例变量，获取对应的类名
        String s = "Hello";
        System.out.println(s.getClass());

        Class cls2 = null;
        try {
            cls2 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(cls2);
    }

    /**
     * instanceOf 与 == 在反射这部分的用法。
     * 用instanceof不但匹配指定类型，还匹配指定类型的子类。而用==判断class实例可以精确地判断数据类型，但不能作子类型比较。
     */
    public static void testInstanceOfAndEqual() {
        Integer n = new Integer(123);

        boolean b1 = n instanceof Integer;
        boolean b2 = n instanceof Number;

        boolean b3 = n.getClass() == Integer.class;

//        boolean b4 = n.getClass() == Number.class;  // Error:(44, 35) java: 不可比较的类型: java.lang.Class<capture#1, 共 ? extends java.lang.Integer>和java.lang.Class<java.lang.Number>

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }


    public static void getClassDetail(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }

        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is Array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }

}
