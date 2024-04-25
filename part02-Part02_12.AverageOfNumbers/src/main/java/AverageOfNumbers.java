
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNumbers = 0;
       

        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 0) {
                break;
            }

            if(number != 0) {
                sum += number;
                totalNumbers++;
            }
            

        }
        double average = (double) sum / totalNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}
