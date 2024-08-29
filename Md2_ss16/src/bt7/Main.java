package bt7;
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
            for (Integer integer : arr) {
                System.out.println(integer);
            }
            System.out.println("Enter min");
            Scanner sc = new Scanner(System.in);
            int min = Integer.parseInt(sc.nextLine());
            System.out.println("Enter max");
            int max = Integer.parseInt(sc.nextLine());

            int count =0;
            for (Integer integer : arr) {
                if (min <= integer && integer <= max) {
                    System.out.println(integer);
                    count++;
                }
            }
            System.out.println("There are " + count + " elements");
        }
    }