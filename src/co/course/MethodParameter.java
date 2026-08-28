package co.course;

public class MethodParameter {
    public static void main(String[] args) {
        // Method Parameter
        sayHello("Mochammad Jihan Isfalana", "Hello World!\n"); // --> Called with parameter
    }

    static void sayHello(String name, String message) { // --> Required Two Parameter of String Types
        System.out.println("\nMy name\t: " + name);
        System.out.println("Message\t: " + message);
    }

}
