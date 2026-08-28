package co.learn;

public class TypeDataChar {

    public static void main(String[] args) {
        // Type Data Char
        char e = 'E';
        char k = 'K';
        char a = 'A';

        /* Print Out to the Terminal */
        System.out.println(e + " " + k + " " + a); // #1

        // #2
        System.out.println(e);
        System.out.println(k);
        System.out.println(a);

        // #3
        System.out.print("" + e + k + a); // ---> MUST BE STRING FIRST DO NOT USE FULL CHAR DATA TYPES!!

        // #4
        System.out.print(e);
        System.out.print(k);
        System.out.print(a);

        // #5
        System.out.printf("\n%s%s%s", e, k, a);
    }

}
