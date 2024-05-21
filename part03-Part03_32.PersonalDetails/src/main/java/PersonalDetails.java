
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<>();
        int sum = 0;
        int longestNameLength = 0;
        String name = "";
        
        while(true){
            String input = scanner.nextLine();
            String[] inputParts = input.split(",");
           

            if(input.isEmpty()){
                break;
            }

            int year = Integer.valueOf(inputParts[1]);
            int nameLength = inputParts[0].length();

            if(inputParts.length != 2) {
                System.out.println("Invalid input format");
            }

            if(nameLength > longestNameLength) {
                longestNameLength = nameLength;
                name = inputParts[0];
            }


            sum += year;
            people.add(input);
        }

        double average = (double) sum / people.size();

        System.out.println("Longest name" + name);
        System.out.println("Average of the birth years:" + average);


    }
}
