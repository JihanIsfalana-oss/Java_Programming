package id.object;

public class SuperApp {
    // --> THIS CLASS FOR RUNNING THE SUPER KEYWORD FILE
    public static void main(String[] args) {
        var super1 = new SuperKeyword(); // --> We Can Access if we Instansiate the Parent Class
        super1.run("Pffttt", "Mouse");

        var super2 = new SuperAccess(); // --> the Method from Parent Class Can't be access because it has been Overrided
        super2.run("SSSttttt", "Snake");

        var super3 = new SuperClass();
        super3.run("Wooghh!!", "Bulldog"); // --> we access the parent method by super keyword

        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        var super4 = new SuperConstructor("Mochammad Jihan Isfalana", "AI Engineer");
        System.out.println(super4.name);
        System.out.println(super4.job);
        super4.person("Eka Melinda", "HouseWife");

        var super5 = new SuperConstructorAccess("Alifasya", "Lead Developer");
        System.out.println(super5.name);
        System.out.println(super5.job);
        super5.person("Ibrahima Konate", "Manager IT");
    }

}
