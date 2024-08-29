package bt6;

public class Main {
        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                System.out.print("Trước khi chèn " + key + ": ");
                printArray(arr);

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }

                arr[j + 1] = key;

                System.out.print("Sau khi chèn " + key + ": ");
                printArray(arr);
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {5, 1, 3, 5, 6, 4};

            System.out.println("Mảng ban đầu:");
            printArray(arr);
            System.out.println();

            insertionSort(arr);

            System.out.println("\nMảng sau khi sắp xếp:");
            printArray(arr);
        }
    }