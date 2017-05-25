package com.example.amank.cameratest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static com.example.amank.cameratest.R.id.add;
import static com.example.amank.cameratest.R.id.view;

public class AddReminder extends Fragment {


    public AddReminder(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_reminder, container, false);

        Button button = (Button)view.findViewById(R.id.Add);


        button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v)
            {
                button(v);
            }

        });

        return view;

    }



    public void button(View view){
        Toast.makeText(view.getContext(),"Camera API COMING SOON",Toast.LENGTH_LONG).show();
    }

}
