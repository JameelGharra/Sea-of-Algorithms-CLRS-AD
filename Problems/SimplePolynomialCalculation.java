package Problems;

public class SimplePolynomialCalculation {
    private static int POLYNOMIAL_DEGREE = 5;

    private static int simplePower(int x, int n) {
        if( n >= 0) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result*x;
            }
            return result;
        }
        return -1;
    }
    private static int[] calculatePowers(int x) {
        int[] evaluatedX = new int[POLYNOMIAL_DEGREE+1];
        evaluatedX[0] = 1;
        for(int i = 1; i <= POLYNOMIAL_DEGREE; i++) {
            evaluatedX[i] = evaluatedX[i-1]*x;
        }
        return evaluatedX;
    }
    public static int modifiedPolynomial(int[] P, int x) {
        int[] X = calculatePowers(x);
        int result = 0;
        for(int i = 0; i <= POLYNOMIAL_DEGREE; i++) {
            result += P[i]*X[i];
        }
        return result;
    }
    public static int simplePolynomial(int[] P, int x) {
        int evaluated = 0;
        for(int i = 0; i <= POLYNOMIAL_DEGREE; i++) {
            evaluated += P[i]*simplePower(x, i);
        }
        return evaluated;
    }
    public static void setPolynomialDegree(int degree) {
        POLYNOMIAL_DEGREE = degree;
    }
    public static void main(String[] args) {
        System.out.println("Simple Polynomial Test");
        int[] A = {1, 2, 3, 4, 5, 6};
        System.out.println(simplePolynomial(A, 2));
        System.out.println("Modified Polynomial Test");
        System.out.println(modifiedPolynomial(A, 2));
        //expected result: 321\n321
    }
}
