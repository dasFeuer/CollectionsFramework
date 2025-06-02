package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Grade: " + grade + ")";
    }
}
public class exercise2Comparator {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Emma", 20, 3.5));
        students.add(new Student("Charlie", 22, 3.8));
        students.add(new Student("Ulrich", 21, 3.9));

        /*
        1. Comparator.comparing()
         When to Use:
         When you want to sort objects by a specific field (e.g., name, age, grade).
         */
        //  Sort students by name alphabetically
        students.sort(Comparator.comparing(student -> student.name));

        // This is similar to: Comparator<Student> comp = (s1, s2) -> s1.name.compareTo(s2.name);



        /*
        2. Method Reference (Class::method)
           When to Use:
           When you're calling a getter or method on the object in the comparator — this makes code cleaner.
         */

        // Sort by name, using method reference
        students.sort(Comparator.comparing(Student::getName));

        //Same as: students.sort(Comparator.comparing(s -> s.getName()));


        /*
        3. Chained Comparators (.thenComparing())
        When to Use:
        When you need secondary sorting — i.e., tie-breaker logic.
         */

        //Sort by grade (desc), then age (asc)

        students.sort(
                Comparator.comparingDouble((Student s) -> s.grade).reversed()
                        .thenComparingInt(s -> s.age)
                        .thenComparing(s -> s. name) // Optional: then by name alphabetically
        );

        /*
        This:

        First compares by grade (highest first)
        If two grades are equal, compares by age (youngest first)
         */

        // You can chain more: .thenComparing(s -> s.name)

        /*
        4. Lambda Expressions
        When to Use:
        When writing inline comparators or custom rules not covered by Comparator.comparing().
         */

        // Sort by age descending using lambda
        students.sort((s1, s2) -> s2.age - s1.age);

        // Or for more complex logic:
        /*
        students.sort((s1, s2) -> {
            if (s1.grade != s2.grade) {
                return Double.compare(s2.grade, s1.grade);
            } else {
                return Integer.compare(s1.age, s2.age);
            }
        });
         */

        // Combined Example: Sort by grade (desc), then age (asc), then name (asc)
        students.sort(
                Comparator.comparingDouble((Student s) -> s.grade).reversed()
                        .thenComparingInt(s -> s.age)
                        .thenComparing(s -> s.name)
        );

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }

        students.forEach(System.out::println);
    }
}

