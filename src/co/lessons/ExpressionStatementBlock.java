package co.lessons;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        // Expressions
        int a = 20; // --> this can called by expression but can called too by statement
        System.out.println(a); // this is statement, but the variable a is expression

        // This are not Grouping by Block
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        System.out.println("Hello World 4\n");

        // This are Grouping by Block
        { // --> this is called Block
            System.out.println("Hello World 5");
            System.out.println("Hello World 6");
            System.out.println("Hello World 7");
            System.out.println("Hello World 8");
        }
    }

}
