package com.example.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    TextView TextResult;
    Button add,sub,mul,div,Lost;
    String num1,num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        TextResult = (TextView) findViewById(R.id.TextResult);
        add = (Button) findViewById(R.id.BtnADD);
        sub = (Button) findViewById(R.id.BtnSub);
        mul = (Button) findViewById(R.id.BtnMul);
        div = (Button) findViewById(R.id.BtnDiv);
        Lost = (Button) findViewById(R.id.BtnLost);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();


                if (num1.equals("") && num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();
                if (num1.equals("") && num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }


            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();
                if (num1.equals("") && num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();

                if (num1.equals("") && num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else if (num2.equals("0")){
                    Toast.makeText(getApplicationContext(),"0으로 나눌수 없습니다",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }


            }
        });
        Lost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();
                if (num1.equals("") && num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }

            }
        });
    }

}