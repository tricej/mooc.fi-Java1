
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.event.PrintEvent;
import javax.sound.sampled.SourceDataLine;

public class SportStatistics {

    public static void main(String[] args) {
        // Create scanner for manual input and display user prompts
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        // Close Scanner. 
        scan.close();
        
        // Create ArrayList of objects for game details. 
        ArrayList<Game> games = new ArrayList<>();
        
        // Create fileScanner to read input file
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String gameDetails = fileScanner.nextLine();
                
                // Assign game details separated by commas to temporary variables
                String homeTeam = gameDetails.split(",")[0];
                String awayTeam = gameDetails.split(",")[1];
                int homePoints = Integer.valueOf(gameDetails.split(",")[2]);
                int awayPoints = Integer.valueOf(gameDetails.split(",")[3]);
                // Build Game object and add to ArrayList
                games.add(new Game(homeTeam, awayTeam, homePoints, awayPoints));
            }
            
        } catch (Exception e) {
            System.out.println("Unable to locate file.");
        }
        
        // Initialize counting variables
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;
        
        // For each game in the games array, count wins, losses, and total games played
        for (Game game : games) {
            if (game.getAwayTeam().equals(team) || game.getHomeTeam().equals(team)) {
                gamesPlayed++;
                if (game.getWinner().equals(team)) {
                    gamesWon++;
                } else {
                    gamesLost++;
                }
        
            }
        }
        // Print results
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);
        
    }
}
