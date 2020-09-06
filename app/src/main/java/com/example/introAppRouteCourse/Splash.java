package com.example.introAppRouteCourse;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//بعمل اوفر رايد للميثود اللي في الباس كلاس او البيرنت كلاس
        setContentView(R.layout.activity_splash);//دي ميثود بستخدمها عشان اعرض الاكتيفيتي
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent intent4=new Intent(getApplicationContext() ,loginactivity.class);
                startActivity(intent4);
                //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
                Splash.this.finish();
            }

        }, 3000);

    }
}