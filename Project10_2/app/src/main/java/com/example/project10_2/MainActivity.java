package com.example.project10_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("명화 선호도 투표");

        final int voteCount[] = new int[9];
        for (int i=0;i<9;i++)
            voteCount[i]=0;

        ImageView image[] = new ImageView[9];
        Integer imageId[] = { R.id.iv1,R.id.iv2,R.id.iv3,R.id.iv4,R.id.iv5,R.id.iv6,R.id.iv7,R.id.iv8,R.id.iv9};
        final String imgName[] = {"소녀1","소녀2","소녀3","소녀4","소녀5","소녀6","소녀7","소녀8","소녀9"};
        btnEnd = (Button) findViewById(R.id.btnResult);

        for(int i=0; i<imageId.length; i++){
            final int index;
            index =i;
            image[index] = (ImageView) findViewById(imageId[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    voteCount[index]++;

                    Toast.makeText(MainActivity.this, imgName[index]+": 총"+voteCount[index]+"표", Toast.LENGTH_SHORT).show();
                }
            });

            btnEnd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    intent.putExtra("VoteCount",voteCount);
                    intent.putExtra("ImageName",imgName);

                    startActivity(intent);
                }
            });
        }


    }
}