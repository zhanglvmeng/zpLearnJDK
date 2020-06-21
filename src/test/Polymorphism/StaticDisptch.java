package test.Polymorphism;

public class StaticDisptch {
    static abstract class Human {

    }

    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human guy) {
        System.out.println("hello human");
    }


    public void sayHello(Man guy) {
        System.out.println("hello man");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello woman");
    }

    /**
     * 静态分派，静态类型 在编译期间就决定类型了，所以 返回的结果都是 hello human
     * 静态分派，相当于Java中重载的体现
     * @param args
     */
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDisptch sd = new StaticDisptch();
        sd.sayHello(man);  // hello human
        sd.sayHello(woman); // hello human
    }
}
