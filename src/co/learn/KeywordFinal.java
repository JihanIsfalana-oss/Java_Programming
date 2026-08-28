package co.learn;

public class KeywordFinal {
    public static void main(String[] args) {
        // Keyword final ---> Constant Cannot Change the Value!

        // Example ---> Case: Result Exam Student
        String name = "Mochammad Jihan Isfalana";
        final float GPA = 3.88f; // --> this variable GPA isn't available to change the value

        // GPA = 3.55f; ||| ---> this is error!

        // Print Out to the Terminal
        System.out.println("Name\t: " + name);
        System.out.println(GPA);
    }

}
