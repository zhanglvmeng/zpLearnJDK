package test.Enum;

public enum TestStatus {

    // 枚举类变量
    ONLINE(1),
    OFFLINE(2),
    OTHER(3, "其他");

    private int status;
    private String value;

    TestStatus(int status) {
        this.status = status;
    }

    TestStatus(int status, String value) {
        this.status = status;
        this.value = value;
    }

    public static void main(String[] args) {
//        TestStatus t = TestStatus.ONLINE;
//        TestStatus t2 = TestStatus.ONLINE;
//        TestStatus t3 = TestStatus.OFFLINE;
//
//        System.out.println(t == t2);
//
//        System.out.println(t.equals(t2));
//
//        System.out.println(t2 == t3);

        for (TestStatus testStatus : TestStatus.values()) {
            System.out.println("name:" + testStatus.name());
            System.out.println("order: " + testStatus.ordinal());
//            System.out.println(testStatus.status);
//            System.out.println(testStatus.value);
        }
        System.out.println("switch..................");
        TestStatus testStatus = TestStatus.OFFLINE;
        switch (testStatus) {
            case ONLINE:
                System.out.println("online.....");
                break;
            case OTHER:
                System.out.println("other.....");
                break;
            case OFFLINE:
                System.out.println("offline.....");
                break;
            default:
                System.out.println("default.....");
        }
    }
}
