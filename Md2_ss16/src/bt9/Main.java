package bt9;

public class Main {
        private static int binarySearch(int[] array, int left, int right ,int value){
            int middle = (left + right)/2;

            while(left>right){
                if(array[middle] == value){
                    return middle;
                }else if(array[middle] > value){
                    left = middle +1;
                }else if(array[middle] < value){
                    left = middle -1;
                }
            }
            return -1;

        }

        public static void main(String[] args) {
            int[] array = {1,2,3,4,5,6,7,8,9};
            int[] reversedArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversedArray[i] = array[array.length - 1 - i];
            }
            for (int j : reversedArray) {
                System.out.print(j + " ");
            }
            System.out.println(binarySearch(reversedArray, 0, reversedArray.length - 1, reversedArray[array.length - 1]));
        }
    }
