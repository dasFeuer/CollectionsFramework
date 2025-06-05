package Exercise;

import java.util.Scanner;
import java.util.Stack;

public class exercise5Stack {
    public static void main(String[] args) {
        /*
        🧠 What is a Stack?
        A Stack is a linear data structure that follows the LIFO principle:

        Last-In, First-Out
        The last element pushed (added) is the first one to be popped (removed).

        🔁 Real-Life Examples:
        Stack of plates: You put one plate on top of another. To remove one, you take the top plate first.

        Undo feature: Last action is undone first.


        | Method         | What It Does                                   |
| -------------- | ---------------------------------------------- |
| `push(item)`   | Add item to the top                            |
| `pop()`        | Remove and return the top item                 |
| `peek()`       | Look at the top item without removing it       |
| `isEmpty()`    | Check if the stack is empty                    |
| `size()`       | Get the number of elements in the stack        |
| `search(item)` | Find how far an item is from the top (1-based) |

         */

        /*
        🧩 Problem Statement:
           You are building a simple text editor.
           Every time the user types a word, it’s added to the editor.
           If the user presses Undo, the last added word is removed.

           Write a Java program that simulates this using a Stack.
         */

        Scanner scanner = new Scanner(System.in);
        Stack<String > textStack = new Stack<>();

        while (true) {
            System.out.println("Choose an action: (1) Add word, (2) Undo, (3) Show, (4) Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice){
                case 1: // Add word
                    System.out.println("Enter a word to add: ");
                    String word = scanner.nextLine();
                    textStack.push(word);
                    break;
                case 2: // Undo
                    if(!textStack.isEmpty()){
                        String removedWord = textStack.pop();
                        System.out.println("Removed word: " + removedWord);
                    } else {
                        System.out.println("No words to undo.");
                    }
                    break;

                case 3: // Show
                    if(!textStack.isEmpty()){
                        System.out.println("Current words in stack: " + textStack);
                    } else {
                        System.out.println("No words in stack.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program.");
                    if (!textStack.isEmpty()){
                        String topWord = textStack.peek();
                        System.out.println("Top word in stack: " + topWord);
                    } else {
                        System.out.println("Stack is empty, nothing to peek");
                    }
                    return;


                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            /*
            🧠 Why Use Stack Here?
                Stack keeps track of the order of added words.

                LIFO (Last In, First Out): Last added word is the first to be undone.

                Perfect for Undo, Backtracking, Navigation, History scenarios.
             */
        }

        /*
        | Use Case                | Why Stack?                            |
| ----------------------- | ------------------------------------- |
| **Undo/Redo**           | LIFO helps manage last actions        |
| **Backtracking**        | Like in maze solving or recursion     |
| **Expression Parsing**  | Evaluating math expressions or syntax |
| **Balanced Brackets**   | Checking `{[()]}` structure           |
| **Function Call Stack** | Used by JVM internally                |


| Topic              | Notes                                              |
| ------------------ | -------------------------------------------------- |
| What is a Stack?   | LIFO structure: last added = first removed         |
| Java `Stack` Class | Easy to use, but a bit old                         |
| When to use?       | Undo, parsing, recursion, backtracking, etc.       |
| Alternatives       | `LinkedList`, `ArrayList`, or better: `ArrayDeque` |
| Industry Tip       | Prefer `ArrayDeque` over `Stack` for performance   |

         */
    }
}
