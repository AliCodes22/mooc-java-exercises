
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

       while(true) {
        System.out.println("Enter a num: ");
       int num = Integer.valueOf(scanner.nextLine());

        if(num == 0) {
            break;
       }


       numbers.add(num);

    }

    int result = numbers.get(1) + numbers.get(2);

    System.out.println(result);

      
    }
}
