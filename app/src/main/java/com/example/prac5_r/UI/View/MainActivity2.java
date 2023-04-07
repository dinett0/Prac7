package com.example.prac5_r.UI.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.prac5_r.R;

public class MainActivity2 extends AppCompatActivity {

    Fragment_Branching frag1 = new Fragment_Branching();
    Fragment2 frag2 = new Fragment2();
    Fragment3 frag3 = new Fragment3();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null)
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, frag1)
                    .commit();
    }

    public void replaceFragments(Fragment inst) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, inst).commit();
    }
}
