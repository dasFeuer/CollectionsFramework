package Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class theIdentityHashMap {
    public static void main(String[] args) {
        String key1 = "key";
        String key2 = "key";
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
//        System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}
