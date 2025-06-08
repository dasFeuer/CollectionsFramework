package Exercise.MapExercise;


import java.util.HashMap;

public class exercise1HashMap {
    public static void main(String[] args) {
        /*
        A HashMap is a data structure that allows you to store key-value pairs. It is part of Java’s Collections Framework and is not synchronized by default (not thread-safe).

        Analogy:
        Think of a HashMap like a real-life dictionary:
        You look up a word (key) to find its definition (value).
        You don't care about the order; you just care about fast access.

| Concept     | Description                                                                    |
| ----------- | ------------------------------------------------------------------------------ |
| **Key**     | Unique identifier. Ex: `Integer`, `String`                                     |
| **Value**   | Data associated with the key                                                   |
| **Hashing** | Keys are hashed internally to find their position in memory (very fast lookup) |
| **Nulls**   | One `null` key is allowed, and multiple `null` values                          |

| Use Case           | Description                                           |
| ------------------ | ----------------------------------------------------- |
| Student ID to Name | `Map<Integer, String>` like `123 → "Alice"`           |
| User Login         | `Map<String, String>` like `username → password hash` |
| Product catalog    | `Map<String, Double>` like `product name → price`     |
| Caching            | Store recently accessed results for faster retrieval  |

| Collection      | When to Use                                           |
| --------------- | ----------------------------------------------------- |
| `ArrayList`     | When you care about order and index-based access      |
| `HashSet`       | When you only need unique values (no keys)            |
| `HashMap`       | When you want fast key-based access (like dictionary) |
| `TreeMap`       | When you need keys in **sorted order**                |
| `LinkedHashMap` | If you need to preserve **insertion order**           |

⚠️ Things to Keep in Mind
HashMap is not thread-safe. For multi-threaded apps, use ConcurrentHashMap.
Keys must implement hashCode() and equals() correctly for expected behavior.
Order is not guaranteed (if you need order, use LinkedHashMap).
         */

        // Student marks
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Maria", 85);
        marks.put("Carl", 72);
        marks.put("Ben", 90);

        //Get marks
        System.out.println("Carl's Marks: " + marks.get("Carl"));

        // Check if a student exists
        System.out.println("Has Maria? " + marks.containsKey("Maria"));

        // Update
        marks.put("Ben", 80);

        // Remove student
        marks.remove("Carl");

        System.out.println("All Students and Marks: " + marks);


      /*
      🧠 Problem:
        Given a sentence, count how many times each word appears.

        💡 Why use HashMap?
        We need to associate each word (key) with its count (value).
       */

        String sentence = "apple banana apple orange banana apple";
        HashMap<String, Integer> frequency = new HashMap<>();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequencies " + frequency);

        /*
        ✅ 2. Student Grades System
        🧠 Problem:
        Store and retrieve students' grades by their names.

        💡 Why use HashMap?
        You need quick access to a student's grade using their name.
         */
        HashMap<String, Double> grades = new HashMap<>();

        grades.put("Alice", 88.5);
        grades.put("Bob", 72.0);
        grades.put("Charlie", 95.0);

        System.out.println("Bob's grade: " + grades.get("Bob"));

        // Update grade
        grades.put("Bob", 80.0);

        // List all
        for (String name : grades.keySet()) {
            System.out.println(name + " scored " + grades.get(name));
        }

        /*
        ✅ 3. Character Count in a String
        🧠 Problem:
        Count the number of times each character appears in a string.
         */

        String str = "hello world";

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // ignore spaces
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character counts: " + charCount);

    }
}
