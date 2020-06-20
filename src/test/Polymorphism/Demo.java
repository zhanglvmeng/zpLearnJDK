package test.Polymorphism;

public class Demo extends ParentDemo {

    @Override
    public void write() {
        System.out.println("children write");
    }

    public static void main(String[] args) {
        ParentDemo[] parentDemos = {new ParentDemo(), new Demo()};
        for (ParentDemo parentDemo : parentDemos) {
            parentDemo.write();
        }
    }
}

class ParentDemo {
    public void write() {
        System.out.println("parent write");
    }
}
