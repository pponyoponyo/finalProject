package com.example.finalproject.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.finalproject.R;

public class ProcessActivity extends AppCompatActivity {

    private String inputUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);

        Intent i = getIntent();
        inputUrl = i.getExtras().getString("url");


    }
}
