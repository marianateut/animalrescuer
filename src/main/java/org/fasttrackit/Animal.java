package org.fasttrackit;

public class Animal {
    private String name;
    private Double age;
    private int levelOfHeath;
    private int levelOfTheFeelingOfHunger;
    private int moodLevel;
    private String favoritFoodNames;
    private String favoritRecreationalNames;

    //constructor

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {}

    //getter and setter
    public String getName() {
        return name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public int getLevelOfHeath() {
        return levelOfHeath;
    }

    public void setLevelOfHeath(int levelOfHeath) {
        this.levelOfHeath = levelOfHeath;
    }

    public int getLevelOfTheFeelingOfHunger() {
        return levelOfTheFeelingOfHunger;
    }

    public void setLevelOfTheFeelingOfHunger(int levelOfTheFeelingOfHunger) {
        this.levelOfTheFeelingOfHunger = levelOfTheFeelingOfHunger;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavoritFoodNames() {
        return favoritFoodNames;
    }

    public void setFavoritFoodNames(String favoritFoodNames) {
        this.favoritFoodNames = favoritFoodNames;
    }

    public String getFavoritRecreationalNames() {
        return favoritRecreationalNames;
    }

    public void setFavoritRecreationalNames(String favoritRecreationalNames) {
        this.favoritRecreationalNames = favoritRecreationalNames;
    }





    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", levelOfHeath=" + levelOfHeath +
                ", levelOfTheFeelingOfHunger=" + levelOfTheFeelingOfHunger +
                ", moodLevel=" + moodLevel +
                ", favoritFoodNames='" + favoritFoodNames + '\'' +
                ", favoritRecreationalNames='" + favoritRecreationalNames + '\'' +
                '}';
    }

    public void eat() {
        System.out.println("Animal eating");

    }

    public void action() {
        // avem nevoie de această metodă deoarece vom crea un vector
        // cu instanțe Animal și vom apela această metodă pe ele
    }


    public String positiveMod() {
        return "The animal is happy.";
    }



}