package com.example.prac5_r.UI.View;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prac5_r.Data_layer.DataSource.Custom;
import com.example.prac5_r.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Custom> {
    private LayoutInflater inflater;
    private int layout;
    private List<Custom> items;
    public MyAdapter(Context context, int resource, List<Custom> items) {
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        Custom item = items.get(position);
        Log.d("getView", item.getText());

        TextView textView = view.findViewById(R.id.customTextView);
        textView.setText(item.getText());

        ImageView imageView = view.findViewById(R.id.customImageView);
        imageView.setImageResource(item.getImageId());

        return view;
    }
}

