package org.fasttrackit;


import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        Animal animal = new Animal("Chaika");

       // animal.setName("Chaika");
        animal.setAge(6.00);
        animal.setLevelOfHeath(5);
        animal.setLevelOfTheFeelingOfHunger(4);
        animal.setMoodLevel(2);
        animal.setFavoritFoodNames("purina");
        animal.setFavoritRecreationalNames("run");

        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getLevelOfHeath());
        System.out.println(animal.getLevelOfTheFeelingOfHunger());
        System.out.println(animal.getMoodLevel());
        System.out.println(animal.getFavoritFoodNames());
        System.out.println(animal.getFavoritRecreationalNames());


        Animal animal2 = new Animal("cat");

       // animal2.setName("cat");
        animal2.setAge(5.00);
        animal2.setLevelOfHeath(2);
        animal2.setLevelOfTheFeelingOfHunger(7);
        animal2.setMoodLevel(5);
        animal2.setFavoritFoodNames("royal");
        animal2.setFavoritRecreationalNames("ball game");


        System.out.println("animal2.name:" + animal2.getName());
        System.out.println("Animal1 name:" + animal.getName());

        AnimalRescuer animalRescuer = new AnimalRescuer("John",50.0);
       // animalRescuer.setName("John");

      //  animalRescuer.setAmountOfMoney(50.00);
        System.out.println(animalRescuer.getName());
        System.out.println(animalRescuer.getAmountOfMoney());

        AnimalFood animalFood = new AnimalFood("purina",57.02);

        //animalFood.setName("Purina");

       // animalFood.setPrice(57.02);
        animalFood.setData(LocalDate.of(2019, 9, 16));
        animalFood.setAvailabilityInStock(true);
        System.out.println(animalFood.getName());
        System.out.println(animalFood.getPrice());
        System.out.println(animalFood.getData());


        Animal firstAnimal = new Animal("Chaika");
       // firstAnimal.setName("Chaika");


        System.out.println(animalRescuer.getName() + " " + "just give some" + " " + animalFood.getName() +
                " " + "to" + " " + firstAnimal.getName());


        animalRescuer.feedAnimal(firstAnimal,animalFood );

          RecreationActivity recreationActivity = new RecreationActivity("run");
         recreationActivity.setRecreationActivityName("ball game");
         System.out.println(recreationActivity.getRecreationActivityName());


         animalRescuer.recreationGame(recreationActivity,animal);

        Veterinarian veterinarian = new Veterinarian("Andrei");
       // veterinarian.setName("Andrei");
        veterinarian.setSpecialization("assistant");
        System.out.println(veterinarian.getName());
        System.out.println("Veterinarian specialization: " + veterinarian.getSpecialization());



        Animal a[] = new Animal[2];

        a[0] = new Dog("tom");
        a[1] = new Snake("eri");

        for (int i = 0; i < a.length; i++) {

            a[i].eat();
            System.out.println("positive mood is:" + a[i].positiveMod() );
            a[i].positiveMod();
            // acum că ele sunt numite la fel, putem apela metoda action
            // din clasa Animal (observați de ce a fost nevoie să definim
            // metoda action în clasa Animal), iar metoda corespunzătoare
            // va fi apelată pentru tipul specific al instanței a[i]

            a[i].action();



        }


    }
}
