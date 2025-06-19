package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        /*
        enqueue -> add/offer
        dequeue -> remove/poll
        peek -> peek/element
         */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.size());
        System.out.println(queue.remove()); // throws exception if empty
        System.out.println(queue.poll()); // better

        System.out.println(queue.element()); // throws exception if empty
        System.out.println(queue.peek());

        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1)); // true
        System.out.println(queue1.offer(2)); //true

        System.out.println(queue1.add(2)); // throws exception
        System.out.println(queue1.offer(3)); // false
    }
}
