package com.example.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox;
        TextView Txv;
        RadioGroup RdGroup;
        Button EndBtn;
        ImageView img;

        img = (ImageView) findViewById(R.id.animalimg);
        checkBox = (CheckBox) findViewById(R.id.ckbox);
        EndBtn = (Button) findViewById(R.id.ckend);
        RdGroup = (RadioGroup) findViewById(R.id.rdgroup);
        Txv = (TextView) findViewById(R.id.textview);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Txv.setVisibility(View.VISIBLE);
                RdGroup.setVisibility(View.VISIBLE);
                EndBtn.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);
            }
        });

        RdGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i==R.id.dog){
                    EndBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                img.setImageResource(R.drawable.dog);
                        }
                    });
                }
                if (i==R.id.cat){
                    EndBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                img.setImageResource(R.drawable.cat);

                        }
                    });
                }
                if (i==R.id.rab){
                    EndBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                img.setImageResource(R.drawable.rabbit);

                        }
                    });
                }
            }
        });
    }
}