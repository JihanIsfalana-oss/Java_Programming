package co.learn;

public class ConvertionTypeDataNumber {

    public static void main(String[] args) {
        // Convertion Type Data Number

        // Automatic Convert by Java
        byte thisByte = 10;
        short thisShort = thisByte;
        int thisInt = thisShort;
        long thisLong = thisInt;
        double thisDouble = thisLong;

        // Manually Convert with Casting Technic
        // Ordered by Max_Num to Min_Num Can't Convert by Automatically from Java
        double numD = 1000;
        int numInt = (int) numD; // ---> this is Casting Technic : WARNING FOR USE IT!!
        byte numByte = (byte) numInt; // ---> this is how actually we cast but take the risk!!
    
        // Print Out to the Terminal #1
        System.out.println("\n=========== Automatically Convert ============");
        System.out.println(thisByte + " <== this byte Number\n");
        System.out.println(thisShort + " <== this Cast to Short Number\n");
        System.out.println(thisInt + " <== this Cast to Int Number\n");
        System.out.println(thisLong + " <== this Cast to Long Number\n");
        System.out.println(thisDouble + " <== this Cast to Double Number\n");

        // Print Out to the Terminal #2
        System.out.println("\n=========== Manually Convert ============");
        System.out.println(numInt + " <== this Manual Cast to int Number\n");
        System.out.println(numByte + " <== this Manual Cast to byte Number\n");
    }

}
