
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Birds birds = new Birds(scan);


        while(true) {
            System.out.println("?");
            String command = scan.nextLine();

              if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birds.addBird(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                birds.addObservation(name);
            } else if (command.equalsIgnoreCase("All")) {
                birds.printAllBirds();
            } else if (command.equalsIgnoreCase("One")) {
                birds.printOneBird();
            } else if (command.equalsIgnoreCase("Quit")) {
                break;
            } else {
                System.out.println("Invalid command!");
            }
        }
        }

    }

