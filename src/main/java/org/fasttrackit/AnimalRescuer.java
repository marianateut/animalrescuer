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

    public void feedAnimal (Animal animalName, AnimalFood foodName ) {

        animalName.setLevelOfTheFeelingOfHunger(10);
        int newLevel = animalName.getLevelOfTheFeelingOfHunger()- 1;
        if (foodName.equals(animalName.getFavoritFoodNames())) {

            System.out.println(name + " just gave some " + foodName + " to " + animalName + " and " + animalName + " new happiness state is: " + newLevel);
        }
        else {
            System.out.println(name + " just gave some " + foodName + " to " + animalName + " and " + animalName +
                    " happiness state is: " + animalName.getLevelOfTheFeelingOfHunger());
        }
    }


    public void recreationGame (RecreationActivity recreationActivityName, Animal animalName) {

        animalName.setLevelOfTheFeelingOfHunger(1);
        int newLevel = animalName.getLevelOfTheFeelingOfHunger() + 2;
        int newLevel1 = animalName.getLevelOfTheFeelingOfHunger()+1;
        if (recreationActivityName.equals(animalName.getFavoritRecreationalNames())) {
            System.out.println(name + " has funny " + recreationActivityName + " with " + animalName + " and " + animalName + " new happiness level is: " + newLevel);
        }
        else {
            System.out.println(name + " has funny " + recreationActivityName + " with " + animalName + " and " + animalName + " new happiness level is: " + newLevel1);
        }


    }



}

