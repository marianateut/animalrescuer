package org.fasttrackit;

public class Veterinarian {
   private String name;
   private String specialization;

   //constructor


    public Veterinarian(String name) {
        this.name = name;
    }

    //getter and setter
    public String getName() {
        return name;
    }

  /* public void setName(String name) {
        this.name = name;
    }*/

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
