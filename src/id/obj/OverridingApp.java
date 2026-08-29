package id.obj;

public class OverridingApp {
    public static void main(String[] args) {
        var Override = new MethodOverriding();
        Override.run("Miawww", "Cat");

        var Ovr = new Overriding();
        Ovr.run("RAWRR", "Lion"); // --> Accessing the Override Method from Class Parent
        // --> NOTE: You Can't Access the Method run from Parent Class Again! 
    }
}
