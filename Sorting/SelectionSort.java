
class SelectionSorter_1 {
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int minValueInd = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minValueInd] > arr[j]) {
                    minValueInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minValueInd];
            arr[minValueInd] = temp;
        }
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        int[] arrTest = {7, 3, 8, 1, 2, 5, 2, 1};
        //int[] arrTest = {1, 1, 1,  1, 1, 1};
        //int[] arrTest = {1};
        InsertionSorter_Book.sort(arrTest);
        for (int x : arrTest) {
            System.out.print(x);
            System.out.print(" ");
        }
    }
}
