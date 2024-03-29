package com.example.project10_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("투표 결과");

        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("VoteCount");
        String[] imgaeName = intent.getStringArrayExtra("ImageName");

        TextView tv[] = new TextView[imgaeName.length];
        RatingBar rbar[] = new RatingBar[imgaeName.length];

        Integer tvID[]={
                R.id.tv1,R.id.tv2,R.id.tv3,R.id.tv4,R.id.tv5,R.id.tv6,
                R.id.tv7,R.id.tv8,R.id.tv9
        };
        Integer rbarId[] = {
                R.id.rbar1,R.id.rbar2,R.id.rbar3,R.id.rbar4,R.id.rbar5,
                R.id.rbar6,R.id.rbar7,R.id.rbar8,R.id.rbar9
        };

        for (int i=0; i<voteResult.length;i++){
            tv[i] = (TextView) findViewById(tvID[i]);
            rbar[i] = (RatingBar) findViewById(rbarId[i]);
        }

        for (int i=0; i<voteResult.length;i++){
            tv[i].setText(imgaeName[i]);
            rbar[i].setRating((float) voteResult[i]);
        }

        Button button = (Button) findViewById(R.id.btnReturn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
