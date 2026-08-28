package co.lessons;

public class TernaryOperation {
    public static void main(String[] args) {
        // Ternary Operation
        int exam = 89;

        // Without Ternary Operation
        if (exam >= 75) {
            System.out.println("\nCongrats, you pass the exam!\n");
        }

        // With Ternary Operation
        String result = (exam >= 75) ? "Congrats, You Pass!\n" : "Try Again Soon!\n";
        System.out.println(result);
    }

}
