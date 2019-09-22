package org.fasttrackit;

public class Animal {
    String name;
    Double age;
    int levelOfHeath;
    int levelOfTheFeelingOfHunger;
    int moodLevel;
    String favoritFoodNames;
    String favoritRecreationalNames;


    public void eat() {
        System.out.println("Animal eating");

    }
    public void action() {
        // avem nevoie de această metodă deoarece vom crea un vector
        // cu instanțe Animal și vom apela această metodă pe ele
    }
}