package com.example.speechconverter;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText E1;
    Button B1;
    TextToSpeech T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=findViewById(R.id.e1);
        B1=findViewById(R.id.b1);
        T1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR){
                    T1.setLanguage(Locale.UK);
                }

            }
        });
    }

    public void texttosound(View v)
    {
        String tospeak = E1.getText().toString();
        T1.speak(tospeak, TextToSpeech.QUEUE_FLUSH, null);
    }
}
