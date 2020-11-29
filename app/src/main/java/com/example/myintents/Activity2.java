package com.example.myintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text2 = findViewById(R.id.text_activity2);

        String s2 = getIntent().getStringExtra("Str");
        text2.setText(s2);

    }
}