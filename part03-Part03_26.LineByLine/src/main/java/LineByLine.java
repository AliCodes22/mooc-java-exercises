
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input;

        while(true) {
            input = scanner.nextLine();

            if(input.equals("")){
                break;
            }

            String[] words = input.split(" ");

            for(String word: words) {
                System.out.println(word);
            }
        }


    }
}
