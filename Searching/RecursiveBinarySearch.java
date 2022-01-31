package Searching;

/**
 * Note: At the start I did a mistake, I did not put in the signature two pointers for
 * the boundaries, this might result to keep going back and forth to the same elements
 * and not performing efficient searching as well even if the method works.
 * old parameters: (int[] arr, int value, int mid)
 *
 * another mistake was in the cases when the values were smaller/bigger than the elements inside the array,
 * caused to check invalid indices.
 *
 * improvement was to check for p > r case instead of separating in multiple cases like if
 * p > arr.length-1 or q < 0
 */
public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] arr, int value) {
        return recursiveSearch(arr, value, 0,  arr.length-1);
    }
    private static int recursiveSearch(int[] arr, int value, int p, int q) {
        if(p > q) {
            return -1;
        }
        int mid = (p+q)/2;
        if(arr[mid] == value) {
            return mid;
        }
        else if(arr[mid] > value) {
            return recursiveSearch(arr, value, p, mid-1);
        }
        else {
            return recursiveSearch(arr, value, mid+1, q);
        }
    }
    public static void main(String[] args) {
        int[] testingArrayTrivial = {0, 1, 2, 3, 4, 5};
        System.out.println("Test #1");
        for(int i = -2; i < 7; i++)
            System.out.println(recursiveBinarySearch(testingArrayTrivial, i));
        System.out.println("Test #2");
        int[] testingArraySides = {1};
        System.out.println(recursiveBinarySearch(testingArraySides, 1));
        System.out.println(recursiveBinarySearch(testingArraySides, -1));
        // expected results:
        // -1\n-1\n0\n1\n2\n3\n4\n5\n-1
        //0\n-1
    }
}