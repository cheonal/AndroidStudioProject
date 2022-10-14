package com.example.project6_4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabdog= tabHost.newTabSpec("SONG").setIndicator("강아지");
        tabdog.setContent(R.id.image1);
        tabHost.addTab(tabdog);

        TabHost.TabSpec tabcat = tabHost.newTabSpec("ARTIST").setIndicator("고양이");
        tabcat.setContent(R.id.image2);
        tabHost.addTab(tabcat);

        TabHost.TabSpec tabrab= tabHost.newTabSpec("ALBUM").setIndicator("토끼");
        tabrab.setContent(R.id.image3);
        tabHost.addTab(tabrab);

        TabHost.TabSpec tabhor= tabHost.newTabSpec("ALBUM").setIndicator("말");
        tabhor.setContent(R.id.image4);
        tabHost.addTab(tabhor);
    }
}