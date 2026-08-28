package co.course;

public class BreakContinue {
    public static void main(String[] args) {
        // Break and Continue
        // Mostly Used for Switch Statement

        int value = 5;
        String isTrue = "no";

        switch (isTrue) {
            case "yes" : {
                value = 10;
                System.out.println(value);
                break; // --> used for break to the next execution if this statement is executed
            }
            case "no" : {
                for (int i = 0; i < value; ++i) {
                    System.out.println(value);
                    continue; // --> Used inside loop statement
                }
                System.out.println("\nAkhir dari Looping");
            }
        }
        System.out.println("\nAkhir Program\n");
    }

}
