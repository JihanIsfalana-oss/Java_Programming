package id.obj;

class VariableShadowing {
    String name;
    String address;
    final String Country = "Indonesia";

    VariableShadowing(String name, String address) {
        // address = address --> field can't be modified because this address refers to parameter
        // but we can make it different naming or use keyword this
        this.name = name; // --> solved variable shadowing using keyword this
        this.address = address;
    }

    VariableShadowing(String name) { // --> Constructor Overloading
        // address = address --> field can't be modified because this address refers to parameter
        // but we can make it different naming or use keyword this
        this(name, null);
    }

    void person(String name, String address){
        this.name = name;
        this.address = address;

        System.out.println("Hello My name is\t: " + this.name + " And I Living In " + this.address);
    }
}
