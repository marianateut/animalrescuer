package org.fasttrackit;

public class Snake  extends Animal {


    public Snake(String name) {
        super(name);
    }


    public String positiveMod(){

        return "Snake run";
    }

    public void action(){
        System.out.println("Snake biting");
    }
}
