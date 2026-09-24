import java.util.Random;

public class BubbleSortModifications {
       public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void bubbleSortStrings(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

        public static void bubbleSortCompareArrays() {
        int size = 1000;
        Random rand = new Random();

        int[][] arrays = new int[3][size];
        for (int a = 0; a < 3; a++) {
            for (int i = 0; i < size; i++) {
                arrays[a][i] = rand.nextInt(10000); // random values 0-9999
            }
        }

        for (int a = 0; a < 3; a++) {
            long startTime = System.nanoTime();
            bubbleSortDescending(arrays[a]);
            long endTime = System.nanoTime();
            System.out.println("Array " + (a + 1) + " Execution Time: " + (endTime - startTime) + " ns");
        }
    }
}
