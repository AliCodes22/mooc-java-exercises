
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = -1;

        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == searchedId) {
               return i;
               
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
    int startIndex = 0;
    int lastIndex = books.size() - 1;

    while (startIndex <= lastIndex) { // Continue while there is a range to search
        int middleIndex = (startIndex + lastIndex) / 2; // Calculate the middle index
        
        // Compare the middle element's ID with the searchedId
        if (books.get(middleIndex).getId() == searchedId) {
            return middleIndex; // Return the index if found
        }
        
        // If the searchedId is smaller, search the left half
        if (books.get(middleIndex).getId() > searchedId) {
            lastIndex = middleIndex - 1;
        } else { // If the searchedId is larger, search the right half
            startIndex = middleIndex + 1;
        }
    }
    
    return -1; // Return -1 if the searchedId is not found
}

    


}

