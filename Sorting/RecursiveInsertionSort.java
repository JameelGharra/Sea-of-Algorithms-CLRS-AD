package Sorting;

/**
 * Solves 2.3-4 in the book.
 */
public class RecursiveInsertionSort {
    private static int[] testingArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    /**
     * Performs insertion sort recursively.
     * @param arr an array of integers to be sorted.
     * @param n the length of the array in the input.
     */
    public static void recursiveInsertionSort(int[] arr, int n) {
        recursiveInsertion(arr, arr.length-1);
    }
    private static void recursiveInsertion(int[] arr, int j) {
        if(j > 1) {
            recursiveInsertion(arr, j-1);
        }
        // inserting the element in the organized pile of cards
        int key = arr[j];
        while(j > 0 && arr[j-1] >= key) {
          arr[j] = arr[j-1];
          j--;
        }
        arr[j] = key;
    }
    public static void main(String[] args) {
        recursiveInsertionSort(testingArray, testingArray.length);
        for(int integer : testingArray) {
            System.out.print(integer + ",");
        }
    }
}
