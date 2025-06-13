package Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Faster than HashMap
    // Memory efficient
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY, "Code");
        map.put(Day.THURSDAY, "Project");
        String string = map.get(Day.MONDAY);
        System.out.println(map);
        System.out.println(string);
    }
}
