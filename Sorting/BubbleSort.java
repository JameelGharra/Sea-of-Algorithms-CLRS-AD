package Sorting;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] testingArray1 = {9,8,7,6,5,4,3,2,1};
        int[] testingArray2 = {1};
        int[] testingArray3 = {5,2,3,1,1,1,1,5,43};
        sort(testingArray3);
        for(int num : testingArray3) {
            System.out.print(num+",");
        }
    }
}