package bt13;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
        private static int[] getArr(){
            int[] arr = new int[20];
            for (int i = 0; i < 20; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = getArr();
            System.out.println(Arrays.toString(arr));
            IntStream kq = Arrays.stream(arr).sorted();
            System.out.println(Arrays.toString(kq.toArray()));
        }
    }
