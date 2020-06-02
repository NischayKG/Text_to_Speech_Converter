package com.example.speechconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class first_view extends AppCompatActivity {
    Timer tm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_view);
        Toast.makeText(this, "Welcome To Text To Speech Converter App", Toast.LENGTH_LONG).show();
        tm=new Timer();
        tm.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent I=new Intent(first_view.this,MainActivity.class);
                startActivity(I);
                finish();
            }
        },4000);
    }
}
