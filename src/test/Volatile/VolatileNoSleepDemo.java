package test.Volatile;

import java.util.logging.Logger;

/**
 *  案例一：有volatile，有static, 无sleep
 *  * 案例一跟二对比，主要是突出volatile的用途。一个线程的修改可以里面反映到另外一个线程。
 * * 案例二跟三对比，主要是突出volatile 跟static 的对比。static 是类实例之间的变量共享，volatile 是线程间变量共享。
 * 二者不是一个维度的事情。static 虽然是实例之间共享变量，但是也是每个线程先放在本地内存，过段时间才同步到主内存，才会被另外一个线程读到。
 * 这也就是为什么不sleep的时候读不到结果，而加了sleep之后，就可以读到1-5的变化了。
 *
 *  参考文献地址  https://dzone.com/articles/java-volatile-keyword-0
 *  除了volatile变量，还对共享变量进行了实验。
 *
 */
public class VolatileNoSleepDemo {

    // volatile变量
    private static volatile int MY_INT = 0;
    // 共享变量
    private static String a = "";

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    System.out.println("Got Change for MY_INT : " + MY_INT);
                    System.out.println("Got Change for a : " + a);
                    local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                int myint = local_value + 1;
                a = "aaaa" + myint;
                System.out.println("Incrementing MY_INT to " + (local_value+1));
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}
