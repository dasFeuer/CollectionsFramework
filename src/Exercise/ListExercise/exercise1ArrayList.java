package Exercise.ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise1ArrayList {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<String> books = new ArrayList<>();

        System.out.println("Write the name of books to add to the list and type e to exit: ");

        while (true) {
            String bookName = scanner.nextLine();
            if (!bookName.equalsIgnoreCase("e")){
                books.add(bookName);
                System.out.println("You added a book: " + bookName);
            } else {
                System.out.println("Exiting the program.");
                break;
            }
        }

        System.out.println("Here is the list of books you added:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book " + (i + 1)+ ": " + books.get(i));
        }

        System.out.println("Type the name of the book you want to remove: ");
        String bookToRemove = scanner.nextLine();
        if (books.contains(bookToRemove)) {
            books.remove(bookToRemove);
            System.out.println("You removed the book: " + bookToRemove);
        } else {
            System.out.println("The book '" + bookToRemove + "' is not in the list.");
        }

        System.out.println("Here is the updated list of books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Updated book list " + (i + 1) + ": " + books.get(i));
        }
    }
}
