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

        if(animal.getFavoritFoodNames().equals(animalFood.getName())) {

            System.out.println(name + " just gave some " + animalFood.getName() + " to "  + animal.getName() + " new happiness state is: " + (animal.getLevelOfTheFeelingOfHunger()+1));
        }
       else {
            System.out.println(name + " just gave some " + animalFood.getName()+ " to " + animal.getName() +" happiness state is: " +(animal.getLevelOfTheFeelingOfHunger()-1) );
        }
    }



    public void recreationGame (RecreationActivity recreationActivity, Animal animal) {
       // animal.setLevelOfTheFeelingOfHunger(2);

        if (animal.getFavoritRecreationalNames().equals(recreationActivity.getRecreationActivityName())) {
            System.out.println(name + " has funny " + recreationActivity.getRecreationActivityName() + " with " + animal.getName() +  " new happiness level is: " +(animal.getLevelOfTheFeelingOfHunger() +1));
        }
        else {
            System.out.println(name + " has funny " + recreationActivity.getRecreationActivityName() + " with " + animal.getName() +  " new happiness level is: " + (animal.getLevelOfTheFeelingOfHunger()+2));
        }


    }



}

