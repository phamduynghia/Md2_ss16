package bt4;
import java.util.Scanner;
public class Main {
        static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 78};
        static int binarySearch(int[] list, int key) {
            int low = 0;
            int high = list.length - 1;
            while (high >= low) {
                int mid = (low + high) / 2;
                if (key < list[mid])
                    high = mid - 1;
                else if (key == list[mid])
                    return mid;
                else
                    low = mid + 1;
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to be searched: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(binarySearch(list, num));
            int max = list[0];
            for (int j : list) {
                if (max < j) {
                    max = j;
                }
            }
            System.out.println("Maximum number is: " + max);
        }
    }
