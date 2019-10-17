package org.fasttrackit;

class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }


    public String positiveMod(){

        return "THe dog gives the tail if";
    }

    public void action() {
    System.out.println("Dog howling");
}

    public void eat() {
        System.out.println("Dog eating");
    }
}


