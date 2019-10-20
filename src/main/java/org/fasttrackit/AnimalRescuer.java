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



    public void feedAnimal (Animal firstAnimal, AnimalFood animalFood ) {

        firstAnimal.setLevelOfTheFeelingOfHunger(4);
        int newLevel = firstAnimal.getLevelOfTheFeelingOfHunger()-1;
        if (animalFood.equals(firstAnimal.getFavoritFoodNames())) {


            System.out.println(name + " just gave some " + animalFood.getName() + " to "  + firstAnimal.getName() + " new happiness state is: " + newLevel);
        }
       else {
            System.out.println(name + " just gave some " + animalFood.getName()+ " to " + firstAnimal.getName() +" happiness state is: " + firstAnimal.getLevelOfTheFeelingOfHunger());
        }
    }



    public void recreationGame (RecreationActivity recreationActivity, Animal animal) {
        animal.setLevelOfTheFeelingOfHunger(2);
        int newLevel = animal.getLevelOfTheFeelingOfHunger() +1;
        int newLevel1 = animal.getLevelOfTheFeelingOfHunger()+2;
        if (recreationActivity.equals(animal.getFavoritRecreationalNames())) {
            System.out.println(name + " has funny " + recreationActivity.getRecreationActivityName() + " with " + animal.getName() +  " new happiness level is: " + newLevel);
        }
        else {
            System.out.println(name + " has funny " + recreationActivity.getRecreationActivityName() + " with " + animal.getName() +  " new happiness level is: " + newLevel1);
        }


    }



}

