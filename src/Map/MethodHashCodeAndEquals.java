package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}

public class MethodHashCodeAndEquals {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person person1 = new Person("Maria", 1);
        Person person2 = new Person("Carl", 2);
        Person person3 = new Person("Ben", 1);

        map.put(person1, "Programmer"); // hashcode1 --> index1
        map.put(person2, "Manager"); // hashcode2 --> index2
        map.put(person3, "Designer"); // hashcode1 --> index1 --> equals --> replace

        System.out.println("HashMap Size: " + map.size());
        System.out.println("Value for p1: " + map.get(person1));
        System.out.println("Value for p3: " + map.get(person3));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Leo", 90); // hashcode1 --> index1
        map1.put("Sophia", 92); // hashcode2 --> index2
        map1.put("Noah", 99); // hashcode1 --> index1 --> equals() --> replace

    }
}
