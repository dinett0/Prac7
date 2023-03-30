package com.example.prac5_r;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {
    EditText editEmail;
    EditText editPass;
    Button signUp, login;
    String name = "Name";

    String TAG = this.getClass().getSimpleName();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        editEmail = view.findViewById(R.id.editTextTextEmailAddress);
        editPass = view.findViewById(R.id.editTextTextPassword);
        signUp = view.findViewById(R.id.button_signup);
        login = view.findViewById(R.id.button_login);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragment1_to_fragment3);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragment1_to_fragment2);
            }
        });

        return view;
    }
}