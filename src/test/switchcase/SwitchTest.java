package test.switchcase;

public class SwitchTest {
    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 2:
                System.out.println("print 2");
                break;
            case 3:
                System.out.println("print 3");
                break;
            default:
                System.out.println("default");
                break;
            case 1:
                System.out.println("print 1");
        }

        String param = null;
        switch (param) {
            case "param":
                System.out.println("print param");
                break;
            case "String":
                System.out.println("String");
                break;
            case "null":
                System.out.println("print null");
                break;
            default:
                System.out.println("default");
        }
    }
}
