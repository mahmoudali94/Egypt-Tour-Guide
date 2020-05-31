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
public class EventsFragment extends Fragment {

    public static EventsFragment newInstance(int index) {
        EventsFragment fragment = new EventsFragment();
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
        places.add(new CustomArray(R.string.event_title_1, R.string.event_description_1, R.drawable.event1));
        places.add(new CustomArray(R.string.event_title_2, R.string.event_description_2, R.drawable.event2));
        places.add(new CustomArray(R.string.event_title_3, R.string.event_description_3, R.drawable.event3));
        places.add(new CustomArray(R.string.event_title_4, R.string.event_description_4, R.drawable.event4));

        CustomAdapter mAdapter = new CustomAdapter(getActivity(), places);
        ListView list = root.findViewById(R.id.listView);
        list.setAdapter(mAdapter);
        return root;
    }


}