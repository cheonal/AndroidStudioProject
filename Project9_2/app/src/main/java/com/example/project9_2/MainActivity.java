package com.example.project9_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageButton ibZommin, ibZoomout, ibRotate, ibBright, ibDark, ibGray;
    MyGrapicView graphicView;

    static  float scaleX = 1, scaleY=1, angel= 0, color=1, satur=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("미니 포토샾");




        LinearLayout pictureLayout = (LinearLayout) findViewById(R.id.pictureLayout);
        graphicView = (MyGrapicView) new MyGrapicView(this);
        pictureLayout.addView(graphicView);

        ClickIcons();

    }
    private  void  ClickIcons(){
        ibZommin = (ImageButton) findViewById(R.id.zoom_in);
        ibZoomout = (ImageButton) findViewById(R.id.zoom_out);
        ibRotate = (ImageButton) findViewById(R.id.rotate);
        ibBright = (ImageButton) findViewById(R.id.bright);
        ibDark = (ImageButton) findViewById(R.id.dark);
        ibGray = (ImageButton) findViewById(R.id.gray);

        ibZommin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scaleX = scaleX +0.2f;
                scaleY = scaleY +0.2f;
                graphicView.invalidate();
            }
        });
        ibZoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scaleX = scaleX -0.2f;
                scaleY = scaleY -0.2f;
                graphicView.invalidate();
            }
        });
        ibRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angel +=20;
                graphicView.invalidate();
            }
        });

        ibBright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color+=0.2f;
                graphicView.invalidate();
            }
        });
        ibDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color-=0.2f;
                graphicView.invalidate();
            }
        });
        ibGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(satur ==0)
                    satur =1;
                else
                    satur =0;
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
            canvas.scale(scaleX,scaleY,cenX,cenY);
            canvas.rotate(angel,cenX,cenY);

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