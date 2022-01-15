

class InsertionSorter_1 {
    public static void sort(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        for (int i = 1; i < arr.length; ++i) {
            for (int j = i; j > 0; --j) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}

class InsertionSort_Book {
    public static  void sort(int[] arr)  {
        if(arr.length == 1) {
            return ;
        }
        for(int i = 1; i < arr.length; i++) {
            int j = i-1;
            while(j >= 0 && arr[j] > arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrTest = {7,3,8,1,2,5,2,1};
        //int[] arrTest = {1, 1, 1, 1, 1, 1};
        //int[] arrTest = {1};
        InsertionSort_Book.sort(arrTest);
        for (int x : arrTest) {
            System.out.println(x);
        }
    }
}
