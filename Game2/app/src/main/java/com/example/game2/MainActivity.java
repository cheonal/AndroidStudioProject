package com.example.game2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3,btn4,btn0,btn5,btn6;
    ImageView img1,img2,img3,img4,img5;
    ArrayList<Integer> list2 = new ArrayList<>(5);
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
        btn5 = (Button) findViewById(R.id.reset);
        btn6 = (Button) findViewById(R.id.result);
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
        Drawable drawable1 = getResources().getDrawable(R.drawable.box1);
        Drawable drawable2 = getResources().getDrawable(R.drawable.box2);
        Drawable drawable3 = getResources().getDrawable(R.drawable.box3);
        Drawable drawable4 = getResources().getDrawable(R.drawable.box4);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (list2.get(0)==1 && list2.get(1) ==3 && list2.get(2) ==4 && list2.get(3) ==2 && list2.get(4) ==1){
                    Toast.makeText(MainActivity.this, "정답입니다", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class); //MainActivity 이름 변경
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "오답입니다", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }

            }
        });
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
                list2.add(1);
                img.setImageDrawable(drawable1);
                if(i==0){
                    btn6.setVisibility(View.VISIBLE);
                    return;
                }
                else {
                    i--;
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = list.get(i);
                list2.add(2);
                img.setImageDrawable(drawable2);
                if(i==0){
                    btn6.setVisibility(View.VISIBLE);
                    return;
                }
                else {
                    i--;
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = list.get(i);
                list2.add(3);
                img.setImageDrawable(drawable3);
                if(i==0){
                    btn6.setVisibility(View.VISIBLE);
                    return;
                }
                else {
                    i--;
                }


            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = list.get(i);
                list2.add(4);
                img.setImageDrawable(drawable4);
                if(i==0){
                    btn6.setVisibility(View.VISIBLE);
                    return;
                }
                else {
                    i--;
                }
            }
        });
    }
}