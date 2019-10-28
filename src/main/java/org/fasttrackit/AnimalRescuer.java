package org.fasttrackit;

import java.io.OptionalDataException;


public class AnimalRescuer {
    public String Name;
    private String name;
    private Double amountOfMoney;
//constructor

    public AnimalRescuer(String name, Double amountOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
    }

    //getter and setter
    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

   /* public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }*/

    @Override
    public String toString() {
        return super.toString();
    }



    public void feedAnimal (Animal animal, AnimalFood animalFood ) {
        System.out.println(name + " just gave some " + animalFood.getName() + " to "  + animal.getName());
        double hungerLevel = animal.getLevelOfTheFeelingOfHunger() - 1;
        System.out.println(animal.getName() + " 's hunger level is : " + String.format( "%.0f", hungerLevel));

        if (animal.getFavoritFoodNames().equals(animalFood.getName())) {
            double happyLevel = animal.getLevelOfTheFeelingOfHunger() + 1;
            System.out.println("and happy status is : " + String.format( "%.0f", happyLevel));
        }
    }



    public void recreationGame (RecreationActivity recreationActivity, Animal animal) {
        System.out.println(name + " has funny " + recreationActivity.getRecreationActivityName() + " with " + animal.getName());

        double hLevel = animal.getLevelOfTheFeelingOfHunger() + 1;
        System.out.println(animal.getName() + "'s happiness : " + String.format( "%.0f",hLevel));

        if (animal.getFavoritRecreationalNames().equals(recreationActivity.getRecreationActivityName())) {
            double hLevel2 = animal.getLevelOfTheFeelingOfHunger() + 2;
            System.out.println("That's " + animal.getName() + " 's favourite activity, happiness : " + String.format( "%.0f", hLevel2));
        }
    }



}

