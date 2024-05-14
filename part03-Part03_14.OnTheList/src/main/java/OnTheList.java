
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       ArrayList<String> names = new ArrayList<>();

       while(true) {
        String input = String.valueOf(scanner.nextLine());

        if(input.equals("")) {
            break;
        }

        names.add(input);
 
       }

       System.out.println("Search for?");
       String name = String.valueOf(scanner.nextLine());
      
       boolean isFound = names.contains(name);

       if(isFound){
        System.out.println(name + " was found!");
       } else {
        System.out.println(name + " was not found!");
       }

    }
}
