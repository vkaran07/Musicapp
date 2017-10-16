package com.example.karan.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView music = (TextView) findViewById(R.id.music_player);
        music.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent musicintent = new Intent(MainActivity.this, MusicPlayer.class);
                startActivity(musicintent);
            }
        });
        TextView playlist = (TextView) findViewById(R.id.play_list);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listintent = new Intent(MainActivity.this, List.class);
                startActivity(listintent);
            }
        });
        TextView album = (TextView) findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumintent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumintent);
            }
        });
        TextView search = (TextView) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchintent = new Intent(MainActivity.this, Search.class);
                startActivity(searchintent);
            }
        });
    }
}
