package com.example.androidintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        display = findViewById(R.id.txtDisplay);

        Intent myIntent = getIntent();
        String name = myIntent.getStringExtra("NAME");

        display.setText(name);

    }
}