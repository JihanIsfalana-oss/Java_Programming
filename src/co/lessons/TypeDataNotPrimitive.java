package co.lessons;

public class TypeDataNotPrimitive {
    public static void main(String[] args) {
        // Type Data Not Primiive and Convertion
        Integer thisInteger;
        // Long thisLong; --> Example for not Initialized Type Data Not Primitive

        // Convert to type data primitive
        int thisInt = 30;
        thisInteger = thisInt; // ---> Converted to Primitive!

        // System.out.println(thisLong); ---> Cant Print Out cause' the varibale not Initialized yet!

        Double thisDouble = 200.765D;

        // Print Out to the Terminal
        System.out.println(thisInt);
        System.out.println("\nBelow is Converted Variable: ");
        System.out.println(thisInteger.intValue());
        System.out.println(thisDouble.doubleValue());
    }

}
