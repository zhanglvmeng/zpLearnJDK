package test.Lock;

import java.util.concurrent.atomic.AtomicInteger;

public class CAS {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndIncrement();
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);
    }
}
