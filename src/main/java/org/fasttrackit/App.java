package org.fasttrackit;



import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

            AnimalRescuer animalRescuer = new AnimalRescuer();
            animalRescuer.setName("John");

            AnimalFood animalFood = new AnimalFood();
            animalFood.setName("Purina");

            Animal firstAnimal = new Animal();
            firstAnimal.setName("Chaika");


            System.out.println(animalRescuer.getName() + " " +"just give some" + " " + animalFood.getName() +
                    " " + "to" + " " + firstAnimal.toString());


           /* animalRescuer.feedAnimal("dog","purina");
        {
            System.out.println( );
        }
        animalRescuer.recreationGame("run","dog");{
            System.out.println();
        }
*/


      /*  AnimalFood animalFood = new AnimalFood();

        animalFood.setName("royal dog");
        animalFood.setPrice(57.02);
        animalFood.setData(LocalDate.of(2019, 9, 16));
        animalFood.setAvailabilityInStock(true);
        System.out.println(animalFood.getName());
        System.out.println(animalFood.getPrice());
        System.out.println(animalFood.getData()); */



        Animal animal = new Animal();

        animal.setName("Chaika");
        animal.setAge(6.00);
        animal.setLevelOfHeath(5);
        animal.setLevelOfTheFeelingOfHunger(4);
        animal.setMoodLevel(2);
        animal.setFavoritFoodNames("royal dog");
        animal.setFavoritRecreationalNames("run");

        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getLevelOfHeath());
        System.out.println(animal.getLevelOfTheFeelingOfHunger());
        System.out.println(animal.getMoodLevel());
        System.out.println(animal.getFavoritFoodNames());
        System.out.println(animal.getFavoritRecreationalNames());


        Animal animal2 = new Animal();

        animal2.setName("cat");
        animal2.setAge(5.00);
        animal2.setLevelOfHeath(2);
        animal2.setLevelOfTheFeelingOfHunger(7);
        animal2.setMoodLevel(5);
        animal2.setFavoritFoodNames("royal");
        animal2.setFavoritRecreationalNames("ball game");


        System.out.println("animal2.name:" + animal2.getName());
        System.out.println("Animal1 name:" + animal.getName());

     /* AnimalRescuer animalRescuer = new AnimalRescuer();
        animalRescuer.setName("girl");
        animalRescuer.setAmountOfMoney(50.00);
        System.out.println(animalRescuer.getName());
        System.out.println(animalRescuer.getAmountOfMoney());*/

        //  RecreationActivity recreationActivity = new RecreationActivity();
        // recreationActivity.setRecreationActivityName("ball game");
        // System.out.println(recreationActivity.setRecreationActivityName());

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("medic");
        veterinarian.setSpecialization("assistant");
        System.out.println(veterinarian.getName());
        System.out.println("Veterinarian specialization: " + veterinarian.getSpecialization());

        Animal a[] = new Animal[2];

        a[0] = new Dog();
        a[1] = new Snake();

       for (int i = 0; i < a.length; i++) {
           a[i].eat();

            // acum că ele sunt numite la fel, putem apela metoda action
            // din clasa Animal (observați de ce a fost nevoie să definim
            // metoda action în clasa Animal), iar metoda corespunzătoare
            // va fi apelată pentru tipul specific al instanței a[i]

            a[i].action();


        }



    }
}
