package com.example.game2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn0;
    ImageView img1,img2,img3,img4,img5;
    ArrayList<ImageView> list = new ArrayList<>(5);
    Integer i = 4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button)findViewById(R.id.Hint);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        img1 =(ImageView) findViewById(R.id.img1);
        img2 =(ImageView) findViewById(R.id.img2);
        img3 =(ImageView) findViewById(R.id.img3);
        img4 =(ImageView) findViewById(R.id.img4);
        img5 =(ImageView) findViewById(R.id.img5);
        list.add(img1);
        list.add(img2);
        list.add(img3);
        list.add(img4);
        list.add(img5);
        System.out.println(list);
        System.out.println(list.get(0).getClass());
        Drawable drawable = getResources().getDrawable(R.drawable.box2);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "보편적인 햄버거집 순서야!", Toast.LENGTH_SHORT).show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = list.get(i);
                img.setImageDrawable(drawable);
                if(i==0){
                    return;
                }
                else
                i--;

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.remove(i);
                i++;

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.remove(i);
                i++;

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.remove(i);
                i++;

            }
        });

    }
}