package id.object;

class SuperConstructor {
    public String name;
    public String job;

    SuperConstructor(String name, String job) {
        this.name = name;
        this.job = job;
    }

    SuperConstructor(String name) {
        this(name, null);
    }

    public void person(String name, String job) {
        this.name = name;
        this.job = job;

        System.out.println("Hello, My Name is " + this.name + " And I am a " + this.job + "\n");
    }

}
