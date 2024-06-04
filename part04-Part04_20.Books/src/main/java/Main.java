import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year");
            int year = Integer.valueOf(scanner.nextLine());

            Book book = new Book(title, pages, year);
            books.add(book);
        }

        System.out.println("What information will be printed?");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (input.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
