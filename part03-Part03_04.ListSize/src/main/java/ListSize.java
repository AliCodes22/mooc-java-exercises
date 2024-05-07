
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while(true) {
            System.out.println("Enter something");
            String something = String.valueOf(scanner.nextLine());

            if(something.equals("")) {
                break;
            }

            
            names.add(something);
           
        }

        System.out.println("In total: " + names.size());

    }
}
