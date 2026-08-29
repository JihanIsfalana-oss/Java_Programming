package id.obj;

public class VariableShadowingApp {
    public static void main(String[] args) {
        VariableShadowing app = new VariableShadowing("Moch", "TeGo"); // --> Define An Object

        System.out.println(app); // --> Accessing the Object Constructor from VariableShadowing Class but that just show address

        System.out.println(app.name); // --> Accessing the Value of the Object
        System.out.println(app.address);
        System.out.println(app.Country);

        app.person("Jihan", "Telaga Golf");
    }

}
