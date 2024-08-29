package bt8;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter something");
            String s = sc.nextLine();
            String[] words = s.split("");
            Stream<String> sorted = Arrays.stream(words).sorted();
            System.out.println("The words in " + s + " are: ");
            sorted.forEach(System.out::print);
        }
    }
