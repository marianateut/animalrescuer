package org.fasttrackit;

public class Snake  extends Animal {
    private final String name;
    //constructor

    public Snake(String name){
        this.name = name;
    }
    public void action(){
        System.out.println("Snake biting");
    }
}
