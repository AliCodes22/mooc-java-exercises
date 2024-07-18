
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = "0/100";
        String second = "0/100";



        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.equals("add")) {
                String number = scan.nextLine();

                int numberToAdd = Integer.valueOf(number);
                int firstPart = Integer.valueOf(first.split("/")[0]);
                firstPart += numberToAdd;

            }

        }
    }

}
