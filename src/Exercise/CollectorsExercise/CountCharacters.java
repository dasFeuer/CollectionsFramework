package Exercise.CollectorsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Problem 1: Count Characters by Type
public class CountCharacters {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('a', 'b', 'c', '1', '2', '3', '!', '@');
        Map<Boolean, List<Character>> result = chars.stream()
                .collect(Collectors
                        .partitioningBy
                                (x -> Character.isLetter(x)));
        System.out.print(result);
    }
}
