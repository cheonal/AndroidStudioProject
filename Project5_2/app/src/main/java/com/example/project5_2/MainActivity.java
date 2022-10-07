package com.example.project5_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String qwe1,qwe2;

   Button add,sub,div,mul;
    TextView textView;
    EditText ed1,ed2;
    int i;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {
            R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,
            R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        for (i=0;i<numBtnIDs.length;i++){
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }

        for (i=0; i<numBtnIDs.length;i++){
            final int index;
            index = i;
            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (ed1.isFocused() == true){
                        qwe1 = ed1.getText().toString()+numButtons[index].getText().toString();
                        ed1.setText((qwe1));
                    }
                    else if (ed2.isFocused() == true){
                        qwe2 = ed2.getText().toString()+numButtons[index].getText().toString();
                        ed2.setText(qwe2);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"먼저 에디트 텍스트를 선택하세요",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        add =  (Button)findViewById(R.id.add);
        sub =  (Button)findViewById(R.id.sub);
        mul =  (Button)findViewById(R.id.mul);
        div =  (Button)findViewById(R.id.div);
        textView = (TextView)findViewById(R.id.result);
        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                qwe1 = ed1.getText().toString();
                qwe2 = ed2.getText().toString();
                Integer result;
                result = Integer.parseInt(qwe1)+Integer.parseInt(qwe2);
                textView.setText("계산 결과 :" + result.toString());
                return;

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                qwe1 = ed1.getText().toString();
                qwe2 = ed2.getText().toString();
                Integer result;
                result = Integer.parseInt(qwe1)-Integer.parseInt(qwe2);
                textView.setText("계산 결과 :" + result.toString());
                return;

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                
                qwe1 = ed1.getText().toString();
                qwe2 = ed2.getText().toString();
                Integer result;
                result = Integer.parseInt(qwe1)/Integer.parseInt(qwe2);
                textView.setText("계산 결과 :" + result.toString());
                return;

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                qwe1 = ed1.getText().toString();
                qwe2 = ed2.getText().toString();
                Integer result;
                result = Integer.parseInt(qwe1)*Integer.parseInt(qwe2);
                textView.setText("계산 결과 :" + result.toString());
                return;

            }
        });






    }
}