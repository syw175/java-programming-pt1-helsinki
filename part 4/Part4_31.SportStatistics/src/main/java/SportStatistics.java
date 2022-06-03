import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try ( Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] info = line.split(",");

                String firstTeam = info[0];
                String secondTeam = info[1];
                int firstTeamPoints = Integer.valueOf(info[2]);
                int secondTeamPoints = Integer.valueOf(info[3]);

                for (int i = 0; i < info.length; i++) {
                    if (info[i].equals(team)) {
                        gamesPlayed++;
                        if (i == 0 && firstTeamPoints > secondTeamPoints) {
                            wins++;
                        } else if (i == 0) {
                            losses++;
                        }

                        if (i == 1 && firstTeamPoints > secondTeamPoints) {
                            losses++;
                        } else if (i == 1) {
                            wins++;
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("File does not exist.");
        }

        System.out.println(
                "Games: " + gamesPlayed);
        System.out.println(
                "Wins: " + wins);
        System.out.println(
                "Losses: " + losses);

    }

}