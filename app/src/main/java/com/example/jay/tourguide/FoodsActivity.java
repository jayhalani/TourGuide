package com.example.jay.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        ArrayList<Guide> guides = new ArrayList<Guide>();
        guides.add(new Guide(R.drawable.jail_bhajiya_food,getString(R.string.food_title_one),
                getString(R.string.food_location_one)));
        guides.add(new Guide(R.drawable.dalwada_food,getString(R.string.food_title_two),
                getString(R.string.food_location_two)));
        guides.add(new Guide(R.drawable.manek_chowk_food,getString(R.string.food_title_three),
                getString(R.string.food_location_three)));
        guides.add(new Guide(R.drawable.law_garden_food,getString(R.string.food_title_four),
                getString(R.string.food_location_four)));
        guides.add(new Guide(R.drawable.das_khaman_food,getString(R.string.food_title_five),
                getString(R.string.food_location_five)));


        GuideArrayAdapter adapter = new GuideArrayAdapter(this, guides);

        // Get a reference to the ListView and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
