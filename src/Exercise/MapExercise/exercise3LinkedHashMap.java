package Exercise.MapExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
/*
✅ What is LinkedHashMap?
A LinkedHashMap is a HashMap with a predictable iteration order.

➕ It maintains a linked list of the entries.
So when you iterate over a LinkedHashMap, the order of elements is:

Insertion order (default), OR

Access order (if enabled using a constructor)

| Feature                    | LinkedHashMap                             |
| -------------------------- | ----------------------------------------- |
| Inherits from              | `HashMap`                                 |
| Maintains insertion order? | ✅ Yes                                     |
| Maintains access order?    | ✅ If `accessOrder=true` in constructor    |
| Allows `null` keys/values? | ✅ Yes                                     |
| Thread-safe?               | ❌ No (like `HashMap`)                     |
| Performance                | Similar to `HashMap`, but slightly slower |

 */
public class exercise3LinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of users and their scores: \n");
        int users = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < users; i++) {
            System.out.println("Name");
            String name = scanner.nextLine();            
            System.out.println("Score");
            int score = scanner.nextInt();
            
            scanner.nextLine(); // newLine
            scores.put(name, score);
        }

        System.out.println("\nScores in entry order:");
        List<String> keys = new ArrayList<>(scores.keySet());
        for (int i = 0; i < keys.size(); i++) {
            String name = keys.get(i);
            System.out.println(name + ": " + scores.get(name));
        }

        /*
        1. scores.keySet()
        This gets all the keys (i.e., names) from the LinkedHashMap.
        Since it's a LinkedHashMap, the keys are returned in the same order they were inserted.

        2. new ArrayList<>(scores.keySet())
        This converts the Set of keys into a List, so you can use a for loop with an index i.
         */

        /*
        | Feature          | `HashMap`    | `LinkedHashMap`                        |
| ---------------- | ------------ | -------------------------------------- |
| Maintains order? | ❌ No         | ✅ Yes                                  |
| Ordered by?      | ❌ None       | ✅ Insertion or Access                  |
| Use case         | Fast lookups | Predictable iteration                  |
| Memory cost      | Lower        | Slightly higher (linked list overhead) |

| Use Case                            | Why LinkedHashMap?                   |
| ----------------------------------- | ------------------------------------ |
| Caching recently accessed items     | Use access order (`true`)            |
| Remembering the order of form input | Use insertion order (`false`)        |
| Building simple LRU Cache           | `removeEldestEntry()` + access order |
| Display items in the order added    | insertion order                      |

| Question                          | Answer                                 |
| --------------------------------- | -------------------------------------- |
| **Should I use `LinkedHashMap`?** | Yes, if you need predictable ordering  |
| **Overhead?**                     | Slightly more than `HashMap`           |
| **Faster than `TreeMap`?**        | Yes, and keeps insertion/access order  |
| **Can I use it for caching?**     | Perfect! Use accessOrder + subclassing |

         */
    }
}
