package test.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        // 入队
        q.add(10);
        q.add(1);
        q.add(3);
        // 出队
        System.out.println(q.poll());
    }
}
