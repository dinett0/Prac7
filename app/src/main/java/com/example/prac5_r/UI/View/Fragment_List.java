package com.example.prac5_r.UI.View;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.prac5_r.Data_layer.DataSource.Custom;
import com.example.prac5_r.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_List extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);
//Content
        List<Custom> itemList = new ArrayList<Custom>();
        for(int i = 0; i < 200; i++) {
            itemList.add(new Custom(R.drawable.poster, "Movie"+i));
        }
//ListView
        ListView LV = v.findViewById(R.id.itemsList);
        MyAdapter adap = new MyAdapter(getContext(), R.layout.custom, itemList);
        LV.setAdapter(adap);
//Clicking
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                Toast.makeText(getContext(),
                        ((TextView) itemClicked.findViewById(R.id.customTextView)).getText(),
                        Toast.LENGTH_SHORT).show();
                Log.d("ListView", (String) ((TextView) itemClicked.findViewById(R.id.customTextView)).getText());
            }
        });

        return v;
    }
}
