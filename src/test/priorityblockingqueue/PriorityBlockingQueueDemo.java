package test.priorityblockingqueue;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {


    public static void main(String[] args) {
        Queue<String> q = new PriorityBlockingQueue<>();
        q.add("3");
        q.add("2");
        q.add("4");

        for (String s : q) {
            System.out.println(s);
        }
    }
}
