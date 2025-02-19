package Map;

import java.util.Hashtable;

public class theHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        // Hashtable is synchronized
        // No null key or value
        // Legacy, ConcurrentHashMap
        // Slower than HashMap
        // Only linked list in case of collision
        // All methods are synchronized
        hashtable.put(1, "Apple");
        hashtable.put(2, "Kiwi");
        hashtable.put(3, "Watermelon");
        System.out.println(hashtable);
        System.out.println("Value of key 2: " + hashtable.get(2));
        System.out.println("Does key 3 exists? " + hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("After removing key 1: " + hashtable);
//        hashtable.put(null, "value"); // Throws exception
//        hashtable.put(4, null); // Throws exception

        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap: " + map.size());
    }
}
