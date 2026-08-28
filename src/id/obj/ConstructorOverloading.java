package id.obj;

public class ConstructorOverloading {
    String Crole = "AI Engineer";
    String Cname = "Mochammad Jihan Isfalana";
    float Cexp = 3.5f;
    public static void main(String[] args) {
        // Constructor Overloading
        ConstructorOverloading person1 = new ConstructorOverloading();
        System.out.println("\nHello, My name is " + person1.Cname + " and I am an " + person1.Crole + ", and I have experienced for " + person1.Cexp + " years.");

        ConstructorOverloading person2 = new ConstructorOverloading("Finance Staff");
        System.out.println("\nHello, My name is " + person2.Cname + " and I am a " + person2.Crole + ", and I have experienced for " + person2.Cexp + " years.");

        ConstructorOverloading person3 = new ConstructorOverloading("Finance Staff", "Ade Putri", 3.2f);
        System.out.println("\nHello, My name is " + person3.Cname + " and I am a " + person3.Crole + ", and I have experienced for " + person3.Cexp + " years.");

        System.out.println();
    }

    ConstructorOverloading(String role, String name, float exp) { // --> first Constructor
        Crole = role; // There are 3 Field with 3 parameters
        Cname = name;
        Cexp = exp;
    }

    ConstructorOverloading(String role) { // --> this is Overloading the first Constructor 
        Crole = role; // --> Just Need one field to set
    }

    ConstructorOverloading() {
        // --> And you can Overloading too without declare any field in here!
    }
}
