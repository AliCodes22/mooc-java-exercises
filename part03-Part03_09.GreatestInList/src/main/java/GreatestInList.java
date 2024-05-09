
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int greatestNumber = 0;

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            numbers.add(number);

            if(number == -1) {
                break;
            }

            if(number > greatestNumber) {
                greatestNumber = number;
            }
        }
        
        System.out.println("The greatest number:" + greatestNumber);
    }
}
