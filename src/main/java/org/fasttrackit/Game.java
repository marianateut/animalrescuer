package org.fasttrackit;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    AnimalRescuer rescuer;
    Animal animal;
    Veterinarian vet;

    private List<AnimalFood> availableFoods = new ArrayList<>();
    private RecreationActivity[] availableActivities = new RecreationActivity[3];
    private List<Animal> availableAnimals = new ArrayList<>();
    private List<AnimalRescuer> availableRescuers = new ArrayList<>();


    public void start() throws Exception {
       // initFoods();
        String selectedAnimalRescuer = getSelectedAnimalRescuerFromUser();
        initRescuer(1);
        initAnimal(1);

        initActivities();
       // displayAvailableFoods();
        displayActivities();
      requireFeeding();
        requireActivity( );}

    private String getSelectedAnimalRescuerFromUser() {
        System.out.println("Please enter a name for your rescuer :");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (InputMismatchException| ArrayIndexOutOfBoundsException e) {
            System.out.println("you have entered an invalid name");
            return getSelectedAnimalRescuerFromUser();}

        }


    private void initRescuer(int rescuersCount) {
        for (int i = 0; i < rescuersCount; i++) {
            AnimalRescuer rescuer = new AnimalRescuer(getSelectedAnimalRescuerFromUser(), 2.00);
                 getAnimalFromUser();
            System.out.println("Available Amount Of Money :" + String.format("%.0f", rescuer.getAmountOfMoney()));
            availableRescuers.add(rescuer);
        }
    }


    private String getAnimalFromUser() {
        System.out.println("Choose the animal you want to rescue (dog/cat) :");
        Scanner scanner = new Scanner(System.in);
        String animalFromUser = scanner.nextLine();
        if (animalFromUser.matches("dog") || animalFromUser.matches("cat")) {
            System.out.println("You rescued : " + animalFromUser);
        } else {
            System.out.println("Please choose dog/cat !");
            getAnimalFromUser();
        }
        return animalFromUser;
    }
        private String getAnimalNameFromUser() {
            System.out.println("Please select a name for your pet");
//        log.print("Please select a name for your pet : add input in same line");
            Scanner scanner = new Scanner(System.in);
              String animalNameFromUser = scanner.nextLine();
            if (!animalNameFromUser.isEmpty()) {
                System.out.println("Your animal's name is : " + animalNameFromUser);
            } else {
                System.out.println("The name cannot be empty !");
                return getAnimalNameFromUser();
            }
            return animalNameFromUser;

        }

    private void initAnimal(int animalsCount) {
        for (int i = 0; i < animalsCount; i++) {
            Animal animal = new Animal();
            Animal dog = new Animal( getAnimalNameFromUser());
            animal.setAge(2.0);
            animal.setLevelOfHeath(9);
            animal.setLevelOfTheFeelingOfHunger( 10);
            animal.setFavoritFoodNames("purina");
            animal.setFavoritRecreationalNames("walk");
            animal.setMoodLevel(2);
            System.out.println(dog);

            availableAnimals.add(animal);
        }
    }

    private void requireFeeding() throws Exception {
        System.out.println("Your animal is hungry, please feed him.");
        System.out.println("Choose a type of food by number : ");
        initFoods();
        displayAvailableFoods();
        Scanner scanner = new Scanner(System.in);for(AnimalRescuer animalRescuer:availableRescuers){
        for( AnimalFood animalFood:availableFoods){for(Animal animal:availableAnimals){
          try {
              int foodNumberFromUser = scanner.nextInt();

              System.out.println("Selected food :" + foodNumberFromUser);
              animalRescuer.feedAnimal(animal,animalFood);
          }catch(ArrayIndexOutOfBoundsException | InputMismatchException exception){
                System.out.println("Invalid food number !");

                   requireFeeding();
                }
            }
    }}}
    private void requireActivity() {
        System.out.println("Your animal is unhappy, please play with him.");
        System.out.println("Choose an activity by number : ");
        initActivities();
        displayActivities();
        Scanner scanner = new Scanner(System.in);
        for (AnimalRescuer rescuer : availableRescuers) {
            for (Animal animal : availableAnimals) {
                try {
                    int activityNumberFromUser = scanner.nextInt();
                    RecreationActivity   recreationActivity=availableActivities[activityNumberFromUser-1] ;
                    System.out.println("Selected activity : " + recreationActivity.getRecreationActivityName());
                    rescuer.recreationGame(recreationActivity,animal);
                } catch (ArrayIndexOutOfBoundsException | InputMismatchException exception) {
                    System.out.println("Invalid activity");
                   requireActivity();
                }
            }
        }
    }

    private void initFoods() throws Exception {
        int availfoodCount = getAvailFoodCountFromUser();
        System.out.println("Today's available foods is:");
        for (int i = 0; i < availfoodCount; i++) {
            AnimalFood availFood = new AnimalFood();
            availFood.setName( "purina" + i);
//            availFood.setPrice(ThreadLocalRandom.current().nextDouble(23));
//            availFood.isAvailabilityInStock();
            System.out.println(availFood);

            availableFoods.add(availFood);

        }
    }

    private int getAvailFoodCountFromUser() throws Exception {
        System.out.println("please enter number of availfood: ");
        Scanner scanner = new Scanner(System.in);
          try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("You entered an invalid number.");}
          finally
       {
                System.out.println("Finally block is always executer");
        }
    }

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
                System.out.println(availFood.getName()) ;
        }
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