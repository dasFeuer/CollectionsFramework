package Exercise;

import java.util.Scanner;
import java.util.Vector;

public class exercise4Vector {
    public static void main(String[] args) {
        /*
        🧠 What is a Vector?
        Vector is a resizable array (like ArrayList), but it is synchronized, meaning it is thread-safe.

        🔹 Defined in java.util
        Internally uses an array.
        Grows dynamically as elements are added.
        Automatically resizes when it reaches capacity.
         */

        Scanner scanner = new Scanner(System.in);
        Vector<String> programmingLanguages = new Vector<>();

        System.out.println("Enter programming languages (type 'exit' to stop):");
        while (true) {
            String language = scanner.nextLine();
            if (!language.equalsIgnoreCase("exit")) {
                programmingLanguages.add(language);
            } else {
                System.out.println("You exited!");
                break;
            }
        }
        for (int i = 0; i < programmingLanguages.size(); i++) {
            System.out.println("Programming Language " + (i + 1) + ": " + programmingLanguages.get(i));
        }

        System.out.println("Enter the name of the programming language you want to remove:");
        String programmingLanguageToRemove = scanner.nextLine();
        if(programmingLanguages.contains(programmingLanguageToRemove)){
            programmingLanguages.remove(programmingLanguageToRemove);
            System.out.println("You have removed the programming language: " + programmingLanguageToRemove);
        } else {
            System.out.println("The programming language '" + programmingLanguageToRemove + "' is not in the list.");
        }

        for (int i = 0; i < programmingLanguages.size(); i++) {
            System.out.println("Updated Programming Language " + (i + 1) + ": " + programmingLanguages.get(i));
        }

        /*
        | Feature           | `Vector`                         | `ArrayList`                                           |
| ----------------- | -------------------------------- | ----------------------------------------------------- |
| **Thread-safe?**  | ✅ Yes (synchronized)             | ❌ No (use `Collections.synchronizedList()` if needed) |
| **Performance**   | 🚫 Slower (due to sync overhead) | ✅ Faster (no synchronization)                         |
| **Usage**         | Legacy, rarely used              | Preferred in single-threaded apps                     |
| **Resize policy** | Doubles size when full (default) | Grows by 50% (internally)                             |

         */

     /*
     Create a Thread-Safe Task Manager using Vector.
     Multiple "users" (threads) will add tasks to a shared task list.
     At the end, we display all the tasks added.
      */

        Vector<String> taskList = new Vector<>();

        // Thread 1: Adding tasks
        Thread user1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                taskList.add("Task from User 1 - " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2: Adding tasks
        Thread user2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                taskList.add("Task from User 2 - " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        user1.start();
        user2.start();

        // Wait for both threads to finish
        try{
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display all tasks added
        System.out.println("\nFinal tasks list:");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + taskList.get(i));
        }

        System.out.println("\nTotal tasks added: " + taskList.size());

        /*
        🧠 Key Takeaway:
        Vector allows multiple threads to safely add tasks without additional synchronization.

        Each add() call is already synchronized under the hood.
         */

        /*
        taskList.add("Task from User 1 - " + i);
        Each thread uses this line, but thanks to synchronization, only one executes it at a time — automatically.
         */
    }
}
