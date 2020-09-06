package com.example.introAppRouteCourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class signin extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        spinner=findViewById(R.id.ginder);
}

    public void nextsignin(View view) {
        Intent intent=new Intent(signin.this,loginactivity.class);
        startActivity(intent);
    }
}