package bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap ptu thu: " + i);
            arr[i] = Integer.parseInt(sc.next());
        }

        System.out.println("Tim so");
        int tim = Integer.parseInt(sc.next());
        int max = arr[0];
        for (int j : arr) {
            if (tim == j) {
                System.out.println("Co tim thay");
                break;
            }
        }
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println("LN: " + max);
    }
}
