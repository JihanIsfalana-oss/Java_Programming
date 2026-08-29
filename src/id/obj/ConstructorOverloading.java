package id.obj;

public class ConstructorOverloading {
    String Crole = "AI Engineer";
    String Cname = "Mochammad Jihan Isfalana";
    public static void main(String[] args) {
        // Constructor Overloading
        ConstructorOverloading person1 = new ConstructorOverloading();
        System.out.println("\nHello, My name is " + person1.Cname + " and I am an " + person1.Crole);

        ConstructorOverloading person2 = new ConstructorOverloading("Finance Staff");
        System.out.println("\nHello, My name is " + person2.Cname + " and I am a " + person2.Crole);

        ConstructorOverloading person3 = new ConstructorOverloading("Finance Staff", "Ade Putri");
        System.out.println("\nHello, My name is " + person3.Cname + " and I am a " + person3.Crole);

        System.out.println();
    }

    ConstructorOverloading(String role, String name) { // --> first Constructor
        Crole = role; // There are 2 Field with 2 parameters
        Cname = name;
    }

    ConstructorOverloading(String role) { // --> this is Overloading the first Constructor 
        this(role, null); // --> Just Need one field to set
    }

    ConstructorOverloading() {
        this(null);// --> And you can Overloading too without declare any field in here!
    }
}
