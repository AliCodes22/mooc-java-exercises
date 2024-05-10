
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("Search for?");
        int searchNumber = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == searchNumber ) {
                System.out.println(searchNumber + " is at index " + i);
            }
        }

    }
}
