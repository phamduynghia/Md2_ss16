package bt10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String longestSubstr = "";
        StringBuilder currentSubstr = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) >= input.charAt(i - 1)) {
                currentSubstr.append(input.charAt(i));
            } else {
                if (currentSubstr.length() > longestSubstr.length()) {
                    longestSubstr = currentSubstr.toString();
                }
                currentSubstr = new StringBuilder("" + input.charAt(i));
            }
        }

        // Kiểm tra lần cuối nếu chuỗi con hiện tại là dài nhất
        if (currentSubstr.length() > longestSubstr.length()) {
            longestSubstr = currentSubstr.toString();
        }

        System.out.println(longestSubstr);
    }
}
