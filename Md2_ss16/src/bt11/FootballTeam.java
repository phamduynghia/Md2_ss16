package bt11;

public class FootballTeam {
    private int id;
    private String name;
    private int numberOfPlayer;
    private int score;

    public FootballTeam() {
    }

    public FootballTeam(int id, String name, int numberOfPlayer, int score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void displayData(){
        System.out.printf("%-10d\t%-10s\t%-20d\t%-10d\n", id, name, numberOfPlayer, score);
    }
}
