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

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                result.putString("name", fieldName.getText().toString());
                result.putString("email", fieldEmail.getText().toString());
                result.putString("password", fieldPassword.getText().toString());
                Navigation.findNavController(view).navigate(R.id.action_fragment3_to_fragment1, result);
            }
        });

        view.findViewById(R.id.backbutt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_fragment3_to_fragment1);
            }
        });

        return view;
    }
}