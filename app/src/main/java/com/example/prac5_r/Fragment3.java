package com.example.prac5_r;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment3 extends Fragment {

    private Button signUp;
    private EditText fieldName, fieldEmail, fieldPassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        signUp = view.findViewById(R.id.continue_reg);
        fieldName = view.findViewById(R.id.editTextName);
        fieldEmail = view.findViewById(R.id.editTextEmail);
        fieldPassword = view.findViewById(R.id.editTextPassword);

        return view;
    }
}