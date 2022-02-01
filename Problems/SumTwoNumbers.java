package Problems;

/*
    had to make sure to not search for the same element, cause in the case of {1, 2, 3}
    for example if the value was 2 and we started the scan, the binary search will search
    for 1 and the result that it will find the first index (since 2-1 = 1) but there are no
    1's in the array.
 */

import Sorting.MergeSort;
import Searching.RecursiveBinarySearch;

public class SumTwoNumbers {
    public static boolean check(int[] arr, int value) {
        int[] copiedArray = new int[arr.length];
        System.arraycopy(arr, 0, copiedArray, 0, arr.length);
        MergeSort.mergeSort(copiedArray);
        for(int i = 0; i < copiedArray.length; i++) {
            int resultIndex = RecursiveBinarySearch.search(copiedArray, value-arr[i]);
            if(resultIndex != RecursiveBinarySearch.NOT_FOUND) {
                if(resultIndex == i) {
                    if((i+1 < arr.length && arr[i+1] == arr[i]) ||
                            (i-1 > 0 && arr[i-1] == arr[i])) {
                        return true;
                    }
                }
                else return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Test #1 - No duplicates..");
        int []testingNoDuplicate = {4,3,1,2};
        System.out.println(check(testingNoDuplicate, 4));
        System.out.println("Test #2 - duplicate..");
        int []testingDuplicate = {1, 1, 2, 4, 5};
        System.out.println(check(testingDuplicate, 2));
        System.out.println("Test #3 - not possible value");
        System.out.println(check(testingDuplicate, -1));
        /*
            expected results:
            true
            true
            false
         */
    }
}
