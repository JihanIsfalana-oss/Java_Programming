package id.obj;

public class classObject { // --> this is named by class : blueprint for Object
    public static void main(String[] args) {
        // Class and Object

        Object person1 = new Object(); // --> this is called by Object : Result from Blueprint of Class

        System.out.println(Integer.toHexString(person1.hashCode())); // this is the Address of Memory person1
    }

}
