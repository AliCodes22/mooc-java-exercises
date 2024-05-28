
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics numbers = new Statistics();    
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        
    
        while(true) {
            System.out.println("Enter numbers:");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == -1) {
                break;
            }

            if(number % 2 == 0) {
                evenNumbers.addNumber(number);
            }

            if(number % 2 != 0) {
                oddNumbers.addNumber(number);
            }

            numbers.addNumber(number);
        }

        

        int totalSum = numbers.sum();
        int evenNumbersSum = evenNumbers.sum();
        int oddNumbersSum = oddNumbers.sum();

        System.out.println("Sum: " + totalSum);
        System.out.println("Sum of even numbers: " + evenNumbersSum);
        System.out.println("Sum of odd numbers: " + oddNumbersSum);
    }
}
