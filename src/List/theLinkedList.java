package List;

import java.util.Arrays;
import java.util.LinkedList;

public class theLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(0);
        linkedList.addLast(4);
        System.out.println(linkedList);

        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> smartPhones = new LinkedList<>(Arrays.asList("Samsung","G-Pixel", "Apple", "Redmi", "Nokia" ));
        LinkedList<String> smartPhonesToRemove = new LinkedList<>(Arrays.asList("Vivo", "Realme" ));
        smartPhones.removeAll(smartPhonesToRemove);

        System.out.println(smartPhones);

    }
}
