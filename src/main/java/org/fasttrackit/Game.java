package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    AnimalRescuer rescuer;
    Animal animal;
    Veterinarian vet;

    private List<AnimalFood> availableFoods = new ArrayList<>();
    private RecreationActivity[] availableActivities = new RecreationActivity[3];


    public void start() {
        initFoods();
        initActivities();
        displayAvailableFoods();
        displayActivities();
    }

    private void initFoods() {
        int availfoodCount = 2;
        System.out.println("Today's available foods is:");
        for (int i = 0; i < availfoodCount; i++) {
            AnimalFood availFood = new AnimalFood();
            availFood.setName("availfood: " + i);
            //food.setPrice(ThreadLocalRandom.current().nextDouble(23));

            System.out.println(availFood);

            availableFoods.add(availFood);

        }
    }

//    private int getAvailFoodCountFromUser() {
//        System.out.println("please enter number of availfood: ");
//        Scanner scanner = new Scanner(System.in);
//        try{
//            return  scanner.nextInt();
//        }catch (inputMismachException e){throw new Exception('You entered an invalid number.');
//        finally{
//                System.out.println("Finally block is always executer");
//    }


    private void initActivities(){
        RecreationActivity recreationActivity1 = new RecreationActivity("Run");
         recreationActivity1.setRecreationActivityName("run");
         availableActivities[0]=recreationActivity1;

         RecreationActivity recreationActivity2 =new RecreationActivity("game ball");
         recreationActivity2.setRecreationActivityName("game ball");
         availableActivities[1]=recreationActivity2;

    }
    private void displayAvailableFoods(){
        System.out.println("Available foods are:");
        for(AnimalFood availFood: availableFoods){
            if(availFood.getName()!=null){
                System.out.println(availFood.getName());}
        }
    }

    private void displayActivities() {
        System.out.println("Available activities:");
        for (int j = 0; j < availableActivities.length; j++) {
            if (availableActivities[j] != null) {
                System.out.println((j + 1) + ". " + availableActivities[j].getRecreationActivityName());
            }
        }
}}