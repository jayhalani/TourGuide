package com.example.jay.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesToVisitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        ArrayList<Guide> guides = new ArrayList<Guide>();
        guides.add(new Guide(R.drawable.vav_adalaj_places,getString(R.string.places_to_visit_title_one),
                getString(R.string.places_to_visit_location_one)));
        guides.add(new Guide(R.drawable.auto_world_places,getString(R.string.places_to_visit_title_two),
                getString(R.string.places_to_visit_location_two)));
        guides.add(new Guide(R.drawable.vechaar_museum_places,getString(R.string.places_to_visit_title_three),
                getString(R.string.places_to_visit_location_three)));
        guides.add(new Guide(R.drawable.hutheesing_jain_temple_places,getString(R.string.places_to_visit_title_four),
                getString(R.string.places_to_visit_location_four)));
        guides.add(new Guide(R.drawable.gandhi_ashram_places,getString(R.string.places_to_visit_title_five),
                getString(R.string.places_to_visit_location_five)));
        guides.add(new Guide(R.drawable.amdavad_ni_gufa_places,getString(R.string.places_to_visit_title_six),
                getString(R.string.places_to_visit_location_six)));


        GuideArrayAdapter adapter = new GuideArrayAdapter(this, guides);

        // Get a reference to the ListView and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
