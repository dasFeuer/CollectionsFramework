package Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class theConcurrentSkipListMap {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> concurrentSkipListMap = new ConcurrentSkipListMap<>();
        concurrentSkipListMap.put("Apple", 9);
        System.out.println(concurrentSkipListMap);
    }
}
