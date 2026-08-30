package id.object;

public class SuperKeyword {
    public String sound;
    public String animal;

    // We Can't Access this method by his own child class without super keyword
    public void run(String sound, String animal) { // --> Real Method
        this.sound = sound;
        this.animal = animal;

        System.out.println(this.animal + " is runaway with sounding " + this.sound);
    }
}

class SuperAccess extends SuperKeyword {
    public void run(String sound, String animal) { // --> Override Method
        this.sound = sound;
        this.animal = animal;

        System.out.println(this.animal + " is running with sounding " + this.sound);
    }
}

class SuperClass extends SuperKeyword {
    public void run(String sound, String animal) { // --> Override Method
        this.sound = sound;
        this.animal = animal;

        super.run(sound, animal); // --> Accessing the Parent Class Method
    }
}
