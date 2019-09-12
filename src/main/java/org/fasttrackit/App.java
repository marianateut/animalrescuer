package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   Animal animal = new Animal();
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
        animal2.favoritRecreationalNames = "Game";


        System.out.println("animal2.name:" + animal2.name);
        System.out.println("Animal1 name:" + animal.name);





    }
}
