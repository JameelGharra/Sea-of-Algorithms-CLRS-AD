package Sorting;

class Merger_1 {
    private static void copyArray(int[] srcArray, int[] destArray, int startPos, int destPos, int srcLength) {
        for(int index = startPos; index < srcLength; index++, destPos++) {
            destArray[destPos] = srcArray[index];
        }
    }
    static void merge(int[] arr, int p, int q, int r) {
        int lengthL = q - p + 1;
        int lengthR = r - q;
        int[] L = new int[lengthL];
        int[] R = new int[lengthR];
        System.arraycopy(arr, p, L, 0, q + 1 - p);
        System.arraycopy(arr, q+1, R, 0, r-q);
        for (int j = q + 1; j <= r; j++) {
            R[j - q - 1] = arr[j];
        }
        int i = 0, j = 0;
        while(i < lengthL || j < lengthR) {
            if(i == lengthL) {
                copyArray(R, arr, j, p+i+j, lengthR);
                break;
            }
            else if(j == lengthR) {
                copyArray(L, arr, i, p+i+j, lengthL);
                break;
            }
            else if(L[i] <= R[j]) {
                arr[p+i+j] = L[i];
                i++;
            }
            else {
                arr[p+i+j] = R[j];
                j++;
            }
        }
    }
}
class Merger_2 {
    static void merge(int[] arr, int p, int q, int r) {
        
    }
}
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 20, 30, 7, 25, 29, 100};
        Merger_1.merge(arr, 3, 5,8);
        for(int num : arr) {
            System.out.print(num+",");
        }
    }
}