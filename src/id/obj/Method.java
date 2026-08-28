package id.obj;

public class Method {
    public static void main(String[] args) {
        // Method from Object Oriented Programming
        Person person1 = new Person();

        person1.introduction("Mochammad Jihan Isfalana"); // --> called as an object method
    }
}

class Person {
    public void introduction(String name) { // --> this is Method from class Person
        System.out.println("Hello, My Name is " + name);
    }
}
