package com.example.prac5_r.UI.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.prac5_r.R;

public class Fragment_Branching extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_branching, container, false);

        Button button1 = v.findViewById(R.id.tofrag2);
        Button button2 = v.findViewById(R.id.tofrag3);
        button1.setOnClickListener(new View.OnClickListener() {
            Fragment_List f2 = new Fragment_List();
            @Override
            public void onClick(View view) {
                ((MainActivity2)getActivity()).replaceFragments(f2);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            Fragment_Recycler f3 = new Fragment_Recycler();
            @Override
            public void onClick(View view) {
                ((MainActivity2)getActivity()).replaceFragments(f3);
            }
        });
        return v;
    }
}
