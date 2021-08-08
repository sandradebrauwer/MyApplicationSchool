package be.ehb.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.myapplication.R;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
