package com.alexsykes.frags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

// https://guides.codepath.com/android/Creating-and-Using-Fragments

public class FragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.placeholder1, new ScorePadFragment());
        // ft.replace(R.id.placeholder2, new TouchFragment());
        ft.commit();
    }
}
