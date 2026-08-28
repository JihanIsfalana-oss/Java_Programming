package id.obj;

public class Field {
    // Declaration Field
    String name;
    int age;
    public static void main(String[] args) {
        // Field
        Field person1 = new Field(); // Make the Object "Field"

        person1.name = "Mochammad Jihan Isfalana"; // This is assignment for person1 field
        person1.age = 21;

        System.out.println(person1.name); // --> this is print out the field of name by person1 object
        System.out.println(person1.age);

        System.out.println(Integer.toHexString(person1.hashCode())); // --> this is the address
    }

}
