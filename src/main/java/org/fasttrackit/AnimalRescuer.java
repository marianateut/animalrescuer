package org.fasttrackit;

import java.io.OptionalDataException;

public class AnimalRescuer {
    public String Name;
    private String name;
    private Double amountOfMoney;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void animalRescuer(Animal animalName, AnimalRescuer foodName) {
        System.out.println("John just gave some Purina food to Chaika");


    }

    public void feedAnimal (Animal animal, AnimalFood animalFood ) {

        animal.setLevelOfTheFeelingOfHunger(10);
        int newLevel = animal.getLevelOfTheFeelingOfHunger()- 1;
        if (animalFood.equals(animal.getFavoritFoodNames())) {

            System.out.println(name + " just gave some " + animalFood + " to " + animal + " and " + animal + " new happiness state is: " + newLevel);
        }
        else {
            System.out.println(name + " just gave some " + animalFood + " to " + animal + " and " + animal +
                    " happiness state is: " + animal.getLevelOfTheFeelingOfHunger());
        }
    }


    public void recreationGame (RecreationActivity recreationActivity, Animal animal) {

        animal.setLevelOfTheFeelingOfHunger(1);
        int newLevel = animal.getLevelOfTheFeelingOfHunger() + 2;
        int newLevel1 = animal.getLevelOfTheFeelingOfHunger()+1;
        if (recreationActivity.equals(animal.getFavoritRecreationalNames())) {
            System.out.println(name + " has funny " + recreationActivity + " with " + animal + " and " + animal + " new happiness level is: " + newLevel);
        }
        else {
            System.out.println(name + " has funny " + recreationActivity + " with " + animal + " and " + animal + " new happiness level is: " + newLevel1);
        }


    }



}

