package test.ideakey;

public class SuperImpl implements SuperInterface {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SuperImpl{");
        sb.append('}');
        return sb.toString();
    }

    public SuperImpl() {
    }

    @Override
    public void testa() {
        System.out.println("test");
        test2("", "");
        String s3 = test3("", "");
    }

    private void test2(String s, String s1) {
    }

    private String test3(String s, String s1) {
        return "";
    }


    //    aaaaa
    public static void main(String[] args) {
        SuperImpl s = new SuperImpl();
        s.testa();
    }


}