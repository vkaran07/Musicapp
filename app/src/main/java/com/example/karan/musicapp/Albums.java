package com.example.karan.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Albums");
        setContentView(R.layout.activity_albums);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
