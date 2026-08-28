package co.learn;

public class TipeDataNumber {

    public static void main(String[] args) {
        // Type Data Number #1 (Integer Number)
        byte thisByteNum = 100;
        short thisShortNum = 1000;
        int thisIntegerNum = 10000000;
        long thisLongNum = 1000000000L;
        
        // Type Data Number #2 (Float Type Number)
        float thisFloatType = 12.345f;
        double thisDoubleType = 12.345;

        // Type Data Number #3 (Literals)
        int decimalNum = 12;
        int hexNum = 0xB239AF;
        int binNum = 0b00101101;
        int underscored = 1_000_000_005;

        // Print Out to Terminal #1
        System.out.println("\n============ TYPE DATA INTEGER NUMBER ============");
        System.out.println(thisByteNum + " <--" + "This is Byte Number\n");
        System.out.println(thisShortNum + " <--" + "This is Short Number\n");
        System.out.println(thisIntegerNum + " <--" + "This is Integer Number\n");
        System.out.println(thisLongNum + " <--" + "This is Long Number\n");

        // Print Out to Terminal #2
        System.out.println("\n============ TYPE DATA FLOAT TYPE NUMBER ============");
        System.out.println(thisFloatType + " <--" + "This is Float Number\n");
        System.out.println(thisDoubleType + " <--" + "This is Double Number\n");

        // Print Out to Terminal #3
        System.out.println("\n============ TYPE DATA LITERALS & UNDERSCORED NUMBER ============");
        System.out.println(decimalNum + " <--" + "This is Decimal/Integer Normal Number\n");
        System.out.println(hexNum + " <--" + "This is HexaDecimal Number\n");
        System.out.println(binNum + " <--" + "This is Binary Number\n");
        System.out.println(underscored + " <--" + "This is Underscore Number\n"); // Make Readible Zero Number like 1_000_000_000 etc.
    }
}
