package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // asce
//        return s2.length() - s1.length(); // desc
    }
}

class myComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;// asce
//        return o2 - o1;// desc
    }
}

public class theComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(1);

//        list.sort(null); // asce order default method to sort according to the length of the Integer
//        list.sort(new myComparator()); // sort according to the length of the Integer
        list.sort((a, b) -> b - a); // // desc order with lambda expression sort according to the length of the Integer
        System.out.println(list);

        List<String> words = Arrays.asList("pomegranate", "pineapple", "orange");
//        words.sort(new StringLengthComparator()); // sort according to the length of the string
        words.sort((a, b) -> b.length() - a.length()); // desc order with lambda expression sort according to the length of the string
        System.out.println(words);
    }
}
