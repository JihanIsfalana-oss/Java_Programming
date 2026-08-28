package co.course;

import java.util.Scanner;

public class MethodReturnValue {
    public static void main(String[] args) { // this is method main
        // method

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number for Fibonacci = ");
        number = input.nextInt();

        System.out.print("Fibonacci " + number + " = ");

        for (int i = 1; i <= number; ++i) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }
    static int fibonacci(int n) { // --> this is method return value
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
