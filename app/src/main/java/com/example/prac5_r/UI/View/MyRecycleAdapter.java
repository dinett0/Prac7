package com.example.prac5_r.UI.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.prac5_r.Data_layer.DataSource.Custom;
import com.example.prac5_r.R;

import java.util.List;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.ViewHolder>{

    private final LayoutInflater inflater; //to display
    private final List<Custom> states;

    MyRecycleAdapter(Context context, List<Custom> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Custom state = states.get(position);
        holder.nameView.setText(state.getText());
        holder.flagView.setImageResource(state.getImageId());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.customImageView);
            nameView = view.findViewById(R.id.customTextView);
        }
    }
}

