package com.alexsykes.frags;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FooFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_foo, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }
}
