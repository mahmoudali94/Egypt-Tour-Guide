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
public class PlacesFragment extends Fragment {

    public static PlacesFragment newInstance(int index) {
        PlacesFragment fragment = new PlacesFragment();
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
        places.add(new CustomArray(R.string.place_title_1, R.string.place_description_1, R.drawable.place1));
        places.add(new CustomArray(R.string.place_title_2, R.string.place_description_2, R.drawable.place2));
        places.add(new CustomArray(R.string.place_title_3, R.string.place_description_3, R.drawable.place3));
        places.add(new CustomArray(R.string.place_title_4, R.string.place_description_4, R.drawable.place4));
        places.add(new CustomArray(R.string.place_title_5, R.string.place_description_5, R.drawable.place5));
        places.add(new CustomArray(R.string.place_title_6, R.string.place_description_6, R.drawable.place6));
        places.add(new CustomArray(R.string.place_title_7, R.string.place_description_7, R.drawable.place7));


        CustomAdapter mAdapter = new CustomAdapter(getActivity(), places);
        ListView list = root.findViewById(R.id.listView);
        list.setAdapter(mAdapter);
        return root;
    }


}