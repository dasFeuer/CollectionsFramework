package Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
         /*
    Set is a collection that cannot contain duplicate elements
    Fast operations
    Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
    Set --> HashSet, LinkedHashSet, TreeSet, EnumSet
     */

//        Set<Integer> set = new HashSet<>(); // Unordered
//        Set<Integer> set = new LinkedHashSet<>(); // ordered but not sorted
        Set<Integer> set = new TreeSet<>(); // sorted
        set.add(11);
        set.add(7);
        set.add(7);
        set.add(61);
        System.out.println(set);
        System.out.println(set.contains(11));
        System.out.println(set.remove(61));
//        set.clear();
//        System.out.println(set.isEmpty());

        for(int i : set) {
            System.out.print(i + " ");
        }

        // For thread safety
        Set<Integer> set1 = new ConcurrentSkipListSet<>();

        // Unmodifiable
        Set<Integer> integers = Set.of(1, 2, 5, 7, 8, 9, 22, 77, 99, 719, 963, 1122, 7798);

    }
}
