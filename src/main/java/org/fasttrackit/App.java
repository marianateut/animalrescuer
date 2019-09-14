package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {   AnimalFood animalFood = new AnimalFood();
    animalFood.name = " royal Dog " ;
    animalFood.price = 57.02;
    animalFood.data = " 21.03.2018 " ;
    animalFood.availabilityInStock = true;
        System.out.println(animalFood.name);
        System.out.println(animalFood.price);
        System.out.println(animalFood.data);


        Animal animal = new Animal();
        animal.name = "Dog";
        animal.age = 6.00;
        animal.levelOfHeath = 5;
        animal.levelOfTheFeelingOfHunger = 4;
        animal.moodLevel = 2;
        animal.favoritFoodNames = "Royal dog";
        animal.favoritRecreationalNames = "Run";

        System.out.println(animal.name);
        System.out.println(animal.age);
        System.out.println(animal.levelOfHeath);
        System.out.println(animal.levelOfTheFeelingOfHunger);
        System.out.println(animal.moodLevel);
        System.out.println(animal.favoritFoodNames);
        System.out.println(animal.favoritRecreationalNames);

        Animal animal2 = new Animal();
        animal2.name = "Cat";
        animal2.age = 5.00;
        animal2.levelOfHeath = 2;
        animal2.levelOfTheFeelingOfHunger = 7;
        animal2.moodLevel = 5;
        animal2.favoritFoodNames = "Royal ";
        animal2.favoritRecreationalNames = "ball Game";


        System.out.println("animal2.name:" + animal2.name);
        System.out.println("Animal1 name:" + animal.name);

        AnimalRescuer animalRescuer = new AnimalRescuer();
        animalRescuer.name = " Girl" ;
        animalRescuer.amountOfMoney = 50.00;
        System.out.println(animalRescuer.name);
        System.out.println(animalRescuer.amountOfMoney);

        RecreationActivity recreationActivity = new RecreationActivity();
         recreationActivity.name = "ball game";
        System.out.println(recreationActivity.name);

        Veterinarian veterinarian =new Veterinarian();
        veterinarian.name = "medic";
        veterinarian.specialization = " assistant";
        System.out.println(veterinarian.name);
        System.out.println("Veterinarian specialization: " + veterinarian.specialization);
        return;







    }
}
