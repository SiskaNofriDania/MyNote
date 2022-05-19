package com.siska.mynote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splashscren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscren);

        Thread timer = new Thread() {
            public void run(){
                try {
                    sleep(3000);
                } catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(Splashscren.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }
}