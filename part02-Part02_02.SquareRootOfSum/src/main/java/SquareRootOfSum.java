
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number:");
        int second = Integer.valueOf(scanner.nextLine());

        double squareRoot = Math.sqrt(first + second);
        System.out.println(squareRoot);

    }
}
