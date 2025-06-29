package Exercise.CollectorsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int salary;
    private String department;

    public Employee () {}

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "\n  Name: " + name +
                ", Salary: " + salary +
                ", Department: " + department;
    }


}
public class GroupEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Barun", 98000, "IT"));
        employees.add(new Employee("Kriti", 98000, "Marketing"));
        employees.add(new Employee("Shahasin", 67000, "Training"));
        employees.add(new Employee("Anubhav", 98000, "IT"));
        employees.add(new Employee("Sneha", 77000, "Marketing"));
        employees.add(new Employee("Aditi", 67000, "Training"));
        employees.add(new Employee("Eric", 98000, "IT"));

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        Map<String, List<Employee>> collect = employees
                .stream()
                .collect(Collectors
                        .groupingBy
                                (Employee::getDepartment));
        collect.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(System.out::println);
            System.out.println();// for spacing
        });
    }
}
