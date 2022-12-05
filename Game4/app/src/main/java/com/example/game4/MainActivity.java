package com.example.game4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton[] = new ImageButton[9];
    Button btn,btn1,btn2;
    Integer[] RidBtn = {R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};
    ArrayList<Integer> list = new ArrayList<>(2);
    Integer qwe =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.goal);
        btn1 = (Button) findViewById(R.id.Hint);
        btn2 = (Button) findViewById(R.id.reset);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        for (int i=0; i<9; i++){
            imageButton[i] = (ImageButton) findViewById(RidBtn[i]);
        }
        imageButton[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(1);
                qwe++;
                Toast.makeText(MainActivity.this,"1", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(2);
                qwe++;
                Toast.makeText(MainActivity.this,"2", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(3);
                qwe++;
                Toast.makeText(MainActivity.this,"3", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(4);
                qwe++;
                Toast.makeText(MainActivity.this,"4", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(5);
                qwe++;
                Toast.makeText(MainActivity.this,"5", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(6);
                qwe++;
                Toast.makeText(MainActivity.this,"6", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(7);
                qwe++;
                Toast.makeText(MainActivity.this,"7", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(8);
                qwe++;
                Toast.makeText(MainActivity.this,"8", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        imageButton[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(9);
                qwe++;
                Toast.makeText(MainActivity.this,"9", Toast.LENGTH_SHORT).show();
                if (qwe.equals(2)){
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "고양이가 좋아할만한 물건 두개를 골라봐", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((list.get(0)==2 && list.get(1) ==5) || (list.get(0) ==5 && list.get(1) ==2)){
                    Toast.makeText(MainActivity.this, "정답입니다", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class); //MainActivity 이름 변경
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "정답이 아닙니다", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}