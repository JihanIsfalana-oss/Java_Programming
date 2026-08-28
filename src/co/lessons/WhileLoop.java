package co.lessons;

public class WhileLoop {
    public static void main(String[] args) {
        // While Loop
        int i = 0;
        while (i < 3) { // The Expressions must return a boolean value
            System.out.println('*');
            ++i; // must be updated here!! if not updated the while will looping forever!
        }
    }

}
