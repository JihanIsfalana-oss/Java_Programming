package co.lessons;

public class OperationMathematics {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 22;
        
        // Operator Mathematics
        System.out.println("\nOperator Math\t: " + " +  -  /  *  %\n");

        System.out.println("Number One\t: " + numOne + "\n");
        System.out.println("Number Two\t: " + numTwo + "\n");
        
        // Operation
        System.out.println(("====> Plus"));
        System.out.println((numOne + numTwo + "\n"));

        System.out.println(("====> Minus"));
        System.out.println((numOne - numTwo + "\n"));

        System.out.println(("====> Division"));
        System.out.println(((double) numOne / numTwo + "\n"));

        System.out.println(("====> Multiple"));
        System.out.println((numOne * numTwo + "\n"));

        System.out.println(("====> Modulo"));
        System.out.println((numTwo % numOne + "\n")); // Number Two modulo with number one

        // Augmented Assignments
        int A = 2;
        A = A + 4; // ---> this can be simplify!
        System.out.println();
        System.out.println(A);

        A += 4; // ---> this is Augmented Assignment!
        System.out.println(A);

        // Unary Operator
        // I have value from variable A now is 10 and then i want to operate that by unary operation!
        A++; // ---> this is the unary
        System.out.println(A);

        ++A; // --> this is too but it run faster
        System.out.println(A);

        --A; // Same but different Act with minus
        System.out.println(A);
    }

}
