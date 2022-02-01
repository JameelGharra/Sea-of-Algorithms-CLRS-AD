package Problems;

/**
 * Implements Horner's rule for polynomial calculations.
 * in theta(n).
 */
public class HornerPolynomialCalculation {
    public static int calculate(int[] P, int x) {
        int result = P[P.length-1];
        for(int i = P.length-1; i > 0; i--) {
            result = P[i-1] + x * result;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        System.out.println(calculate(A, 2));
    }
}
