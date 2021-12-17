package com.example.tabhost;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TabHost tabHost = getTabHost();
//
//        TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
//        tabSpecSong.setContent(R.id.tabSong);
//        tabHost.addTab(tabSpecSong);
//
//        TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST")
//                .setIndicator("가수별");
//        tabSpecArtist.setContent(R.id.tabArtist);
//        tabHost.addTab(tabSpecArtist);
//
//        TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
//        tabSpecAlbum.setContent(R.id.tabAlbum);
//        tabHost.addTab(tabSpecAlbum);
//
//        tabHost.setCurrentTab(0);


        TabHost tabHost1 = getTabHost();

        TabSpec tab1 = tabHost1.newTabSpec("DOG").setIndicator("강아쥐");
        tab1.setContent(R.id.iv1);
        tabHost1.addTab(tab1);

        TabSpec tab2 = tabHost1.newTabSpec("CAT").setIndicator("고양이");
        tab2.setContent(R.id.iv2);
        tabHost1.addTab(tab2);

        TabSpec tab3 = tabHost1.newTabSpec("RABBIT").setIndicator("토끼");
        tab3.setContent(R.id.iv3);
        tabHost1.addTab(tab3);

        TabSpec tab4 = tabHost1.newTabSpec("HORSE").setIndicator("말");
        tab4.setContent(R.id.iv4);
        tabHost1.addTab(tab4);

        tabHost1.setCurrentTab(1);
    }
}
