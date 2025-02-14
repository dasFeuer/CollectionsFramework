package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

import java.util.Map;
public class theLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true); // Double linked list
        linkedHashMap.put("Apple", 11);
        linkedHashMap.put("Kiwi", 14);
        linkedHashMap.put("Mango", 12);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Kiwi");
        linkedHashMap.get("Mango");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Kiwi");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Mango");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Noah", 91);
        hashMap.put("Maria", 94);
        hashMap.put("Carl", 98);

        Integer res = hashMap.getOrDefault("Ben", 0);
        hashMap.put("Noah", 92);
        System.out.println(hashMap);
    }
}
