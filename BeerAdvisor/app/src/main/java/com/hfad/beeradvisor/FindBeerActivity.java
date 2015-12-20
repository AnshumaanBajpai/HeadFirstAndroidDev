package com.hfad.beeradvisor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    // Before we can use BeerExpert, we need to have a Beer Expert object here
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        // Obtain a reference to the TextView object
        TextView brands = (TextView) findViewById(R.id.brands);

        // Obtain a reference to the Spinner object
        Spinner color = (Spinner) findViewById(R.id.color);

        // Covert the Object to the selected beer
        List<String> brandList = expert.getBrands(String.valueOf(color.getSelectedItem()));

        //We obtain a List for the above so we need to use a String Builder to get a string
        StringBuilder brandsFormatted = new StringBuilder();

        for(String brand : brandList){
            brandsFormatted.append(brand).append("\n");
        }

        // Set the value of the text to be displayed
        brands.setText(brandsFormatted);
    }
}
