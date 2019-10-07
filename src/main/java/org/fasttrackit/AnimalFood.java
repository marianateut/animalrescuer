package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {
    public int length;
    private String name;
   private Double price;
   private LocalDate data;
    private boolean availabilityInStock;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isAvailabilityInStock() {
        return availabilityInStock;
    }

    public void setAvailabilityInStock(boolean availabilityInStock) {
        this.availabilityInStock = availabilityInStock;
    }

}