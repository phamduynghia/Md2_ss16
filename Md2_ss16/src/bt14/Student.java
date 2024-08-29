package bt14;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double Score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        Score = score;
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

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public void inputData(Scanner sc) {
        System.out.println("id");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("Name");
        this.name = sc.nextLine();
        System.out.println("Score");
        this.Score = Double.parseDouble(sc.nextLine());
    }
    public void displayData(){
        System.out.println("ID: " + id + " Name: " + name + " Score: " + Score);
    }
}