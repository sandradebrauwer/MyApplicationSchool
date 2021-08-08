package be.ehb.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;

import be.ehb.myapplication.R;

// kiezen voor androidx compatible met oudere versies
public class DestinationFragment extends Fragment {

    public DestinationFragment() {

    }

    // factorypattern op klasse zelf en moet publiek zijn zodanig toegankelijk door iedereen
    static public DestinationFragment newInstance(String param1, String param2){
        DestinationFragment fragment = new DestinationFragment();
        return fragment;


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // verwijzen naar layout -
        View rootView= inflater.inflate(R.layout.fragment_destination,container,false
        );

        // componenten van zoals rootView=findViewByid
        return rootView;


    }
}

