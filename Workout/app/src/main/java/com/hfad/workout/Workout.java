package com.hfad.workout;

/**
 * Created by Anshumaan on 12/23/2015.
 */
public class Workout {

    //Instance variables
    private String name;
    private String description;

    //constructor
    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    //An array of workouts
    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 handstand Push-ups\n10 1-legged Squats\n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Leg", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }
}
