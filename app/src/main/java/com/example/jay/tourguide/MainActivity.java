package com.example.jay.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artAndCulture = (TextView) findViewById(R.id.art_and_calture);
        artAndCulture.setOnClickListener(this);

        TextView placesToVisit = (TextView) findViewById(R.id.places_to_visit);
        placesToVisit.setOnClickListener(this);

        TextView popularFood = (TextView) findViewById(R.id.popular_food);
        popularFood.setOnClickListener(this);

        TextView thingsToDo = (TextView) findViewById(R.id.things_to_do);
        thingsToDo.setOnClickListener(this);

        TextView hotelsAndResorts = (TextView) findViewById(R.id.hotels_and_resorts);
        hotelsAndResorts.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.art_and_calture:
                Intent artAndCultureIntent = new Intent(MainActivity.this, ArtAndCultureActivity.class);
                startActivity(artAndCultureIntent);
                break;

            case R.id.places_to_visit:
                Intent placesToVisitIntent = new Intent(MainActivity.this, PlacesToVisitActivity.class);
                startActivity(placesToVisitIntent);
                break;

            case R.id.popular_food:
                Intent popularFoodIntent = new Intent(MainActivity.this, FoodsActivity.class);
                startActivity(popularFoodIntent);
                break;

            case R.id.things_to_do:
                Intent thingsToDoIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(thingsToDoIntent);
                break;

            case R.id.hotels_and_resorts:
                Intent hotelsAndResortsIntent = new Intent(MainActivity.this, HotelAndResortsActivity.class);
                startActivity(hotelsAndResortsIntent);
                break;
        }

    }
}
