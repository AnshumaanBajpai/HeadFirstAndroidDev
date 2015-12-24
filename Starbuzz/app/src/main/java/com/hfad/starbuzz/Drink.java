package com.hfad.starbuzz;

/**
 * Created by Anshumaan on 12/23/2015.
 */
public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    //Drink Constructor

    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    //method to obtain name
    public String getName(){
        return name;
    }

    //method to obtain Description
    public String getDescription(){
        return description;
    }

    //method to obtain image
    public int getImageResourceId(){
        return imageResourceId;
    }

    //method to identify every drink with its name
    public String toString(){
        return this.name;
    }

    //Defining an array of drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };
}
