package co.course;

public class MethodVariableArgument {
    public static void main(String[] args) {
        // Method Variable Argument
        int[] arrayNum = {1, 3, 5, 6, 7};

        System.out.println(printSum(arrayNum));
    }

    static int printSum(int... number) { // --> this is the Method Variable Argument
        int value = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
            value += number[i];
        }

        System.out.print("SUM = ");
        
        return value;
    }

}
