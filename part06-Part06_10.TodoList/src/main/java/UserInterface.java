import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command");
            String command = this.scanner.nextLine();

            if(command.equals("stop")) {
                break;
            } 

            if(command.equals("add")) {
                System.out.println("Add task");
                String task = this.scanner.nextLine();

                this.toDoList.add(task);
            }

            if(command.equals("list")) {
                    this.toDoList.print();;
            }

            if(command.equals("remove")) {
                System.out.println("Id to remove");
                int id = Integer.valueOf(scanner.nextLine());

                
                this.toDoList.remove(id);
            }
        }
    }

}