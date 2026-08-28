package co.learn;

public class Variables {
    public static void main(String[] args) {
        // Variables

        // var --> automatically detected by Java but make sure / Assigning first the value of variable
        var variableVar = 20.43f; // --> Assigning first this case the Value is float Number

        // int
        int variableInt; // --> if we declare we can assign next line code

        // String
        String variableStr = "Mochammad Jihan Isfalana"; // --> Don't use Space, tab, etc. for variables name
        String strStringVar;
        strStringVar = variableStr + " Ganteng Banget Euy!";

        // long
        long variable_Long = 12000000L; // --> use underscore to change the whitespace

        // Print Out to the Terminal
        System.out.println(variableVar);
        variableInt = 21;
        System.out.println(variableInt);
        System.out.println(variableStr);
        System.out.println(strStringVar);
        System.out.println(variable_Long);
    }

}
