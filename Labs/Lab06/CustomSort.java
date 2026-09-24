
public class CustomSort {
     public static void customSort(int[] array) {
        int index = 0;

        while (index < array.length) {
            if (index == 0 || array[index] >= array[index - 1]) {
                index++;
            } 
            else {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
    }
}
