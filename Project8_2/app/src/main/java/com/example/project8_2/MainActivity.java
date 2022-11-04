package com.example.project8_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRead;
        final EditText edtSD;
        btnRead = (Button) findViewById(R.id.btnRead);
        edtSD = (EditText) findViewById(R.id.edtSD);
        ActivityCompat.requestPermissions(this, new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, MODE_PRIVATE);

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    FileInputStream inFs=new FileInputStream("/storage/emulated/0/asdf.txt");
                 //   InputStream inFs = getResources().openRawResource(R.raw.aaaa);
                    byte[] txt = new byte[inFs.available()];
                    inFs.read(txt);
                    Toast.makeText(MainActivity.this, "11", Toast.LENGTH_SHORT).show();
                    edtSD.setText(new String(txt));
                    inFs.close();


                }
                catch (IOException e){

                }
            }
        });
    }
}