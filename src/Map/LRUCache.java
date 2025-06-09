package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size() > capacity; // remove the oldest if over capacity
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<String, Integer>(3);
        studentMap.put("Sophia", 89);
        studentMap.put("Ben", 99);
        studentMap.put("Carl", 82);
        studentMap.put("Maira", 71);
        studentMap.put("Noah", 87);

        System.out.println(studentMap);
    }
}
