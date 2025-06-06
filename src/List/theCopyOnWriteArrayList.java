package List;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class theCopyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "Copy on Write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list while it’s being modified are unaffected.

        // Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
        // Write Operations: A new copy of the list is created for every modification.
        //                  The reference to the list is then updated so that subsequent reads use this new list.

        // read more
        List<String> stringList = new CopyOnWriteArrayList<>();
        stringList.add("RAM");
        stringList.add("ROM");
        stringList.add("CPU");
        System.out.println("Initial list: " + stringList);

        for(String theList : stringList){
            System.out.println(theList);

            // Try to modify the list while reading
            if(theList.equals("CPU")){
                stringList.add("Processor");
                System.out.println("Added Processor while reading");
            }
        }
        System.out.println("Update list: " + stringList);

        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    // Iterate through the list
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100); // Small delay to simulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();

    }
}
