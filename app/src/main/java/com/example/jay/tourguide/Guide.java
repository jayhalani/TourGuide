package com.example.jay.tourguide;

import android.location.Location;

import java.util.Locale;


public class Guide {

    //
    int mImageResourceId;

    //
    String mTitleOfThing;

    //
    String mLocationOfThing;


    // Constructor
    public Guide(int imageResourceId, String titleOfThing, String locationOfThing) {

        mImageResourceId = imageResourceId;
        mTitleOfThing = titleOfThing;
        mLocationOfThing = locationOfThing;
    }


    // Get the Image Resource Id of Thing.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Get the Title of Thing.
    public String getTitleOfThing() {
        return mTitleOfThing;
    }

    // Get the Location of Thing.
    public String getLocationOfThing() {
        return mLocationOfThing;
    }


}
