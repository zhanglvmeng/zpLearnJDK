package test.tryCatchFinally;

public class FinallyDemo {

    public static void main(String[] args) {
        System.out.println("not work: " + finallyNotWork());
        System.out.println("work: " + finallyWork());
    }

    /**
     * 返回了暂存值  10001
     * @return
     */
    public static int finallyNotWork() {
        int temp = 10000;

        try {
            throw  new Exception();
        } catch (Exception e) {
            return ++temp;
        } finally {
            temp = 99999;
        }
    }

    /**
     * 在finally 中使用了return， 非常不推荐使用这种用法。
     *  返回了finally 的值   99999,
     * @return
     */
    public static int finallyWork() {
        int temp = 10000;

        try {
            throw  new Exception();
        } catch (Exception e) {
            return ++temp;
        } finally {
            temp = 99999;
            return temp;
        }
    }
}
