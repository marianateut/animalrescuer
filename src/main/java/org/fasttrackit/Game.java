package org.fasttrackit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Game {
    AnimalRescuer rescuer;
    Animal animal;
    Veterinarian vet;

    private List<AnimalFood> availableFoods = new ArrayList<>();
    private RecreationActivity[] availableActivities = new RecreationActivity[3];
    private List<Animal> availableAnimals = new ArrayList<>();
    private List<AnimalRescuer> availableRescuers = new ArrayList<>();


    public void start() throws Exception {
        System.out.println("***Welcome to AnimalRescuer***");

        // String nameAnimalRescuer = getSelectedAnimalRescuerFromUser();
        initRescuer(1);
        initAnimal(1);
        //  initFoods();
        // initActivities();
        // displayAvailableFoods();
        // displayActivities();
//        requireFeeding();
//        requireActivity();
        boolean winnerNotKnown = true;
        int roundsNumber = 1;

        while (winnerNotKnown == true && roundsNumber <= 3) {
            for (Animal animal : availableAnimals) {
                System.out.println("Day " + roundsNumber + ":");
                requireFeeding();
                System.out.println();

                requireActivity();
                System.out.println();

                if (animal.getLevelOfTheFeelingOfHunger() >= 8 | animal.getMoodLevel() <= 3) {
                    winnerNotKnown = false;
                    System.out.println("Sorry! You didn't take care of " + animal.getName() + ". You lost!");
                } else
                    animal.positiveMod();
                roundsNumber++;
                animal.setLevelOfTheFeelingOfHunger(animal.getLevelOfTheFeelingOfHunger() + 1);
                animal.setMoodLevel(animal.getMoodLevel() - 1);
                System.out.println();
            }
        }
        if (winnerNotKnown == true)

            System.out.println("Your animal is fed now and is happy, you won !");

    }

    private String getSelectedAnimalRescuerFromUser() {
        System.out.println("Please enter your name for your rescuer:");
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        if (Pattern.matches("[a-zA-z]+", name))
            return name;
        else {
            System.out.println("Please enter a valid name!");
            return getSelectedAnimalRescuerFromUser();
        }
    }

    private void initRescuer(int rescuersCount) {
        AnimalRescuer rescuer = new AnimalRescuer(getSelectedAnimalRescuerFromUser(), 2.00);
        System.out.println("Hello " + rescuer.getName() + "!");
        System.out.println("Your budget is: " + rescuer.getAmountOfMoney() + "$");
        availableRescuers.add(rescuer);
        getAnimalFromUser();
    }

    private String getAnimalFromUser() {
        System.out.println("Choose the animal you want to rescue (dog/cat) :");
        Scanner scanner = new Scanner(System.in);
        String animalFromUser = scanner.nextLine();
        if ((Pattern.matches("[a-zA-z]+", animalFromUser)) &&
                (animalFromUser.equalsIgnoreCase("Cat") | animalFromUser.equalsIgnoreCase("Dog"))) {
            System.out.println("You rescued : " + animalFromUser);
        } else {
            System.out.println("Please choose dog/cat !");
            getAnimalFromUser();
        }
        return animalFromUser;
    }

    private String getAnimalNameFromUser() {
        System.out.println("Please enter your animal 's name");
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        if (Pattern.matches("[a-zA-z]+", name))
            return name;
        else {
            System.out.println("Please enter a valid name!");
            return getAnimalNameFromUser();
        }
    }

    private void initAnimal(int animalsCount) {

        // for (int i = 0; i < animalsCount; i++) {
        Animal animal = new Dog(getAnimalNameFromUser());
        animal.setAge(2.0);
        animal.setLevelOfHeath(2);
        animal.setLevelOfTheFeelingOfHunger(3);
        animal.setFavoritFoodNames("purina");
        animal.setFavoritRecreationalNames("run");
        animal.setMoodLevel(6);
        System.out.println();

        availableAnimals.add(animal);
    }

    private void requireFeeding() throws Exception {
        System.out.println("Your animal is hungry, please feed him.");
        System.out.println("Choose a type of food by number : ");
        initFoods();
        displayAvailableFoods();
        Scanner scanner = new Scanner(System.in);
        for (AnimalRescuer animalRescuer : availableRescuers) {
            for (AnimalFood animalFood : availableFoods) {
                for (Animal animal : availableAnimals) {
                    try {
                        int foodNumberFromUser = scanner.nextInt();

                        System.out.println("Selected food :" + foodNumberFromUser);
                        animalRescuer.feedAnimal(animal, animalFood);
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException exception) {
                        System.out.println("Invalid food number !");

                        requireFeeding();
                    }
                }
            }
        }
    }

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
                    RecreationActivity recreationActivity = availableActivities[activityNumberFromUser - 1];
                    System.out.println("Selected activity : " + recreationActivity.getRecreationActivityName());
                    rescuer.recreationGame(recreationActivity, animal);
                } catch (ArrayIndexOutOfBoundsException | InputMismatchException exception) {
                    System.out.println("Invalid activity");
                    requireActivity();
                }
            }
        }
    }

    private void initFoods() throws Exception {
        int availfoodCount = getAvailFoodCountFromUser();
        System.out.println("Today's available foods is.");
        for (int i = 0; i < availfoodCount; i++) {
            AnimalFood food = new AnimalFood();
            food.setName("pedigree");
            availableFoods.add(food);

            AnimalFood food1 = new AnimalFood();
            food1.setName("purina");
            availableFoods.add(food1);
        }
    }

    private int getAvailFoodCountFromUser() throws Exception {
        System.out.println("please enter number of availfood: ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("You entered an invalid number.");
        }finally {

        }
    }

        private void initActivities () {
            RecreationActivity recreationActivity1 = new RecreationActivity("Run");
            recreationActivity1.setRecreationActivityName("run");
            availableActivities[0] = recreationActivity1;

            RecreationActivity recreationActivity2 = new RecreationActivity("game ball");
            recreationActivity2.setRecreationActivityName("game ball");
            availableActivities[1] = recreationActivity2;

        }

        private void displayAvailableFoods () {
            int count = 1;
            System.out.println("Available animalFoods are:");
            for (AnimalFood animalFood : availableFoods) {
                if (availableFoods != null) {
                    System.out.println(count + "." + animalFood.getName());
                    count++;
                } else {
                    System.out.println(count + ".I don't want to feed " + animal.getName() + " today.");
                }
            }
        }
        private void displayActivities () {
            System.out.println("Available activities:");
            for (int j = 0; j < availableActivities.length; j++) {
                if (availableActivities[j] != null) {
                    System.out.println((j + 1) + ". " + availableActivities[j].getRecreationActivityName());
                }
            }
        }
    }