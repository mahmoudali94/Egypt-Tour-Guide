package com.trustorg.egypttourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomArray> {
    public CustomAdapter(@NonNull Context context, @NonNull ArrayList<CustomArray> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.view_design, parent, false);
        }
        CustomArray currentArray = getItem(position);

        if (currentArray != null) {

            TextView mTextView = listItem.findViewById(R.id.textView);
            mTextView.setText(currentArray.getHighText());
            TextView mTextView2 = listItem.findViewById(R.id.textView2);
            mTextView2.setText(currentArray.getSmallText());
            ImageView mImage = listItem.findViewById(R.id.imageView);
            mImage.setImageResource(currentArray.getPhotoID());
        }

        return listItem;

    }
}
