package org.fasttrackit;

class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void positiveMod() {
        if (getMoodLevel()>4 )
                System.out.println(getName()+ " is happy, it wags his tail");
            else
                System.out.println(getName()+ " is sad, it sleeps all day");

//       return "THe dog gives the tail if";
  }

    public void action() {
    System.out.println("Dog howling");
}

    public void eat() {
        System.out.println("Dog eating");
    }
}


