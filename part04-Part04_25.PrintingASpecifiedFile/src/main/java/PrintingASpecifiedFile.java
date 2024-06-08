
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed");
        String input = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(input))) {
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

        } catch (Exception error) {
            System.out.println(error.getMessage());

        }


    }

}
