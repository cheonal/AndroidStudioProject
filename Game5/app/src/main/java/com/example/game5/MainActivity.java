package com.example.game5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    TextView sub_result ;
    Button sub_retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //주소로 알고있는 xml을 눈에 보이는 view로 바꿔줌 ->InfLate

        sub_result = findViewById(R.id.sub_result);
        sub_retry = findViewById(R.id.sub_retry);

        int score = getIntent().getIntExtra("score",-1);
        sub_result.setText(String.valueOf(score));

        sub_retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();




            }
        });

    }
}