package com.example.a4_cse_a.tabnew;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Shaik extends Fragment {


    public Shaik() {
        // Required empty public constructor
    }

    Button b1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View c= inflater.inflate(R.layout.fragment_shaik, container, false);
        b1=(Button)c.findViewById(R.id.click);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"hello koundinya",Toast.LENGTH_LONG).show();
            }
        });
        return c;
    }

}
