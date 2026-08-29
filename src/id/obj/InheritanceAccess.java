package id.obj;

public class InheritanceAccess { // --> Accessifier for Inheritance Class
    public static void main(String[] args) {
        var Inheritance = new Inheritance(); // --> you can define parent object with his own field and method or any.
        Inheritance.name = "Mochammad Jihan Isfalana";
        Inheritance.age = 21;
        Inheritance.Intro(Inheritance.name, Inheritance.age);

        var InheritanceApp = new InheritanceApp(); // --> and then you can too access by his own child class from inheritance method
        InheritanceApp.name = "Ade Putri";
        InheritanceApp.age = 23;
        InheritanceApp.Intro(InheritanceApp.name, InheritanceApp.age);
    }

}
