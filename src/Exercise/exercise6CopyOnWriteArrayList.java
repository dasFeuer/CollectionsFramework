package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class exercise6CopyOnWriteArrayList {
    public static void main(String[] args) {
        /*
        🧠 What is CopyOnWriteArrayList?
           It is a thread-safe variant of ArrayList where all mutative operations (add, set, remove, etc.) are implemented by making a fresh copy of the underlying array.

            ✅ Key Concepts:
            Safe to use in multi-threaded environments.
            Reading is fast because there's no locking.
            Writing (adding/removing) is expensive because a new copy is created every time.

            ✅ When to Use It?
            Use CopyOnWriteArrayList when:
            You have many reads and very few writes.
            You want thread safety without synchronized or manual locking.
            Typical use cases:
            Caching
            Subscriber list in event systems
            Configuration values

         */

        /*
         Problem: Safe Iteration While Modifying
         Suppose you have a list of online users.
         If a user named "guest" is found, you want to add a note "temporary user" while still iterating.

         Without CopyOnWriteArrayList (just ArrayList):
         This throws ConcurrentModificationException.
         */

        List<String> onlineUsers = new ArrayList<>();

        onlineUsers.add("user1");
        onlineUsers.add("user2");
        onlineUsers.add("guest");

        System.out.println("Online Users: " + onlineUsers);

        for (int i = 0; i < onlineUsers.size(); i++) {
            System.out.println("Checking user: " + onlineUsers.get(i));

            if(onlineUsers.get(i).equalsIgnoreCase("guest")){
                onlineUsers.add("temporary user");
                System.out.println("Added 'temporary user' while iterating.");
            }
        }

        System.out.println("Updated Online Users: " + onlineUsers);


        /*
        🧠 What's Happening Inside:
        When we add during iteration, CopyOnWriteArrayList creates a new copy of the array, adds the new item,
        and swaps the internal reference.

        The current loop continues on the original snapshot of the list — no crash!

        ⚠️ When NOT to Use It:
            Not good for frequent writes.
            If you need to update the list often or with large data, use:
            Collections.synchronizedList(new ArrayList<>())
            ConcurrentLinkedQueue or other java.util.concurrent structures.

            | Feature                               | CopyOnWriteArrayList                        |
| ------------------------------------- | ------------------------------------------- |
| Thread-safe?                          | ✅ Yes                                       |
| Allows modification during iteration? | ✅ Yes, no `ConcurrentModificationException` |
| Performance: Reading                  | ✅ Fast                                      |
| Performance: Writing                  | ❌ Slow (copies array)                       |
| Best Use Case                         | Many Reads, Few Writes                      |

         */


        /*
        Problem: Multi-threaded Chat Room Example
        Imagine a chat room where:
        One thread adds new users.
        Another thread reads the list of users and prints them.
        This is perfect for CopyOnWriteArrayList since:
        Reads are frequent, and
        Writes happen, but they don't block reads.
         */


        List<String> users = new CopyOnWriteArrayList<>();

        // Thread 1: To add users
        Thread adderThread = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                String user = "User" + i;
                users.add(user);
                System.out.println("[Adder] Added: " + user);

                try{
                    Thread.sleep(500); // Simulate time taken to add a user
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        // Thread 2: Reads the list of users
        Thread readerThread = new Thread(() -> {
            for (int i = 0; i < 6; i++) {
                System.out.println("[Reader] Current Users: " + users);

                try{
                    Thread.sleep(700); // Slightly longer sleep to simulate reading time
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        adderThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            adderThread.join();
            readerThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final users list: " + users);

        /*
        🧠 How This Works:
        CopyOnWriteArrayList ensures:
        No ConcurrentModificationException even when writing while reading.
        Each read gets a consistent snapshot of the list.
        Internally, each add() operation creates a new copy of the array and updates the reference.
        This avoids locking and keeps reads super fast.

        | Operation         | Behavior                                 |
| ----------------- | ---------------------------------------- |
| Add while reading | ✅ Safe, no exception                     |
| Thread-safe?      | ✅ Yes, no need for `synchronized` blocks |
| Performance       | ✅ Fast reads, ⚠️ slower writes           |

         */
    }
}
