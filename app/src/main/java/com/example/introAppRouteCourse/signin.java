package com.example.introAppRouteCourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class signin extends AppCompatActivity {
    Button next_signin_btn;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        next_signin_btn=findViewById(R.id.bottom);
        spinner=findViewById(R.id.ginder);
        next_signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(signin.this,loginactivity.class);
                startActivity(intent);
            }
        });



    }
}