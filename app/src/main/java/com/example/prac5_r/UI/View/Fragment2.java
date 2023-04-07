package com.example.prac5_r.UI.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.prac5_r.R;

public class Fragment2 extends Fragment {

    TextView name, email, password;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        name = view.findViewById(R.id.name);
        email = view.findViewById(R.id.email);
        password = view.findViewById(R.id.password);

        Bundle bundle = getArguments();
        if (bundle != null) {
            email.setText(bundle.getString("email"));
            password.setText(bundle.getString("password"));
            name.setText(bundle.getString("name"));
        }

        view.findViewById(R.id.backbutt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment1);
            }
        });

        view.findViewById(R.id.buttonLists).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment_Branching);
            }
        });
        return view;
    }
}