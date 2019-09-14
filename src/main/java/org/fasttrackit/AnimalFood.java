package org.fasttrackit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AnimalFood {
    String name;
    Double price;


    String  data = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    boolean availabilityInStock;


}