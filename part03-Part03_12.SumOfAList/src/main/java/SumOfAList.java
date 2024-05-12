
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
       

            if(number == -1) {
                break;
            }

            sum += number;

            numbers.add(number);
        }

       

    

        System.out.println("Average:" + sum );
    }
}
