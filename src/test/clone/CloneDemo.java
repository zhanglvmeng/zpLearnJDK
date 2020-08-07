package test.clone;

public class CloneDemo {

    public static void main(String[] args) throws Exception {
//        testCopy();
//        testClone();
        testDeepClone();
    }

    /**
     * 复制对象
     */
    public static void testCopy (){
        Person p = new Person(1, "aaa");
        Person p1 = p;

        System.out.println(p == p1); // true
        System.out.println(p.getAge() == p1.getAge()); // true
        System.out.println(p.getName().hashCode() == p1.getName().hashCode()); // true
    }

    /**
     * 浅拷贝
     */
    public static void testClone() {
        Person p = new Person(1, "aaa");
        try {
            Person p1 =(Person) p.clone();
            System.out.println(p == p1); // false
            System.out.println(p.getAge() == p1.getAge()); // true
            System.out.println(p.getName().hashCode() == p1.getName().hashCode()); // true
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 深拷贝
     */
    public static void testDeepClone() throws Exception {
        Body body = new Body(new Head(new Face()));

        Body body1 = (Body) body.clone();

        System.out.println("body == body1 : " + (body == body1) ); // false

        System.out.println("body.head == body1.head : " +  (body.head == body1.head)); //false

        System.out.println("body.head.face == body1.head.face : " +  (body.head.face == body1.head.face)); // face
    }

}
