package Map;

import java.util.Map;

public class EnumMap {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Map<Day, String> map = new java.util.EnumMap<>(Day.class);
        map.put(Day.MONDAY, "Code");
        map.put(Day.THURSDAY, "Project");
        String string = map.get(Day.MONDAY);
        System.out.println(map);
        System.out.println(string);
    }
}
