package bt12;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
        private static Integer[] getArr(){
            Integer[] arr = new Integer[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            Arrays.sort(arr, Collections.reverseOrder());
            return arr;
        }

        public static void main(String[] args) {
            Integer[] arr = getArr();
            System.out.println(Arrays.toString(arr));
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to find");
            int n = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                    System.out.println(i + " index is found");
                }
            }
        }
    }
