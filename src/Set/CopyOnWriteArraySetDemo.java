package Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {

        /*
        Thread safe
        Copy-On-Write Mechanism
        No Duplicate Elements
        Iterators Do Not Reflect Modifications
         */

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 0; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteArraySet);
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");


        for(Integer num : copyOnWriteArraySet){
            System.out.println("Reading from CopyOnWriteArraySet: " + num);

            // Attempting to modify the set during iteration
            copyOnWriteArraySet.add(6);
        }

        System.out.println(copyOnWriteArraySet);

        for(Integer num : concurrentSkipListSet){
            System.out.println("Reading from ConcurrentSkipListSet: " + num);

            // Attempting to modify the set during iteration
                concurrentSkipListSet.add(6);
        }
    }
}
