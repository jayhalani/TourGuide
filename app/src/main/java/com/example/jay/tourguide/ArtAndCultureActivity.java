package com.example.jay.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtAndCultureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        ArrayList<Guide> guides = new ArrayList<Guide>();
        guides.add(new Guide(R.drawable.gujarati_literature_art,getString(R.string.art_and_culture_title_one),
                getString(R.string.art_and_culture_location_one)));
        guides.add(new Guide(R.drawable.hussain_doshi_gufa_art,getString(R.string.art_and_culture_title_two),
                getString(R.string.art_and_culture_location_two)));
        guides.add(new Guide(R.drawable.sculpture_art,getString(R.string.art_and_culture_title_three),
                getString(R.string.art_and_culture_location_three)));
        guides.add(new Guide(R.drawable.saptak_art,getString(R.string.art_and_culture_title_four),
                getString(R.string.art_and_culture_location_four)));
        guides.add(new Guide(R.drawable.shreyas_folk_museum_art,getString(R.string.art_and_culture_title_five),
                getString(R.string.art_and_culture_location_five)));
        guides.add(new Guide(R.drawable.handicrafts_art,getString(R.string.art_and_culture_title_six),
                getString(R.string.art_and_culture_location_six)));


        GuideArrayAdapter adapter = new GuideArrayAdapter(this, guides);

        // Get a reference to the ListView and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
