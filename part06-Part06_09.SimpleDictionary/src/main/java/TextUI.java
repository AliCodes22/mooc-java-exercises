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
            } else if(input.equals("add")) {
                System.out.println("Word?");
                String word = scanner.nextLine();
                System.out.println("Translation?");
                String translation = scanner.nextLine();    
                dictionary.add(word, translation);            
            }else if (input.equals("search")) {
                System.out.println("Word to translate:");
                String wordToTranslate = scanner.nextLine();

                String translation = dictionary.translate(wordToTranslate);

                if (translation != null) {
                    System.out.println("Translation: " + translation);
                } else {
                    System.out.println("Word " + wordToTranslate + " was not found");
                }
            }
            
            else {
                System.out.println("Unknown command");
            }
        }
    }

}