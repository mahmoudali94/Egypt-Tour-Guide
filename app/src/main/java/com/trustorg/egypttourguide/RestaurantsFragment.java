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
public class RestaurantsFragment extends Fragment {

    public static RestaurantsFragment newInstance(int index) {
        RestaurantsFragment fragment = new RestaurantsFragment();
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
        places.add(new CustomArray(R.string.restaurants_title_1, R.string.restaurants_description_1, R.drawable.resturant1_));
        places.add(new CustomArray(R.string.restaurants_title_2, R.string.restaurants_description_2, R.drawable.resturant2));
        places.add(new CustomArray(R.string.restaurants_title_3, R.string.restaurants_description_3, R.drawable.resturant3));
        places.add(new CustomArray(R.string.restaurants_title_4, R.string.restaurants_description_4, R.drawable.resturant4));

        CustomAdapter mAdapter = new CustomAdapter(getActivity(), places);
        ListView list = root.findViewById(R.id.listView);
        list.setAdapter(mAdapter);
        return root;
    }


}