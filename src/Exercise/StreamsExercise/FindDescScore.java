package Exercise.StreamsExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int score;

    public Student() {}

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
public class FindDescScore {
    public static void main(String[] args) {
        // Problem 1: Find Top Scorers

        List<Student> students = new ArrayList<>();

        students.add(new Student("Barun", 99));
        students.add(new Student("Anubhav", 89));
        students.add(new Student("Shahasin", 78));
        students.add(new Student("Aayush", 55));

        List<String> collect = students
                .stream()
                .filter(x -> x.getScore() > 80)
//                .sorted((x, y) -> (y.getScore() - x.getScore())) // desc
                .sorted(Comparator.comparing(Student::getScore).reversed()) // desc
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
