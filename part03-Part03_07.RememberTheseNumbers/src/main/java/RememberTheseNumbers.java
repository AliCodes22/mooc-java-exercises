
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            System.out.println("Enter a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == -1) {
                break;
            }

            numbers.add(num);
        }

        for(int i = 0; i <= numbers.size() - 1; i++) {
            System.out.println(numbers.get(i));
        }


    }
}
