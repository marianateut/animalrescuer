package org.fasttrackit;

class Dog extends Animal{
    private final String name;
//constructor
    public Dog(String name){
        this.name = name;
    }

    public void action() {
    System.out.println("Dog howling");
}

    public void eat() {
        System.out.println("Dog eating");
    }
}


