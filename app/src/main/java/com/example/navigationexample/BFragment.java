package com.example.navigationexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BFragment extends Fragment {


    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_b, container, false);
        Button buttonA, buttonBase;

        buttonA = view.findViewById(R.id.buttonB_A);
        buttonBase = view.findViewById(R.id.buttonBase);


        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BFragment.this).navigate(R.id.action_BFragment_to_AFragment);
            }
        });

        buttonBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(BFragment.this).navigate(R.id.action_BFragment_to_baseFragment);
            }
        });


        return view;
    }
}