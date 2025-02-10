package Map;

import java.util.*;

public class theHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Computers");
        map.put(2, "CPU");
        map.put(3, "GPU");
        map.put(4, "AI");
        System.out.println(map);

        String item = map.get(2);
        System.out.println(item);
        String str = map.get(11);
        System.out.println(str);

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("AI"));

        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

//        map.remove(3);

        boolean res = map.remove(2,"Camera");
        System.out.println("REMOVED ? : " + res);
        System.out.println(map);

        List<Integer> list = Arrays.asList(2, 4, 5, 77, 9);
        list.contains(77);
    }
}
