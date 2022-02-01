package Problems;

import java.util.Arrays;

/**
 * counts the number of inversion in a permutation of size n.
 */
public class InversionCounter {
    public static int count(int[] permutation) {
        int[] copiedPermutation;
        copiedPermutation = Arrays.copyOf(permutation, permutation.length);
        for(int integer : copiedPermutation) {
            System.out.print(integer+",");
        }
        System.out.println();
        int result = modifiedMergeSort(copiedPermutation,0, permutation.length-1);
        for(int integer : copiedPermutation) {
            System.out.print(integer+",");
        }
        System.out.println();
        return result;
    }
    private static int modifiedMergeSort(int[] permutation, int p, int r) {
        if(p != r) {
            int q = (p + r) / 2;
            int left = modifiedMergeSort(permutation, p, q);
            int right = modifiedMergeSort(permutation, q + 1, r);
            int currentInversions = modifiedMergeCounter(permutation, p, q, r);
            return left + right + currentInversions;
        }
        return 0;
    }
    private static int modifiedMergeCounter(int[] permutation, int p, int q, int r) {
        int lengthL = q-p+1, lengthR = r-q, inversions = 0;
        int[] L = new int[lengthL];
        int[] R = new int[lengthR];
        System.arraycopy(permutation, p, L, 0, lengthL);
        System.arraycopy(permutation, q+1, R, 0, lengthR);
        int i = 0, j = 0;
        while(i != lengthL && j != lengthR) {
            if(L[i] <= R[j]) {
                permutation[p+i+j] = L[i];
                i++;
            }
            else {
                inversions += lengthL-i;
                permutation[p+i+j] = R[j];
                j++;
            }
        }
        if(i != lengthL) {
            System.arraycopy(L, i, permutation, p+i+j, lengthL-i);
        }
        else if(j != lengthR) {
            System.arraycopy(R, j, permutation, p+i+j, lengthR-j);
        }
        return inversions;
    }
    public static void main(String[] args) {
        int[] permutation = {2,3,8,6,1};
        System.out.println(count(permutation));
    }
}
