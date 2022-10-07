package com.example.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

        String str;
        EditText editText = new EditText((this));
        editText.setHint(("여기에 입력하세요"));

        Button btn = new Button((this));
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.MAGENTA);

        TextView textView = new TextView((this));
        textView.setTextColor(Color.rgb(44,11,44));
        textView.setText("여기에 결과가 보입니다");

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation((LinearLayout.VERTICAL));
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout,params);

        baseLayout.addView(editText);
        baseLayout.addView(btn);
        baseLayout.addView(textView);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show();
                textView.setText(editText.getText());
            }
        });


    }
}