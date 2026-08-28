package co.lessons;

public class OperationBoolean {
    public static void main(String[] args) {
        // Operator Boolean
        System.out.println("\nOperator Boolean\t: " + "!" + " || " + "&&\n");

        int valueA = 75;
        int presentA = 80;
        int valueB = 70;
        int presentB = 90;

        // Operation Boolean in here with &&
        boolean passA = (valueA >= 75) && (presentA >= 75);
        boolean passB = (valueB >= 75) && (presentB >= 75);

        // Print by not a real Value with !
        System.out.println("Real Value passA = " + passA);
        System.out.println("Real Value passB = " + passB);
        System.out.println("\nnot Value passA = " + !passA);
        System.out.println("not Value passB = " + !passB);

        // Operation Boolean with ||
        if (passA || passB) {
            System.out.println("\nCongrats!");
        }
    }

}
