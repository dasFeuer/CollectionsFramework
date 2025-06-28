package Exercise.CollectorsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem 2: Group Cities by Starting Letter
public class GroupCities {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Berlin", "Barcelona", "Munich", "Madrid", "Bonn");
        Map<Character, List<String>> collect = cities
                .stream()
                .collect(Collectors
                        .groupingBy
                                (city -> city.charAt(0)));

        System.out.println(collect);

    }
}
