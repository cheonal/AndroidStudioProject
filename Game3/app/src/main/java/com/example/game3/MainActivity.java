package com.example.game3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;
    Integer num =0;
    ImageView imageView;
    TextView textView;
    MyGrapicView graphicView;
    static  float color =0,satur=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout pictureLayout = (LinearLayout) findViewById(R.id.pictureLayout);
        graphicView = (MyGrapicView) new MyGrapicView(this);
        pictureLayout.addView(graphicView);

        btn3 = (Button) findViewById(R.id.goal);
        btn4 = (Button) findViewById(R.id.Hint);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "밝기를 조절하면 글자가 보일꺼야!", Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string= textView.getText().toString();
                if (string.equals("흑인,안경,11살")){
                    Toast.makeText(MainActivity.this, "정답입니다", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "정답이 아닙니다", Toast.LENGTH_SHORT).show();
                }

            }
        });
        ClickIcons();
    }

    private  void  ClickIcons(){
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        textView = (TextView)findViewById(R.id.edttext);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num==7){
                    return;
                }
                if (num==6){
                    Toast.makeText(MainActivity.this, "너무 밝아서 안보인다", Toast.LENGTH_SHORT).show();
                }
                if (num==0){
                    Toast.makeText(MainActivity.this, "ㅎ,ㅇ,1", Toast.LENGTH_SHORT).show();
                }
                if (num==1){
                    Toast.makeText(MainActivity.this, "ㅡ,ㅏ,1", Toast.LENGTH_SHORT).show();
                }
                if (num==2){
                    Toast.makeText(MainActivity.this, "ㄱ,ㄴ,살", Toast.LENGTH_SHORT).show();
                }
                if (num==3){
                    Toast.makeText(MainActivity.this, "ㅇ,ㄱ", Toast.LENGTH_SHORT).show();
                }
                if (num==4){
                    Toast.makeText(MainActivity.this, "ㅣ,ㅕ", Toast.LENGTH_SHORT).show();
                }
                if (num==5){
                    Toast.makeText(MainActivity.this, "ㄴ,ㅇ", Toast.LENGTH_SHORT).show();
                }
                color+=0.2f;
                num ++;
                graphicView.invalidate();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num==0){
                    return;
                }
                if (num==1){
                    Toast.makeText(MainActivity.this, "깜깜해서 안보인다", Toast.LENGTH_SHORT).show();
                }
                if (num==2){
                    Toast.makeText(MainActivity.this, "ㅎ,ㅇ,1", Toast.LENGTH_SHORT).show();
                }
                if (num==3){
                    Toast.makeText(MainActivity.this, "ㅡ,ㅣ,1", Toast.LENGTH_SHORT).show();
                }
                if (num==4){
                    Toast.makeText(MainActivity.this, "ㄱ,ㄴ,살", Toast.LENGTH_SHORT).show();
                }
                if (num==5){
                    Toast.makeText(MainActivity.this, "ㅇ,ㄱ", Toast.LENGTH_SHORT).show();
                }
                if (num==6){
                    Toast.makeText(MainActivity.this, "ㅣ,ㅕ", Toast.LENGTH_SHORT).show();
                }
                if (num==7){
                    Toast.makeText(MainActivity.this, "ㄴ,ㅇ", Toast.LENGTH_SHORT).show();
                }
                color-=0.2f;
                num --;
                graphicView.invalidate();
            }
        });
    }
    private static class MyGrapicView extends View{
        public MyGrapicView(Context context){
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            int cenX= this.getWidth()/2;
            int cenY=this.getHeight()/2;
            canvas.scale(1,1,cenX,cenY);
            canvas.rotate(0,cenX,cenY);
            Paint paint = new Paint();
            float [] array = { color ,0,0,0,0,
                    0,color,0,0,0,
                    0,0,color,0,0,
                    0,0,0,1,0};
            ColorMatrix cm = new ColorMatrix(array);
            if (satur ==0)
                cm.setSaturation(satur);
            paint.setColorFilter(new ColorMatrixColorFilter(cm));
            Bitmap picture = BitmapFactory.decodeResource(getResources(),R.drawable.lena256);
            int picX = (this.getWidth() - picture.getWidth()) /2;
            int picY = (this.getHeight() - picture.getHeight()) /2;
            canvas.drawBitmap(picture,picX,picY,paint);
            picture.recycle();
        }

    }


}