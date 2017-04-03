package com.example.jay.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        ArrayList<Guide> guides = new ArrayList<Guide>();
        guides.add(new Guide(R.drawable.drive_in_things,getString(R.string.things_to_do_title_one),
                getString(R.string.things_to_do_location_one)));

        guides.add(new Guide(R.drawable.ravivari_bazaar_things,getString(R.string.things_to_do_title_two),
                getString(R.string.things_to_do_location_two)));

        guides.add(new Guide(R.drawable.manek_chowk_food,getString(R.string.things_to_do_title_three),
                getString(R.string.things_to_do_location_three)));

        guides.add(new Guide(R.drawable.kite_festival_things,getString(R.string.things_to_do_title_four),
                getString(R.string.things_to_do_location_four)));

        guides.add(new Guide(R.drawable.rani_no_hajiro_things,getString(R.string.things_to_do_title_five),
                getString(R.string.things_to_do_location_five)));

        guides.add(new Guide(R.drawable.atma_house_places,getString(R.string.things_to_do_title_six),
                getString(R.string.things_to_do_location_six)));


        GuideArrayAdapter adapter = new GuideArrayAdapter(this, guides);

        // Get a reference to the ListView and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
