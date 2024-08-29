package bt5;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

        private static Integer[] getArr() {
            Integer[] arr = new Integer[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            Arrays.sort(arr);
            return arr;
        }

        public static void main(String[] args) {

            Integer[] arr = getArr();
            System.out.println("Sorted array: " + Arrays.toString(arr));

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter min value: ");
            int min = scanner.nextInt();
            System.out.print("Enter max value: ");
            int max = scanner.nextInt();

            int minIndex = -1;
            int maxIndex = -1;

            for (int i = 0; i < arr.length; i++) {
                if (minIndex == -1 && arr[i] > min) {
                    minIndex = i;
                }
                if (arr[i] < max) {
                    maxIndex = i;
                }
            }
            if (minIndex != -1 && maxIndex != -1 && minIndex <= maxIndex) {
                System.out.println("Count of numbers found: " + (maxIndex - minIndex + 1));
                System.out.println("Details of numbers found: ");
                for (int i = minIndex; i <= maxIndex; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                System.out.println("No numbers found in the specified range.");
            }
        }
    }
