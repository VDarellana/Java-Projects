import java.util.Arrays;

public class SortComparison {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        // clone the array to use the same data for both sorts
        int[] arrayForCustomSort = array.clone();
        int[] arrayForJavaSort = array.clone();

        // measure time for custom Sort
        long startTime = System.nanoTime();
        CustomSort.customSort(arrayForCustomSort);
        long endTime = System.nanoTime();
        long customSortTime = endTime - startTime;
        System.out.println("Custom Sort Time: " + customSortTime + " ns");

        // measure time for Java's Arrays.sort()
        startTime = System.nanoTime();
        Arrays.sort(arrayForJavaSort);
        endTime = System.nanoTime();
        long javaSortTime = endTime - startTime;
        System.out.println("Java's Arrays.sort() Time: " + javaSortTime + " ns");

        // print sorted arrays
        System.out.println("Custom Sorted array: " + Arrays.toString(arrayForCustomSort));
        System.out.println("Java Sorted array: " + Arrays.toString(arrayForJavaSort));
    }
}
