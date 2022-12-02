package com.example.qwer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int TOTAL = 5 * 1000;
    static final int COUNT_INTERVAL = 1000;

    int count = 4;
    TextView counTxt;
    CountDownTimer countDownTimer;
    Button button,btn;

    @Override
    protected void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.startgame);

        counTxt = (TextView) findViewById(R.id.timetv);

        button =(Button) findViewById(R.id.gift);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count<1){
                    if (count<0){
                        Toast.makeText(MainActivity.this, "너무 느립니다", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    Toast.makeText(MainActivity.this, "성공입니다", Toast.LENGTH_SHORT).show();
                }
                if(count>1){
                    Toast.makeText(MainActivity.this, "너무 빠릅니다", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 5;
                countDownTimer();
                countDownTimer.start();
            }
        });
    }
   public void countDownTimer() {
        countDownTimer = new CountDownTimer(TOTAL,COUNT_INTERVAL) {
            @Override
            public void onTick(long l) {
                counTxt.setText(String.valueOf(count));
                count--;
            }

            @Override
            public void onFinish() {
                counTxt.setText("카운트 종료");

            }
        };
    }
}
