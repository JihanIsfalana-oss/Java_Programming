package co.course;

public class Method {
    public static void main(String[] args) {
        // Method
        sayHelloWorld(); // --> Calling the Method!
        System.out.println(dividenResult(10, 3));
    }

    static void sayHelloWorld() {
        // This Method will Print Out the Hello World Text to the Terminal
        System.out.println("\nHello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        System.out.println("Hello World 4\n");
    }

    static int dividenResult (int number1, int number2) {
        int result = number1 % number2;
        return result;
    }

}
