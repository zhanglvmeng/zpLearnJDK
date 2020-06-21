package test.Polymorphism;

public class DynamicDispatch {

    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {
        @Override
        protected void sayHello() {
            System.out.println("Man say hello");
        }
    }

    static class Woman extends Human {
        @Override
        protected void sayHello() {
            System.out.println("Woman say hello");
        }
    }

    public static void main(String[] args) {
//        Human man = new Man();
//        Human woman = new Woman();
//        man.sayHello();
//        woman.sayHello();
//        man = new Woman();
//        man.sayHello();

        String s = "中国人";
        System.out.println(s.length());
        System.out.println(s.codePointCount(0, s.length()));

    }
}
