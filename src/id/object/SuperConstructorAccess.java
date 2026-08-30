package id.object;

class SuperConstructorAccess extends SuperConstructor{
    
    SuperConstructorAccess(String name, String job) {
        super(name, job); // --> we must create constructor if the parent is there constructor too and accessing with super
    }

    public void person(String name, String job) {
        this.name = name;
        this.job = job;

        System.out.println("Hai, My Name is " + this.name + " And I am a " + this.job + "\n");
    }
}
