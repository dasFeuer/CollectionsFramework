package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class theStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        System.out.println(integerStack);
        Integer removedElement = integerStack.pop();
        System.out.println(removedElement);
        Integer peek = integerStack.peek();
        System.out.println(peek);
        System.out.println(integerStack);
        System.out.println(integerStack.isEmpty());
        System.out.println(integerStack.size());

        int search = integerStack.search(3);
        System.out.println(search);

        // LinkedList as Stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.getLast(); // peek
        linkedList.removeLast(); // pop
        linkedList.size();
        linkedList.isEmpty();
        System.out.println(linkedList);

        // ArrayList as Stack
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1); // peek
        arrayList.remove(arrayList.size() - 1); // pop
        System.out.println(arrayList);
    }
}
