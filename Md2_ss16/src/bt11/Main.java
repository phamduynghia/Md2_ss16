package bt11;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
public class Main {
        public static List<FootballTeam> footballTeams = new ArrayList<FootballTeam>();

        public static void main(String[] args) {
            Random rand = new Random();
            for (int i = 0; i < 3; i++) {
                FootballTeam ft = new FootballTeam();
                ft.setName("Name" + i);
                ft.setId(i);
                ft.setScore(rand.nextInt(10));
                ft.setNumberOfPlayer(rand.nextInt(10));
                footballTeams.add(ft);
            }
            printArray();

            System.out.println("sort score");
            sortFootballTeamsScore();
            printArray();

            System.out.println("sort name");
            sortFootballTeamsName();
            printArray();

            System.out.println("sort number of player");
            sortFootballTeamsNOPlayer();
            printArray();

        }

        public static void printArray() {
            System.out.printf("%-10s\t%-10s\t%-20s\t%-10s\n", "id", "name", "numberOfPlayer", "score");
            for (int i = 0; i < 3; i++) {
                footballTeams.get(i).displayData();
                System.out.println();
            }
        }

        public static void sortFootballTeamsScore() {
            footballTeams.sort(Comparator.comparing(FootballTeam::getScore));
        }

        public static void sortFootballTeamsName() {
            footballTeams.sort(Comparator.comparing(FootballTeam::getName).reversed());
        }

        public static void sortFootballTeamsNOPlayer() {
            footballTeams.sort(Comparator.comparing(FootballTeam::getNumberOfPlayer));
        }
    }
