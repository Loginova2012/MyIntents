package com.example.myintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.eText);
    }

    public void onButtonClick(View v){
        if (v.getId() == R.id.but1){
            intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.but2){
            String s1 = text.getText().toString();
            intent = new Intent(MainActivity.this, Activity2.class);
            intent.putExtra("Str", s1);
            startActivity(intent);
        }
        else if (v.getId() == R.id.but3){
            String s2 = text.getText().toString();
            intent = new Intent(MainActivity.this, Activity3.class);
            intent.putExtra("Str", s2);
            startActivityForResult(intent, 1);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 1 && data != null){
            String s5 = data.getStringExtra("Res");
            text.setText(s5);
        }
    }
}