package Exercise.StreamsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    // Problem 1: Filter Even Numbers and Square Them
    // Goal:
    // From a list of integers, filter only even numbers, square them, and collect the result into a list.
public class PrintEvenAndCountNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);
        List<Integer> result = numbers.stream().
                filter(x -> x % 2 == 0) // keep even numbers
                .map(n -> n * n) // square each number
                .collect(Collectors.toList()); // collect to list
        System.out.println(result);

        // Problem 2: Count Words Starting With a Specific Letter

        //Goal:
        //Given a list of words, count how many start with the letter 'C' (case-insensitive).
        List<String> words = Arrays.asList("computer", "Android", "Fruit", "Space", "Countries");
        long result1 = words.stream()
                .filter(x -> x.toLowerCase().startsWith("c")) // filter words starting with "c"
                .count(); // count them
        System.out.println(result1);
    }
}
