
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;


        try(Scanner reader = new Scanner(Paths.get(fileName))) {
            while(reader.hasNextLine()) {
                String row = reader.nextLine();
                String parts[] = row.split(",");
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                Boolean isHomeTeam = parts[0].equals(teamName);
                Boolean isVisitingTeam = parts[1].equals(teamName);


                // check condition only if the team is playing on either the home or visiting side
                if(parts[0].equals(teamName) || parts[1].equals(teamName)) {
                    gamesPlayed++;    
                
                    if(isHomeTeam && homeTeamPoints > visitingTeamPoints) {
                        wins++;

                    } else if(isVisitingTeam && visitingTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
               
            } 

      }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses );
    }
}

