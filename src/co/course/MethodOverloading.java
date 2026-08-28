package co.course;

public class MethodOverloading {
    public static void main(String[] args) {
        // Method Overloading
        printSay();
        System.out.println();
        printSay(" Hello");
        printSay(" Hello,", " Good Morning!");
        // That are the method overloading with same name but different parameters
    }

    static void printSay() {
        System.out.println("Say");
    }

        static void printSay(String argumen) {
        System.out.println("Say" + argumen);
    }

        static void printSay(String argumen, String greeting) {
        System.out.println("Say" + argumen + greeting);
    }
}
