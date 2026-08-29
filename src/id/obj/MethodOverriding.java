package id.obj;

class MethodOverriding {
    public String sound;
    public String animal;

    public void run(String sound, String animal) { // --> Real Method
        this.sound = sound;
        this.animal = animal;

        System.out.println(this.animal + " is runaway with sounding " + this.sound);
    }
}

class Overriding extends MethodOverriding {
    public void run(String sound, String animal) { // --> Override Method
        this.sound = sound;
        this.animal = animal;

        System.out.println(this.animal + " is running with sounding " + this.sound);
    }
}
