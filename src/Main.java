import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ben", 3.5));
        students.add(new Student("Gwen", 3.9));
        students.add(new Student("Max", 3.8));
        students.add(new Student("Kevin", 3.1));


//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa); // aces
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed(); // desc
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName); // sort according to name and then GPA

//        students.sort((o1, o2) -> (int) (o2.getGpa() - o1.getGpa()));

        students.sort((o1, o2) -> {
            if(o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }); //desc

//        Collections.sort(students, comparator);

        students.sort(comparator);


        for(Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }


    }
}