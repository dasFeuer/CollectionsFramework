package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.SocketHandler;

public class theComparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ben", 3.5));
        list.add(new Student("Gwen", 3.9));
        list.add(new Student("Max", 3.8));
        list.add(new Student("Kevin", 3.1));
        list.sort(null);
        System.out.println(list);
    }
}
