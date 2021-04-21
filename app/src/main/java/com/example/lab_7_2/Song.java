package com.example.lab_7_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Song extends Fragment {
    ArrayAdapter adapter;
    String[] list={"Power Wolf","Sabaton","Anime op/end"};
    ListView lv;
    public Song() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_song, container, false);
        lv=view.findViewById(R.id.List);
        adapter=new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);
        return view;
    }
}