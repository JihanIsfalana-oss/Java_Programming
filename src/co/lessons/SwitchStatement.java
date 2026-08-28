package co.lessons;

public class SwitchStatement {
    public static void main(String[] args) {
        // Switch Statement

        String Exam = "A";

        // Basic Switch
        switch (Exam) {
            case "A" : {
                System.out.println("\nYour Exam = " + Exam);
                break;
            }
            case "B" : {
                System.out.println("\nYour Exam = " + Exam);
                break;
            }
            default : {
                System.out.println("\nYou not in school!");
                break;
            }
        }

        // Switch Lambda
        String value = null;
        switch (Exam) {
            case "A" -> value = "Your Exam = " + Exam;
            case "B" -> value = "Your Exam = " + Exam;
            case "C" -> value = "Your Exam = " + Exam;
            case "D" -> value = "Your Exam = " + Exam;
            default -> {
                System.out.println("Sorry your Value is not valid!");
            }
        };

        System.out.println(value);

        // Switch Lambda + Yield (Java 14++)
        String values = switch (Exam) {
            case "A" : 
                yield ("Your Exam = " + Exam);
            case "B" :
                yield ("Your Exam = " + Exam);
            case "C" :
                yield ("Your Exam = " + Exam);
            case "D" :
                yield ("Your Exam = " + Exam);
            default : 
                yield ("Your Value isn't Available!");
        };

        System.out.println(values);
    }

}
