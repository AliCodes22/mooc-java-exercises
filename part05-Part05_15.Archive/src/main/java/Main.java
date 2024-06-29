
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Item> items = new ArrayList<>();

        while(true) {
            System.out.println("Identifier?");
            String identifier = scanner.nextLine();

            if(identifier.isEmpty()) {
                break;
            }

            System.out.println("Name?");
            String name = scanner.nextLine();

            if(name.isEmpty()) {
                break;
            }

            Item item = new Item(name, identifier);
            
            if(items.contains(item)) {
                continue;
            } else {
                items.add(item);
            }
        }

        for(Item item : items) {
            System.out.println(item.toString());
        }
     }
}
