package com.hfad.beeradvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anshumaan on 12/19/2015.
 */
public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")){
            brands.add("Jack amber");
            brands.add("Red Moose");
        } else if (color.equals("light")){
            brands.add("Light Lager");
            brands.add("Sankaty Light");
        } else if (color.equals("brown")){
            brands.add("American brown ale");
            brands.add("English brown ale");
        } else{
            brands.add("Sam adams dark lager");
            brands.add("Shiner Block");
        }

        return brands;
    }
}
