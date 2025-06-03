package Exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class exercise3LinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> fruits = new LinkedList<>();


        System.out.println("Enter the names of fruits (TYPE 'done' to finish)");

        while (true){
            String fruitName = scanner.nextLine();
            if(!fruitName.equalsIgnoreCase("done")){
                fruits.add(fruitName);
            } else {
                System.out.println("You have finished adding fruits.");
                break;
            }
        }

        System.out.println("\n Your fruits list: " + fruits);


        System.out.println("Enter the name of the fruit you want to remove: ");

        String fruitToRemove = scanner.nextLine();

        if(fruits.remove(fruitToRemove)) {
            System.out.println("You have removed the fruit: " + fruitToRemove);
        } else {
            System.out.println("The fruit '" + fruitToRemove + "' is not in the list.");
        }

        System.out.println("\nUpdated fruits list: " + fruits);

        System.out.println("Enter the name of the fruit you want to add at the beginning: ");
        String fruitToAddAtBeginning = scanner.nextLine();
        fruits.addFirst(fruitToAddAtBeginning);
        System.out.println("You have added the fruit at the beginning: " + fruitToAddAtBeginning);

        System.out.println("\nFruits list after adding at the beginning: " + fruits);
    }
}
