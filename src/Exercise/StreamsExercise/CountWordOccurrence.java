package Exercise.StreamsExercise;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurrence {
    public static void main(String[] args) {
        String sentence = "apple banana apple orange banana apple";
        Map<String, Integer> counts = Arrays.stream(sentence.split(" "))
                .collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println(counts);
    }
}
