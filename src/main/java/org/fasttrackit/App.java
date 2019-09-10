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
        animal.LevelOfHeath = 5;
        animal.LevelOfTheFeelingOfHunger = 4;
        animal.MoodLevel = 2;
        animal.FavoritFoodNames = "Royal Canin";
        animal.FavoritRecreationalNames = "Run";

        System.out.println(animal.name);
        System.out.println(animal.age);
        System.out.println(animal.LevelOfHeath);
        System.out.println(animal.LevelOfTheFeelingOfHunger);
        System.out.println(animal.MoodLevel);
        System.out.println(animal.FavoritFoodNames);
        System.out.println(animal.FavoritRecreationalNames);

        Animal animal2 = new Animal();
        animal.name = "Cat";
        animal.age = 5.00;
        animal.LevelOfHeath = 2;
        animal.LevelOfTheFeelingOfHunger = 7;
        animal.MoodLevel = 5;
        animal.FavoritFoodNames = "Royal ";
        animal.FavoritRecreationalNames = "Game";

        System.out.println("animal2.name:" + "animal.name");





    }
}
