import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number = Integer.valueOf(scanner.nextLine());  // Use parseInt for direct conversion
        int squared = number * number;  // Correct way to square the number
        System.out.println(squared);  // Output the squared value
    }
}
