import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the ending point
        System.out.print("Where to? ");
        int numberTo = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        // Ask for the starting point
        System.out.print("Where from? ");
        int numberFrom = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        // If the upper limit is smaller than the starting point, nothing is printed
        if (numberFrom > numberTo) {
            return;
        }

        // Print numbers from the starting point to the ending point
        for (int i = numberFrom; i <= numberTo; i++) {
            System.out.println(i);
        }
    }
}
