package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class theImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("C", 3); // Throws exception

        Map<String, Integer> map3 = Map.of("Apple", 87, "Kiwi", 95);
        map3.put("Mango", 91);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Mango", 99), Map.entry("Kiwi", 100));
    }
}
