package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        //  a double-ended queue
        //  allows insertion and removal of elements from both ends
        //  versatile than regular queues and stacks because they support all the operations of both

          /*
           INSERTION METHODS

           addFirst(E e): Inserts the specified element at the front.
           addLast(E e): Inserts the specified element at the end.
           offerFirst(E e): Inserts the specified element at the front if possible.
           offerLast(E e): Inserts the specified element at the end if possible.

           */


            /*

           REMOVAL METHODS

            removeFirst(): Retrieves and removes the first element.
            removeLast(): Retrieves and removes the last element.
            pollFirst(): Retrieves and removes the first element or returns null if empty.
            pollLast(): Retrieves and removes the last element or returns null if empty.

           */

        /*

           EXAMINATION METHODS

            getFirst(): Retrieves, but does not remove, the first element.
            getLast(): Retrieves, but does not remove, the last element.
            peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
            peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.

           */

        /*

           STACK METHODS

            push(E e): Adds an element at the front (equivalent to addFirst(E e)).
            pop(): Removes and returns the first element (equivalent to removeFirst())..

           */

        Deque<Integer> deque = new ArrayDeque<>(); // Faster Iteration, Low Memory, No Null-Allowed
        // circular, head and tail
        // no need to shift elements, just shift head and tail
        deque.addFirst(10); // head --
        deque.addLast(9);
        deque.offerFirst(15);
        deque.offerLast(1);

        // 1, 9, 10, 15
        System.out.println(deque);
        System.out.println("First Element: " + deque.getFirst()); // 15
        System.out.println("Last Element: " + deque.getLast()); // 1
        deque.removeFirst(); // Removes 15
        deque.pollLast(); // Removes 1

        // Current Deque: [10, 9]
        for(int num : deque){
            System.out.println(num);
        }

        Deque<Integer> deque1 = new ArrayDeque<>(); // Insertion, deletion somewhere in the middle

    }
}
