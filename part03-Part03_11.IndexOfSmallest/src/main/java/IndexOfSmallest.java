import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 9999) {
                break;
            }

            numbers.add(number);
        }

        int smallest = numbers.get(0); // Initialize smallest with the first number in the list

        for(int i = 1; i < numbers.size(); i++) { // Start from index 1
            if(numbers.get(i) < smallest) {
                smallest = numbers.get(i); // Update smallest if a smaller number is found
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + numbers.indexOf(smallest));
    }
}
