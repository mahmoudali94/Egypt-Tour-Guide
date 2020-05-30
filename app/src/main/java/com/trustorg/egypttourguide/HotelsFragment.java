package com.trustorg.egypttourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class HotelsFragment extends Fragment {

    public static HotelsFragment newInstance(int index) {
        HotelsFragment fragment = new HotelsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.listview, container, false);
        final ArrayList<CustomArray> places = new ArrayList<CustomArray>();
        places.add(new CustomArray(R.string.hotel_title_1, R.string.hotel_description_1, R.drawable.hotel1));
        places.add(new CustomArray(R.string.hotel_title_2, R.string.hotel_description_2, R.drawable.hotel2));
        places.add(new CustomArray(R.string.hotel_title_3, R.string.hotel_description_3, R.drawable.hotel3));
        places.add(new CustomArray(R.string.hotel_title_4, R.string.hotel_description_4, R.drawable.hotel4));
        places.add(new CustomArray(R.string.hotel_title_5, R.string.hotel_description_5, R.drawable.hotel5));
        places.add(new CustomArray(R.string.hotel_title_6, R.string.hotel_description_6, R.drawable.hotel6));
        places.add(new CustomArray(R.string.hotel_title_7, R.string.hotel_description_7, R.drawable.hotel7));


        CustomAdapter mAdapter = new CustomAdapter(getActivity(), places);
        ListView list = root.findViewById(R.id.listView);
        list.setAdapter(mAdapter);
        return root;
    }


}