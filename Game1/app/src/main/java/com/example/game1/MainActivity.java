package com.example.game1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3,btn2;
    ImageView Img1, Img2, Img3, Img4, Img5;
    Button Img6, Img7, Img8, Img9, Img10;
    ArrayList<Integer> list = new ArrayList<>(5);
    Integer i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2 = (Button) findViewById(R.id.reset);
        button1 = (Button) findViewById(R.id.startbtn);
        button2 = (Button) findViewById(R.id.goal);
        button3 = (Button) findViewById(R.id.Hint);
        Img1 = (ImageView) findViewById(R.id.dog1);
        Img2 = (ImageView) findViewById(R.id.dog2);
        Img3 = (ImageView) findViewById(R.id.dog3);
        Img4 = (ImageView) findViewById(R.id.dog4);
        Img5 = (ImageView) findViewById(R.id.dog5);
        Img6 = (Button) findViewById(R.id.item1);
        Img7 = (Button) findViewById(R.id.item2);
        Img8 = (Button) findViewById(R.id.item3);
        Img9 = (Button) findViewById(R.id.item4);
        Img10 = (Button) findViewById(R.id.item5);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Img1.setColorFilter(Color.parseColor("#000000"));
                Toast.makeText(MainActivity.this, "이미지 변경", Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setVisibility(View.INVISIBLE);
                Img6.setVisibility(View.VISIBLE);
                Img7.setVisibility(View.VISIBLE);
                Img8.setVisibility(View.VISIBLE);
                Img9.setVisibility(View.VISIBLE);
                Img10.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "1번째 강아지 에게 알맞은 선물을 주세요", Toast.LENGTH_SHORT).show();

            }
        });
        Img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Img6.setEnabled(false);
                list.add(1);
                i++;
                Toast.makeText(MainActivity.this, i+"번째 강아지 에게 알맞은 선물을 주세요", Toast.LENGTH_SHORT).show();
                if (i==6)
                    button2.setVisibility(View.VISIBLE);
            }
        });
        Img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Img7.setEnabled(false);
                list.add(2);
                i++;
                Toast.makeText(MainActivity.this, i+"번째 강아지 에게 알맞은 선물을 주세요", Toast.LENGTH_SHORT).show();
                if (i==6)
                    button2.setVisibility(View.VISIBLE);
            }
        });
        Img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Img8.setEnabled(false);
                list.add(3);
                i++;
                if (i==6)
                    button2.setVisibility(View.VISIBLE);
            }
        });
        Img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Img9.setEnabled(false);
                list.add(4);
                i++;
                Toast.makeText(MainActivity.this, i+"번째 강아지 에게 알맞은 선물을 주세요", Toast.LENGTH_SHORT).show();
                if (i==6)
                    button2.setVisibility(View.VISIBLE);
            }
        });
        Img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Img10.setEnabled(false);
                list.add(5);
                i++;
                Toast.makeText(MainActivity.this, i+"번째 강아지 에게 알맞은 선물을 주세요", Toast.LENGTH_SHORT).show();
                if (i==6)
                    button2.setVisibility(View.VISIBLE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (list.get(0)==1 && list.get(1) ==2 && list.get(2) ==3 && list.get(3) ==4 && list.get(4) ==5) {
                    Toast.makeText(MainActivity.this, "정답입니다", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class); //MainActivity에 다른 씬 이름 변경
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "정답이 아닙니다", Toast.LENGTH_SHORT).show();
                    Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent1);
                }
            }
        });

    }
}
