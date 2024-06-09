
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        Boolean isFound = false;

        try (Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()) {
                String row = reader.nextLine();
                
                if(row.equals(searchedFor)) {
                    System.out.println("Found!");
                    isFound = true;
                   
                }

            }

            if(!isFound) {
                System.out.println("Not found.");
            }
               
        } catch (Exception error) {
            System.out.println("Reading the file " + file + "failed.");
        }

    }
}
