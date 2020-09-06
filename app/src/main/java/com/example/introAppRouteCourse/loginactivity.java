package com.example.introAppRouteCourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginactivity extends AppCompatActivity {
    Button next_login_btn;
    EditText username_et,password_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        username_et=findViewById(R.id.username_et);
        password_et=findViewById(R.id.password_et);
        next_login_btn=(Button)findViewById(R.id.bottom);


    }
    public void Showdialog(String user,String password){
        new AlertDialog.Builder(this)
                .setTitle("Data")
                .setMessage(getString(R.string.user_name_in_message_at_dialog_in_login_activity)+user+ "\n" +
                        getString(R.string.password_in_message_at_dialog_in_login_activity) +password)
                .create()
                .show();
    }

    public void nextlogin(View view) {
        String username=username_et.getText().toString();
        String password=password_et.getText().toString();
        Showdialog(username,password);
    }
}