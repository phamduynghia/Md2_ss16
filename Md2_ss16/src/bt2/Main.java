package bt2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr =getArr();

        System.out.println("mang 20x20: ");
        printArray(arr);

        System.out.println("Nhập số cần tìm: ");
        int number = sc.nextInt();

        boolean found = searchNumber(arr, number);

        if (found) {
            System.out.println("Số " + number + " đã được tìm thấy trong mảng.");
        } else {
            System.out.println("Số " + number + " không tồn tại trong mảng.");
        }
    }

        private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }return arr;
    }

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static boolean searchNumber(int[][] arr, int number) {
        List<Map.Entry<Integer, Integer>> positions = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    positions.add(new AbstractMap.SimpleEntry<>(i, j));
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Số " + number + " được tìm thấy tại các vị trí:");
            for (Map.Entry<Integer, Integer> position : positions) {
                System.out.println("Hàng: " + position.getKey() + ", Cột: " + position.getValue());
            }
        }

        return found;
    }

}
