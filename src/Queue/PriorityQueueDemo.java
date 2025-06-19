package Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for the primitive lowest first)
        // customs comparator for customized ordering
        // does not allow null

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // desc order
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> x - y); // asce order
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> y - x); // desc order

        priorityQueue.add(14);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(77);
        priorityQueue.add(91);
        System.out.println(priorityQueue); // not sorted

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        // internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)

    }
}
