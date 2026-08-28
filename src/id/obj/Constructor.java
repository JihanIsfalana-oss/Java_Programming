package id.obj;

class Constructor {
    String name;
    int age;
    public static void main(String[] args) {
        Constructor person1 = new Constructor("Mochammad Jihan Isfalana", 21);
        System.out.println("My Name = " + person1.name);
        System.out.println("My Age = " + person1.age);

        Constructor person2 = new Constructor("Ade Putri", 23);
        System.out.println("My Name = " + person2.name);
        System.out.println("My Age = " + person2.age);
    }

    Constructor(String paramN, int paramA) { // --> This Called by Construction!
        name = paramN;
        age = paramA;
        // The Constructor may not have a statement or parameter if you don't need that
    }
}
