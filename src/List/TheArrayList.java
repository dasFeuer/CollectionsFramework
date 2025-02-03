package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(1); // --> 0
        list.add(22);// --> 1
        list.add(94);// --> 2

        System.out.println(list.get(2));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int a : list) {
            System.out.println(a);
        }

        System.out.println(list.contains(94)); // --> true
        System.out.println(list.contains(7));// --> false\

        list.set(2, 55); // --> Integer in index 2 will be replaced from 94 to 55;
        for (int a : list) {
            System.out.println(a);
        }
        // oR
        System.out.println(list);

        list.remove(2);

        for (int a : list) {
            System.out.println(a); // --> remove index 2 i.e 94
        }

        list.add(1, 77);
        for (int a : list) {
            System.out.println(a); // --> insert element in index 1 i.e 77
        }

        List<String> stringList = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1, "Wednesday");
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list3 = new ArrayList<>(list2);
        list3.add("Mango");
        System.out.println(list3);
    }
}
