package com.example.jay.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jay on 3/21/2017.
 */

public class GuideArrayAdapter extends ArrayAdapter<Guide>{

    private Context mContext;
    public GuideArrayAdapter(Context context, ArrayList<Guide> guideArrayList) {

        super(context, 0,guideArrayList);
        mContext = context;}



    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        Guide guide = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.root_image);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_textview);
        TextView descTextView = (TextView) convertView.findViewById(R.id.location_textview);

        imageView.setImageResource(guide.getImageResourceId());
        titleTextView.setText(guide.getTitleOfThing());
        descTextView.setText(guide.getLocationOfThing());


        return convertView;
    }


}
