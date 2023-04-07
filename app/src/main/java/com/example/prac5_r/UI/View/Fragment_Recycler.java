package com.example.prac5_r.UI.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.prac5_r.Data_layer.DataSource.Custom;
import com.example.prac5_r.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Recycler extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler, container, false);

        List<Custom> itemList = new ArrayList<Custom>();

        RecyclerView recyclerView = view.findViewById(R.id.recycleid);
        MyRecycleAdapter adapterRecyclerView = new MyRecycleAdapter(getContext(), itemList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterRecyclerView);

        return view;
    }
}
