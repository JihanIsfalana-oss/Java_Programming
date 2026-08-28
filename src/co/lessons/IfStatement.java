package co.lessons;

public class IfStatement {
    public static void main(String[] args) {
        // If Statement
        float exam = 75.5f;
        float present = 82.33f;

        boolean pass = (exam >= 75) && (present >= 75);
        boolean loss = (exam < 75) && (present < 75);

        // This is if statement
        if (pass) {
            System.out.println("\nCongratulations you pass the Examination!\n");
        }

        // this is if else statement
        if (pass) {
            System.out.println("\nNo, you pass the exam not loss!\n");
        } else {
            System.out.println("Yes You loss the exam!");
        }

        // this is if else if statement
        if (pass) {
            System.out.println("\nNo, you pass the exam not loss!\n");
        } else if (loss) {
            System.out.println("Yes You loss the exam!");
        } else {
            System.out.println("You Not in School!");
        }
    }

}
