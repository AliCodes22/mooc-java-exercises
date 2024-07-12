import java.util.Dictionary;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while(true) {
            System.out.println("Type something");
            String input = scanner.nextLine();

            if(input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}