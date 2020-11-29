package com.example.myintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
TextView text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        text3 = findViewById(R.id.text_activity3);
        String s3 = text3.getText().toString();

        String s4 = getIntent().getStringExtra("Str");

        Intent intent3 = new Intent();
        intent3.putExtra("Res", s4 + " " + s3);
        setResult(RESULT_OK, intent3);
        finish();

    }
}