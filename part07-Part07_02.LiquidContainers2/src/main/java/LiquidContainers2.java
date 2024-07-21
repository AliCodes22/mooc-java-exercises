import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        // Print initial states of both containers
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                first.add(number);
            } else if (command.equals("remove")) {
                second.remove(number);
            } else if (command.equals("move")) {
                first.move(second, number);
            }

            // Print the states of both containers after each command
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
        }

        scan.close();
    }
}

