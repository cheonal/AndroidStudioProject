package com.example.project6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    Button btnstop,btnstart;
    ViewFlipper viewFlipper1;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstop=(Button) findViewById(R.id.btnstop);
        btnstart=(Button) findViewById(R.id.btnstart);
        viewFlipper1=(ViewFlipper) findViewById(R.id.viewFlipper1);

        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper1.stopFlipping();
                //시간만 넣으면 완성일듯

            }
        });

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper1.startFlipping();
            }
        });
}}