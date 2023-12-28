package org.example;

import java.util.Random;
import java.util.UUID;

public class Toy {
    private static int grow;
    private final int id;
    String name;
    int quantity;

    public Toy (){
        grow++;
        this.id = getGrow();
        this.name = Names.values()[new Random().nextInt(Names.values().length)].toString();
        this.quantity = setQuantity();
    }
    private int getGrow() {
        return grow;
    }


    public int setQuantity (){
        if (this.name == "constructor")
            return 20;
        else if (this.name == "robot")
            return 20;
        else if (this.name == "dolly")
            return 60;
        return 0;
    }

    @Override

    public String toString(){
        return "id: "+ this.id + " name: " + this.name + " weight: " + this.quantity;
    }



}
