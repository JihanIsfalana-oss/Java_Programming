package co.course;

public class RecurrsiveMethod {
    public static void main(String[] args) {
        // Recurrsion
        int numFactorial = 6;

        System.out.print(numFactorial + "! = ");
        for (int i = numFactorial; i >= 1; --i) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println();
        System.out.println("Result Factorial " + numFactorial + "! = " + factorial(numFactorial));
    }

    static int factorial (int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // --> this called by recurrsion
    }

}
